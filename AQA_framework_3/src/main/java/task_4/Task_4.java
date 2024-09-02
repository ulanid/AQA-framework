package task_4;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class Task_4 {
    static CountDownLatch countDownLatch = new CountDownLatch(3);
    static Random random = new Random(123);
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()-> {
            System.out.println("do smth cool");
            sleep();
            System.out.println("finished doing smth cool");
            countDownLatch.countDown();
        });
        Thread t2 = new Thread(()-> {
            System.out.println("do smth crazy");
            sleep();
            System.out.println("finished doing smth crazy");
            countDownLatch.countDown();
        });
        Thread t3 = new Thread(()-> {
            System.out.println("do smth useful");
            sleep();
            System.out.println("finished doing smth useful");
            countDownLatch.countDown();
        });

        t1.start();
        t2.start();
        t3.start();

        countDownLatch.await();

        System.out.println("Fin");
    }
    static void sleep(){
        try {
            Thread.sleep(random.nextInt(999));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

// V2.
// a) Use a CountDownLatch to wait for a set of threads to complete before continuing execution in the main thread.
