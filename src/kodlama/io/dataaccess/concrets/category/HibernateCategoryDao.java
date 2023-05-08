
package kodlama.io.dataaccess.concrets.category;

import kodlama.io.dataaccess.abstracts.CategoryDao;
import kodlama.io.entites.Category;

public class HibernateCategoryDao implements CategoryDao{

    @Override
    public void add(Category category) {
        System.out.println("Hibernate ile veritabanına eklendi " + category.getName()) ;
    }
    
}
