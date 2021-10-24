package ir.maktab.busticket.models;

import ir.maktab.busticket.base.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Customer extends BaseEntity<Long> {
    private String username;
    private String password;
    private String email;

}
