import java.io.*;

public class MakeString {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("Test.txt");
        Reader fr = new InputStreamReader(fis, "utf-8");
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();
        while(line != null){
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
        fr.close();
        fis.close();
    }
}
