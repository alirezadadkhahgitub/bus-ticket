package ir.maktab.busticket.service.impl;

import ir.maktab.busticket.models.Bus;
import ir.maktab.busticket.repository.BusRepository;
import ir.maktab.busticket.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusServiceImpl implements BusService {
    @Autowired
    private BusRepository busRepository;
    @Override
    public List<Bus> search(Bus bus) {

          try {
              return busRepository.findAllByOriginAndDestinationAndTicketDateOrderByTicketHour(bus.getOrigin(),bus.getDestination(),bus.getTicketDate());
          }catch (NullPointerException e){
              return null;
          }

    }

    @Override
    public Bus fidById(Long id) {
        try {
            return busRepository.getById(id);
        }catch (NullPointerException e){
            return  null;
        }

    }
}
