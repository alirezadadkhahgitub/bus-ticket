package ir.maktab.busticket.models;

import ir.maktab.busticket.base.domain.BaseEntity;
import ir.maktab.busticket.util.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Ticket extends BaseEntity<Long> {
    @ManyToOne
    private Bus bus;
    private String firstnameAndLastname;
    private Gender gender;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ticketId;


}
