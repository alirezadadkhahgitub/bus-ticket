package ir.maktab.busticket.service.impl;

import ir.maktab.busticket.base.service.impl.BaseServiceImpl;
import ir.maktab.busticket.models.Bus;
import ir.maktab.busticket.models.Customer;
import ir.maktab.busticket.repository.BusRepository;
import ir.maktab.busticket.repository.CustomerRepository;
import ir.maktab.busticket.service.BusService;
import ir.maktab.busticket.service.CustomerService;

public class CustomerServiceImpl extends BaseServiceImpl<Customer,CustomerRepository,Long> implements CustomerService {
    public CustomerServiceImpl(CustomerRepository repository) {
        super(repository);
    }
}
