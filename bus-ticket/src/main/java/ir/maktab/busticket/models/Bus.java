package ir.maktab.busticket.models;

import ir.maktab.busticket.base.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.ZonedDateTime;
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Bus extends BaseEntity<Long> {
    private String origin;
    private String destination;
    private ZonedDateTime ticketDate;
    private ZonedDateTime ticketHour;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tripId;
}
