package ir.maktab.busticket.service.impl;

import ir.maktab.busticket.base.service.impl.BaseServiceImpl;
import ir.maktab.busticket.models.Bus;
import ir.maktab.busticket.repository.BusRepository;
import ir.maktab.busticket.service.BusService;

public class BusServiceImpl extends BaseServiceImpl<Bus, BusRepository,Long> implements BusService {
    public BusServiceImpl(BusRepository repository) {
        super(repository);
    }
}
