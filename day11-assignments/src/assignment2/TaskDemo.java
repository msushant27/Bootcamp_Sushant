package assignment2;

/**
 * Created by mandasu on 7/31/2017.
 */
public class TaskDemo {
    public static void main(String[] args) {
        for(int i = 0; i<20 ; i++) {
            WorkerA workerA = new WorkerA(new ValueTask());
            WorkerB workerB = new WorkerB(new PrintTask());
            workerA.start();
            workerB.start();
        }
    }
}



