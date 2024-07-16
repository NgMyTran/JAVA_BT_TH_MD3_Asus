package session15.bussiness;

import session15.entity.Product;

public interface IProductDesign extends IGenericDesign<Product, Integer> {
    Product findByName(String name);

//    Product findById(Integer id);

    boolean existByCategoryId(Integer catId);
}
