package assignment2;

/**
 * Created by mandasu on 7/31/2017.
 */
class WorkerA extends Thread {
    ValueTask valueTask = null;

    public WorkerA(ValueTask valueTask) {
        this.valueTask = valueTask;
    }

    @Override
    public void run() {
        valueTask.run();
    }
}
