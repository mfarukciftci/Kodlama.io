
package kodlama.io.corelogging;

public class DatabaseLogger implements LogBase{

    @Override
    public void log(String mesaj) {
        System.out.println("Veritabanına loglandı:" + mesaj);
    }
    
    
}
