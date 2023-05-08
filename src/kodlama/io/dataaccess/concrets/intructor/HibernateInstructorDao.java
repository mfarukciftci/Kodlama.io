
package kodlama.io.dataaccess.concrets.intructor;

import kodlama.io.dataaccess.abstracts.InstructorDao;
import kodlama.io.entites.Instructor;


public class HibernateInstructorDao implements InstructorDao{

    @Override
    public void add(Instructor instructor) {
        System.out.println("Hibernate ile veritabanına eklendi" + instructor.getName() + instructor.getSurname());    }
    
}
