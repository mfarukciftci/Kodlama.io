
package kodlama.io.corelogging;


public class FileLogger implements LogBase{

    @Override
    public void log(String mesaj) {
        System.out.println("Dosya'ya loglandı: " + mesaj);    }
    
}
