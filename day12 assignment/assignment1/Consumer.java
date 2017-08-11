package assignment1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by mandasu on 8/1/2017.
 */
public class Consumer implements Runnable {
    LinkedBlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();

    public Consumer(LinkedBlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 25; i++) {
            try {
                System.out.println(blockingQueue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}