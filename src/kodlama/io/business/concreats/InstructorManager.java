
package kodlama.io.business.concreats;

import java.util.ArrayList;
import kodlama.io.corelogging.LogBase;
import kodlama.io.dataaccess.abstracts.InstructorDao;
import kodlama.io.entites.Instructor;

public class InstructorManager {
    private InstructorDao insturctorDao;
    private LogBase[] logger;

    public InstructorManager(InstructorDao insturctorDao, LogBase[] logger) {
        this.insturctorDao = insturctorDao;
        this.logger = logger;
    }
    
    public void add(Instructor instructor) throws Exception{
       
        insturctorDao.add(instructor);
        
        for (LogBase logger : logger) {
            logger.log(instructor.getName());
            
        }
    }
    
}
