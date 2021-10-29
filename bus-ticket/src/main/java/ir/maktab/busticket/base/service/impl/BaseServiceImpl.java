//package ir.maktab.busticket.base.service.impl;
//
//
//import ir.maktab.busticket.base.domain.BaseEntity;
//import ir.maktab.busticket.base.repository.BaseRepository;
//import ir.maktab.busticket.base.service.BaseService;
//
//import java.io.Serializable;
//import java.util.List;
//
//public class BaseServiceImpl<E extends BaseEntity<ID>, R extends BaseRepository<E, ID>, ID extends Serializable> implements BaseService<E, ID> {
//    protected final R repository;
//
//    public BaseServiceImpl(R repository) {
//        this.repository = repository;
//    }
//
//
//    @Override
//    public E findById(ID id) {
//        return repository.findById(id);
//    }
//
//    @Override
//    public void save(E e) {
//        repository.getEntityManager().getTransaction().begin();
//        repository.save(e);
//        repository.getEntityManager().getTransaction().commit();
//    }
//
//    @Override
//    public List<BaseEntity<Long>> findAll() {
//        return repository.findAll();
//    }
//
//    @Override
//    public void delete(E e) {
//        repository.delete(e);
//    }
//
//    @Override
//    public void update(E e) {
//        repository.update(e);
//    }
//}
