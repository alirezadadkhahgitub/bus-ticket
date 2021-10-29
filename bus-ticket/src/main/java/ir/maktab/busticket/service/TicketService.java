package ir.maktab.busticket.service;

import ir.maktab.busticket.models.Customer;
import ir.maktab.busticket.models.Ticket;

import java.util.List;
import java.util.Optional;

public interface TicketService  {
    Ticket save(Ticket ticket);
    List<Ticket> findAllCustomerTicket(Customer customer);
    Optional<Ticket> findById(Long id);
    void deleteById(Long id);
}
