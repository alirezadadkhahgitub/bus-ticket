package ir.maktab.busticket.controller;

import ir.maktab.busticket.models.Bus;
import ir.maktab.busticket.service.impl.BusServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class BusController {
    @Autowired
    BusServiceImpl busService;


    private Bus bus;

    @GetMapping("/search")
    public String search(Model model,Bus bus1) {
        List<Bus> buses = busService.search(this.bus);
        model.addAttribute("buses", buses);
        return "showbus";
    }

    @GetMapping("/trip-form")
    public String tripForm(@Valid Bus bus, Model model) {
        this.bus = bus;

        return "redirect:/search";
    }

    @GetMapping("/searchBus")
    public String searchBus(Bus bus) {
        return "search";
    }


}
