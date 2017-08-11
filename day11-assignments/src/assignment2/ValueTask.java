package assignment2;

/**
 * Created by mandasu on 7/31/2017.
 */
public class ValueTask implements Runnable {
    static int i=0;
    @Override
    public void run() {
        i++;
    }
}
