public class ThreadSynchro {
    public static void main(String[] args) throws InterruptedException {
        Counter cnt = new Counter();
        for( int i =0; i<200;i++){
            Process p = new Process(cnt);
            new Thread(p).start();
        }
        Thread.sleep(1000);
        System.out.println(cnt.getCounter());
    }


    static class Counter
    {
        private long counter = 0;

        public  synchronized void increase(){
            counter++;
        }
        public synchronized long getCounter(){
            return counter;
        }
    }

   static class Process implements Runnable
    {
        private final  Counter cnt;

        public Process(Counter counter){
            this.cnt = counter;
        }

        @Override
        public void run() {
            for(int i = 0; i<1000; i++){
                cnt.increase();
            }
        }
    }
}
