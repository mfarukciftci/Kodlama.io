
package kodlama.io;


import kodlama.io.business.concreats.CategoryManager;
import kodlama.io.business.concreats.CourseManager;
import kodlama.io.business.concreats.InstructorManager;
import kodlama.io.corelogging.DatabaseLogger;
import kodlama.io.corelogging.FileLogger;
import kodlama.io.corelogging.LogBase;
import kodlama.io.dataaccess.concrets.category.HibernateCategoryDao;
import kodlama.io.dataaccess.concrets.course.HibernateCourseDao;
import kodlama.io.dataaccess.concrets.intructor.JdbcInstructorDao;
import kodlama.io.entites.Category;
import kodlama.io.entites.Course;
import kodlama.io.entites.Instructor;

public class KodlamaIo {

    public static void main(String[] args) throws Exception {
        
        LogBase[] logs = {new DatabaseLogger(), new FileLogger()};
        Category category1 = new Category("Programlama");
        Category category2 = new Category("P");
        
        Category[] categories = {category1};
        
        CategoryManager categorymanager = new CategoryManager(new HibernateCategoryDao(), logs,categories);
        categorymanager.add(category2);
        
        
        Instructor intrctor = new Instructor("Faruk","Çiftçi",23);
        InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), logs);
        instructorManager.add(intrctor);
        
        
        Course course1 = new Course("Java Kursu", 150);
        Course course2 = new Course("C++", 2);
        Course course3 = new Course("C++",150);
        Course[] courses = {course1};
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), logs, courses);
        courseManager.add(course2);
        
        
        
        
    
    }
    
}
