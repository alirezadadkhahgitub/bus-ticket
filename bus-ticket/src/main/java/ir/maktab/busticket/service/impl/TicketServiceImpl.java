package ir.maktab.busticket.service.impl;

import ir.maktab.busticket.base.service.impl.BaseServiceImpl;
import ir.maktab.busticket.models.Ticket;
import ir.maktab.busticket.repository.TicketRepository;
import ir.maktab.busticket.service.TicketService;

public class TicketServiceImpl extends BaseServiceImpl<Ticket,TicketRepository,Long> implements TicketService {
    public TicketServiceImpl(TicketRepository repository) {
        super(repository);
    }
}
