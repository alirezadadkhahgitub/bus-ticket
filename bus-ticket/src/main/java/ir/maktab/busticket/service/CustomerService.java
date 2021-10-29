package ir.maktab.busticket.service;

import ir.maktab.busticket.models.Customer;
import org.springframework.stereotype.Service;

public interface CustomerService  {
    public Customer login(Customer customer);
}
