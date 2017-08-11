package assignment2;

/**
 * Created by mandasu on 7/31/2017.
 */
class WorkerB extends Thread {
    PrintTask printTask = null;

    public WorkerB(PrintTask printTask) {
        this.printTask = printTask;
    }
    @Override
    public void run() {
        printTask.run();
    }
}

