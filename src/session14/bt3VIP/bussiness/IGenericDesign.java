package session14.bt3VIP.bussiness;

import java.util.List;
import java.util.Optional;

public interface IGenericDesign <T,E>{
    void create(T t);
    List<T> findAll();
    void update(T t);
    void delete(E id);
    Optional<T> findById(E id);
}
