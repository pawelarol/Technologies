import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static sun.swing.SwingUtilities2.submit;

public class ExecutorExample {
    public static void main(String[] args) {

        ExecutorService es = Executors.newSingleThreadExecutor();
        Future<?> s   = es.submit(new SingleProcess());
        boolean done = s.isDone();
        System.out.println(done);

        try{
            //Thread.sleep(4000);
            System.out.println("Before get");
            s.get();
            System.out.println("After get");
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        es.shutdown();
    }

    static class SingleProcess implements Runnable
    {
        private String name = null;
        @Override
        public void run() {
            System.out.println("Start");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
           // System.out.println(name.length());
            System.out.println("Finish");
        }
    }
}
