package ir.maktab.busticket.base.service;


import ir.maktab.busticket.base.domain.BaseEntity;

import java.io.Serializable;
import java.util.List;

public interface BaseService<E extends BaseEntity<ID>, ID extends Serializable> {

    E findById(ID id);

    void save(E e);

    List<BaseEntity<Long>> findAll();

    void delete(E e);

    void update(E e);


}
