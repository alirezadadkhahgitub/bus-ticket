//package ir.maktab.busticket.base.repository.impl;
//
//
//import ir.maktab.busticket.base.domain.BaseEntity;
//import ir.maktab.busticket.base.repository.BaseRepository;
//
//import javax.persistence.EntityManager;
//import java.io.Serializable;
//import java.util.List;
//
//public abstract class BaseRepositoryImpl<E extends BaseEntity<ID>, ID extends Serializable> implements BaseRepository<E, ID> {
//    public abstract Class<E> getEntityClass();
//
//    @Override
//    public E findById(ID id) {
//        return entityManager.find(getEntityClass(), id);
//    }
//
//    @Override
//    public void save(E e) {
//        e.setDeleted(false);
//        if (e.getId() == null) {
//            entityManager.persist(e);
//        } else {
//            entityManager.merge(e);
//        }
//
//
//    }
//
//    @Override
//    public List<E> findAll() {
////        try {
//        return entityManager.createQuery(" from " + getEntityClass().getSimpleName(), getEntityClass()).getResultList();
////        }catch (NullPointerException e){
////            return null;
////        }
//    }
//
////    @Override
////    public void softDelete(E e) {
////         e.setDeleted(true);
////         entityManager.merge(e);
////    }
//
//    @Override
//    public void delete(E e) {
//        entityManager.getTransaction().begin();
//        entityManager.remove(e);
//        entityManager.getTransaction().commit();
//    }
//
//    //    @Override
////    public  void update(E e){
////        entityManager.getTransaction().begin();
////            entityManager.merge(e);
////        entityManager.getTransaction().commit();
////    }
//    @Override
//    public Long countAll() {
//        return entityManager.createQuery(
//                "select count(*) from " + getEntityClass().getSimpleName(),
//                Long.class
//        ).getSingleResult();
//    }
//
//    @Override
//    public EntityManager getEntityManager() {
//
//        return entityManager;
//    }
//}
