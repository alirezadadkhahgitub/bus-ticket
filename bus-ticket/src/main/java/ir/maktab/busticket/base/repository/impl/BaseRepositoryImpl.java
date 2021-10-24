package ir.maktab.busticket.base.repository.impl;


import ir.maktab.busticket.base.domain.BaseEntity;
import ir.maktab.busticket.base.repository.BaseRepository;

import java.io.Serializable;

public abstract class BaseRepositoryImpl<E extends BaseEntity<ID>, ID extends Serializable> implements BaseRepository<E, ID> {

}
