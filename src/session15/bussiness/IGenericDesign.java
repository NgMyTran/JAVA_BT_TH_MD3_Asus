package session15.bussiness;

import java.util.List;

public interface IGenericDesign<T, E> {
    //    void create(T t);
//
//    //    Chỉnh sửa:
//    void update(T t);
//
//    //    Xóa:
//    void deleteById(E id);
//
//    //    Tìm theo id:
//    Optional<T> findById(E id);
//
//    //    Tìm tất cả:
//    List<T> findAll(E id);
    boolean create(T t);

    List<T> findAll();

    boolean update(T t);

    boolean deleteById(E id);

    T findById(E id);
}
