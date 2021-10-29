package ir.maktab.busticket.models;

import ir.maktab.busticket.base.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.ZonedDateTime;
import java.util.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Bus extends BaseEntity<Long> {
    private String origin;
    private String destination;
    @Column(columnDefinition = "DATE")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date ticketDate;
    @Column(columnDefinition = "TIME")
    private ZonedDateTime ticketHour;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tripId;
}
