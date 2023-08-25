import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.function.DoubleToIntFunction;

public class BufferReaderWriter {
    public static void main(String[] args) throws Exception {
        FileInputStream fi = new FileInputStream("A:\\java-code\\AntonSaburow\\ExampleIOText.txt");
        FileOutputStream fo = new FileOutputStream("new.txt");

        FileChannel fic = fi.getChannel();
        FileChannel foc = fo.getChannel();

        ByteBuffer inB = ByteBuffer.allocate(4096);
        ByteBuffer ouB = ByteBuffer.allocate(4096);

        int r = fic.read(inB);
        while( r != -1){
            inB.flip();
            while(inB.hasRemaining()){
                byte get = inB.get();
                ouB.put(get);
            }
            ouB.flip();
            foc.write(ouB);
            inB.clear();
            ouB.clear();
            r = fic.read(inB);
        }
        fic.close();
        foc.close();
    }
}
