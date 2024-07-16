package session15.bussiness;

import session15.entity.Category;
import session15.util.IOFile;

import java.util.List;

public class CategoryBusiness implements ICategoriesDesign {
    ProductBusiness productBusiness = new ProductBusiness();
    public static List<Category> categories;

    public CategoryBusiness() {
        categories = IOFile.readFromFile(IOFile.CATEGORY_PATH);
    }

    @Override
    public boolean create(Category category) {
        categories.add(category);
        IOFile.writeToFile(IOFile.CATEGORY_PATH, categories);
        return true;
    }

    @Override
    public List<Category> findAll() {
        return categories;
    }

    @Override
    public boolean update(Category category) {
        categories.set(categories.indexOf(findById(category.getId())), category);
        IOFile.writeToFile(IOFile.CATEGORY_PATH, categories);
        return true;
    }

    @Override
    public boolean deleteById(Integer id) {
        categories.removeIf(category -> category.getId() == id);
        IOFile.writeToFile(IOFile.CATEGORY_PATH, categories);
        return true;
    }

    @Override
    public Category findById(Integer id) {
        for (Category cat : categories) {
            if (cat.getId() == id) {
                return cat;
            }
        }
        return null;
    }

//    @Override
//    public boolean existProductsByCategoryId(int id) {
//        // Assuming you have a method to get products associated with a category
//        boolean products = productBusiness.existByCategoryId(id);
//        return !products.isEmpty(); // Return true if products exist, false otherwise
//
//    }

//
//    public boolean existProductsByCategoryId(Integer id) {
//        List<Product> products = productBusiness.existByCategoryId(id);
//        return !products.isEmpty(); // Return true if products exist, false otherwise
//    }

}
