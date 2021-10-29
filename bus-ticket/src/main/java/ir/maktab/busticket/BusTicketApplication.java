package ir.maktab.busticket;

import ir.maktab.busticket.models.Bus;
import ir.maktab.busticket.service.BusService;
import ir.maktab.busticket.service.impl.BusServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class BusTicketApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusTicketApplication.class, args);

	}

}
