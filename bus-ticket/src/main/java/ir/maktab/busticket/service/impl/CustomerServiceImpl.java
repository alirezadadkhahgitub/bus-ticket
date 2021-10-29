package ir.maktab.busticket.service.impl;

import ir.maktab.busticket.models.Customer;
import ir.maktab.busticket.repository.CustomerRepository;
import ir.maktab.busticket.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer login(Customer customer) {
        try {
            return customerRepository.findByUsernameAndPassword(customer.getUsername(),customer.getPassword());
        } catch (NullPointerException e) {
            return null;
        }

    }
}
