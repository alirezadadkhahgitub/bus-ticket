package ir.maktab.busticket.service;

import ir.maktab.busticket.models.Bus;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BusService  {
    List<Bus> search(Bus bus);
    Bus fidById(Long id);
}
