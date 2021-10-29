package ir.maktab.busticket.repository;

import ir.maktab.busticket.models.Customer;
import ir.maktab.busticket.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,Long> {
List<Ticket> findAllByCustomer(Customer customer);
}
