package kodlama.io.dataaccess.concrets.category;

import kodlama.io.dataaccess.abstracts.CategoryDao;
import kodlama.io.entites.Category;

public class JdbcCategoryDao implements CategoryDao{

    @Override
    public void add(Category category) {
        System.out.println("Jdbc ile veritabanına eklendi" + category.getName());
    }
    
}
