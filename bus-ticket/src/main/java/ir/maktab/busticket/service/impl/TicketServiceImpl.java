package ir.maktab.busticket.service.impl;

import ir.maktab.busticket.models.Customer;
import ir.maktab.busticket.models.Ticket;
import ir.maktab.busticket.repository.TicketRepository;
import ir.maktab.busticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    TicketRepository ticketRepository;
    @Override
    public Ticket save(Ticket ticket) {
      return ticketRepository.save(ticket);
    }

    @Override
    public List<Ticket> findAllCustomerTicket(Customer customer) {
        return ticketRepository.findAllByCustomer(customer);
    }

    @Override
    public Optional<Ticket> findById(Long id) {
        return ticketRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
         ticketRepository.deleteById(id);
    }
}
