
package kodlama.io.dataaccess.concrets.intructor;

import kodlama.io.dataaccess.abstracts.InstructorDao;
import kodlama.io.entites.Instructor;

public class JdbcInstructorDao implements InstructorDao{

    @Override
    public void add(Instructor instructor) {
        System.out.println("Jdbc ile veritabanına eklendi:  " +instructor.getName() + instructor.getSurname() );}
    
}
