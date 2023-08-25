import java.io.File;
import java.io.FilenameFilter;

public class FilterFileList {
    public static void main(String[] args){
        File f = new File("src");
        String [] l = f.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.startsWith("F");
            }
        });

        for(String g : l){
            System.out.println(g);
        }
    }
}
