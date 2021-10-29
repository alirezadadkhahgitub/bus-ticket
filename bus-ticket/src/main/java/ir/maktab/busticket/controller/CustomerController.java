package ir.maktab.busticket.controller;

import ir.maktab.busticket.models.Customer;
import ir.maktab.busticket.service.impl.CustomerServiceImpl;
import ir.maktab.busticket.util.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class CustomerController {
    @Autowired
    CustomerServiceImpl customerService;


    @PostMapping("/customer-login")
    public String login2(@Valid Customer customer, Model model) {

        if (customerService.login(customer) != null) {
            ApplicationContext.session.setAttribute("customer", customerService.login(customer));
            return "homepage";
        }
        return "loginpage";

    }

    @GetMapping("/loginpage")
    public String login(Customer customer) {
        return "loginpage";
    }


}
