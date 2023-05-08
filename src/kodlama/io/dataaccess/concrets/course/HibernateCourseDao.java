
package kodlama.io.dataaccess.concrets.course;

import kodlama.io.dataaccess.abstracts.CourseDao;
import kodlama.io.entites.Course;

public class HibernateCourseDao implements  CourseDao{

    @Override
    public void add(Course course) {
        System.out.println("Hibernate veritabanına eklendi " + course.getName());
    }
    
}
