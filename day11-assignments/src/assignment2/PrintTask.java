package assignment2;

/**
 * Created by mandasu on 7/31/2017.
 */
public class PrintTask implements  Runnable   {
    @Override
    public void run() {
        System.out.println("i = : " + ValueTask.i);
    }
}
