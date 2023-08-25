import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallableExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        int ap = Runtime.getRuntime().availableProcessors();
        System.out.println(ap);

        ExecutorService es = Executors.newFixedThreadPool(5);

        List<Future<String>> list  = new ArrayList<>();

        for(int i = 0; i<5; i++){
            SingleProcess sp = new SingleProcess();
            Future<String> ft  = es.submit(sp);
            list.add(ft);
        }

        for(Future<String> f : list){
            String answer = f.get();
            System.out.println(answer);
        }

        es.shutdown();

    }

    static class SingleProcess implements Callable<String> {

        private  String name = null;

         public String call(){
            try{
                System.out.println("Start");
                Thread.sleep(3000 +((int) (Math.random() *1000)));
            } catch(InterruptedException ex){
            }
            return "String";
        }
    }
}
