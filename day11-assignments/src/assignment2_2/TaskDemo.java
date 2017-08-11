package assignment2_2;

/**
 * Created by mandasu on 7/31/2017.
 */
public class TaskDemo implements Runnable{
    public static  int val = 0;
    @Override
    public  void run(){
        for( int i = 0; i< 20; i++) {
            val++;
        }
    }

    public void printTask(int val) {
        System.out.println( "value  =  : " + TaskDemo.val);
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new TaskDemo());
        thread.start();
        Thread thread1 = new Thread( () -> {
            for( int i =0 ; i<20; i++ ){
                System.out.println(val);
            }
        } );
        thread1.start();
    }


}
