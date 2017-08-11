package assignment1;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by mandasu on 8/1/2017.
 */

public class TaskDemo {
    public static void main(String[] args) {
        new TaskDemo();
    }

    public TaskDemo(){
        LinkedBlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();
        Thread thread1 = new Thread(new Consumer(blockingQueue));
        thread1.start();
        Thread thread2 = new Thread(new Producer(blockingQueue));
        thread2.start();
    }

}