
package kodlama.io.business.concreats;


import java.util.ArrayList;
import kodlama.io.corelogging.LogBase;
import kodlama.io.dataaccess.abstracts.CourseDao;
import kodlama.io.entites.Course;

public class CourseManager {
    private CourseDao courseDao;
    private LogBase[] loggers;
    private Course[] courses;

    public CourseManager(CourseDao courseDao, LogBase[] loggers, Course[] courses) {
        this.courseDao = courseDao;
        this.loggers = loggers;
        this.courses = courses;
    }
    
    
   
    
    public void add(Course course) throws Exception{
        for (Course course1 : courses) {
            if(course.getPrice() < 0 || course.getName().equals(course1.getName())){
                throw new Exception("Olduramadık");
            }
        }
        courseDao.add(course);
        
        for (LogBase logger : loggers) {
            logger.log(course.getName());
            
        }
    }
    
    
    
}
