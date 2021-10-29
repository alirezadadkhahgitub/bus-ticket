package ir.maktab.busticket.repository;

import ir.maktab.busticket.models.Bus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;

@Repository
public interface BusRepository extends JpaRepository<Bus,Long> {
    List<Bus> findAllByOriginAndDestinationAndTicketDateOrderByTicketHour(String origin, String destination,Date ticketDate);
}
