import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Buffer {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("A:\\java-code\\AntonSaburow\\ExampleIOText.txt");
        FileChannel channel = fis.getChannel();
        ByteBuffer bb = ByteBuffer.allocate(4096);
        int r = channel.read(bb);
        while(r != -1){
            bb.flip();
            while(bb.hasRemaining()){
                bb.get();
            }
            bb.clear();
            r = channel.read(bb);
        }

    }
}
