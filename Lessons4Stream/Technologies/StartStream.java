import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class StartStream {

    public static final int TASK_COUNT = 5;
    public static void main(String[] args) throws Exception {
        Long summa = 0L;
        System.out.println(System.currentTimeMillis());
       // for(int i = 0; i< 12; i++){
         //   SingleProcess sp = new SingleProcess("ID" + i);
           // sp.start();
        //}
        List<Long> list = new ArrayList<>();

        for (int i = 0; i<10; i++){
            SingleProcess2Runnable sp2 = new SingleProcess2Runnable("ID: " + i, list);
            Thread t = new Thread(sp2);
            t.start();
        }
        System.out.println(System.currentTimeMillis());
        System.out.println(summa);


    }

   /* static class SingleProcess extends Thread
    {

        public void run(){
            process();
        }

        public Long process() {
            Long summa = 0L;
            SecureRandom random = new SecureRandom();
            for (int i = 0; i < StartStream.TASK_COUNT; i++) {
                String g = new BigInteger(500, random).toString(32);
                for (char c : g.toCharArray()) {
                    summa += c;
                }
                System.out.println(name);
            } return summa;
        }
   */ }

     class SingleProcess2Runnable implements Runnable
    {

        private String name;
        private long summa;


        public SingleProcess2Runnable(String name, List<Long> result){
            this.name = name;

        }


        public void run(){
           summa = process();
        }

        public long getSumma() {
            return summa;
        }

        public Long process() {
            Long summa = 0L;
            SecureRandom random = new SecureRandom();
            for (int i = 0; i < StartStream.TASK_COUNT; i++) {
                String g = new BigInteger(500, random).toString(32);
                for (char c : g.toCharArray()) {
                    summa += c;
                }
                System.out.println(name);
            } return summa;
        }
    }

