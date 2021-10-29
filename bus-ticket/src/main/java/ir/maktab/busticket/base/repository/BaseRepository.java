//package ir.maktab.busticket.base.repository;
//
//
//import ir.maktab.busticket.base.domain.BaseEntity;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManager;
//import java.io.Serializable;
//import java.util.List;
//
//@Repository
//public interface BaseRepository<E extends BaseEntity<ID>, ID extends Serializable> extends JpaRepository<BaseEntity<Long>, Long> {
//    E findById(ID id);
//
//    void save(E e);
//
//    List<BaseEntity<Long>> findAll();
//
//    void delete(E e);
//
//    void update(E e);
//
//    EntityManager getEntityManager();
//}
