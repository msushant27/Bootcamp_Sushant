package assignment3;

/**
 * Created by mandasu on 8/1/2017.
 */
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by kaurk on 8/1/2017.
 */
class ExecutorServiceDemo {

    public static void main(String[] args) {
        Executor executor = Executors.newCachedThreadPool();
            executor.execute(new SumTask());
    }
}

class SumTask implements Runnable {

    public void run() {
        int sum = 0;
        for (int i = 1; i <= 500; i++) {
            sum = sum + i;

        }
        System.out.println(sum);
    }
}