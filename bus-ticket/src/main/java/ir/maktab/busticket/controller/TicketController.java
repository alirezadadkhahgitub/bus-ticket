package ir.maktab.busticket.controller;

import ir.maktab.busticket.models.Bus;
import ir.maktab.busticket.models.Customer;
import ir.maktab.busticket.models.Ticket;
import ir.maktab.busticket.service.BusService;
import ir.maktab.busticket.service.TicketService;
import ir.maktab.busticket.util.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
public class TicketController {

    TicketService ticketService;

    BusService busService;

    CustomerController customerController;

    @Autowired
    public TicketController(TicketService ticketService, BusService busService, CustomerController customerController) {
        this.ticketService = ticketService;
        this.busService = busService;
        this.customerController = customerController;
    }

    private Ticket ticket;

    @GetMapping("/buyTicket")
    public String buyTicket(@Valid Bus bus1, Model model, Ticket ticket) {
        Bus bus = busService.fidById(bus1.getId());
        this.ticket = new Ticket();
        this.ticket.setBus(bus);
        return "purchaseform";
    }

    @GetMapping("/buyTicket2")
    public String buyTicket2(@Valid Ticket ticket, Model model) {
        System.out.println(ticket.getGender());
        this.ticket.setGender(ticket.getGender());
        this.ticket.setFirstnameAndLastname(ticket.getFirstnameAndLastname());
        this.ticket.setCustomer((Customer) ApplicationContext.session.getAttribute("customer"));
        ticket = ticketService.save(this.ticket);
        model.addAttribute("ticket", ticket);
        return "successful";
    }

    @GetMapping("/showCustomerTicket")
    public String showCustomerTicket(Model model) {
        Customer customer = (Customer) ApplicationContext.session.getAttribute("customer");
        List<Ticket> tickets = ticketService.findAllCustomerTicket(customer);
        model.addAttribute("tickets", tickets);
        return "showcustomerticket";
    }

    @GetMapping("/showByDetails")
    public String showByDetails(Ticket ticket1, Model model) {
        Optional<Ticket> ticket = ticketService.findById(ticket1.getId());
        model.addAttribute("ticket", ticket.get());
        return "showticketbydetails";
    }

    @GetMapping("/deleteTicket")
    public String deleteTicket(Ticket ticket1) {
        ticketService.deleteById(ticket1.getId());
        return "homepage";
    }
}
