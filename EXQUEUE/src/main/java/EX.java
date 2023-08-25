import java.util.ArrayDeque;
import java.util.Queue;
public class EX {
        public static void main(String[] args) {
            Queue<HeavyBox> qe = new ArrayDeque<>();

            boolean success1 = qe.offer(new HeavyBox(1, 2, 3));
            boolean success2 = qe.offer(new HeavyBox(2, 2, 2));
            boolean success3 = qe.offer(new HeavyBox(3, 3, 3));

            System.out.println(success1);
            System.out.println(success2);
            System.out.println(success3);

            while(!qe.isEmpty()){
                HeavyBox deleteQueue = qe.poll();
                System.out.println("Element delete: " + deleteQueue);
            }

            System.out.println(qe.isEmpty());
        }
    }


