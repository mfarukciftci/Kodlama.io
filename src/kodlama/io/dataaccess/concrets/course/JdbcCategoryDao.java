
package kodlama.io.dataaccess.concrets.course;

import kodlama.io.dataaccess.abstracts.CategoryDao;
import kodlama.io.entites.Category;

public class JdbcCategoryDao implements CategoryDao{

    @Override
    public void add(Category category) {
        System.out.println("JDBC veritabanına eklendi : " + category.getName());}
    
}
