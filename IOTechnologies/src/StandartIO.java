import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class StandartIO {
    public static void main(String[] args) {
       try(InputStream is = new FileInputStream("A:\\java-code\\AntonSaburow\\ExampleIOText.txt");
           OutputStream os = new FileOutputStream("Test.txt")){

           byte [] buffer = new byte[4096];
           int r = is.read(buffer);
           while(r!= -1){
               os.write(buffer,0,r);
               r = is.read(buffer);
           }

       } catch (Exception e){
           e.printStackTrace();
       }


    }
}
