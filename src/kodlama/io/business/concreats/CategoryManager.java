
package kodlama.io.business.concreats;



import kodlama.io.corelogging.LogBase;
import kodlama.io.dataaccess.abstracts.CategoryDao;
import kodlama.io.entites.Category;

public class CategoryManager  {
    
    private final CategoryDao categoryDao;
    private final LogBase[] loggers;
    private Category[] categories; 

    public CategoryManager(CategoryDao categoryDao, LogBase[] loggers, Category[] categories) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
        this.categories = categories;
    }
    

    

  
    

    
    
    public void add(Category category) throws Exception{
        
        for(Category element: categories){
            if(category.getName().equals(element.getName())){
                throw new Exception("Kurs ismi tekrar edemez");
            }
        }
        
            categoryDao.add(category);
            
            for (LogBase logger : loggers) {
                logger.log(category.getName());
        }
            
            
            
        }
            
        
                }

    
    

