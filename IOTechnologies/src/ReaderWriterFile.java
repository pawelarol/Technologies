import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

public class ReaderWriterFile {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("A:\\java-code\\AntonSaburow\\ExampleIOText.txt");
        FileOutputStream fos = new FileOutputStream("TesFile");

        FileChannel inChannel = fis.getChannel();
        FileChannel outChannel = fos.getChannel();

        inChannel.transferTo(0, inChannel.size(), outChannel);

        fis.close();
        fos.close();
    }
}
