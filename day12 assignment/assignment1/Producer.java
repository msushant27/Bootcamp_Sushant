package assignment1;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by mandasu on 8/1/2017.
 */
public class Producer implements Runnable {
    LinkedBlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();

    public Producer(LinkedBlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 25; i++) {
            try {
                blockingQueue.put(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}