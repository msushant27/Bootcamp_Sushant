package assignment2;

import org.junit.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by mandasu on 8/2/2017.
 */
public class PrimeNumberAddition {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        Future<Integer> future1 = executor.submit(() -> {   // 1 and 101
            return primeAdder(1, 100);
        });

        Future<Integer> future2 = executor.submit(() -> {  // 101 and 200
            return primeAdder(101, 200);
        });

        Future<Integer> future3 = executor.submit(() -> {        // 201 and 300
            return primeAdder(201, 300);
        });

        Future<Integer> future4 = executor.submit(() -> {   // 301 and 400
            return primeAdder(301, 400);
        });

        Future<Integer> future5 = executor.submit(() -> {  //401 and 500
            return primeAdder(401, 500);
        });

        try {
            System.out.println(future1.get() + future2.get() + future3.get() + future4.get() + future5.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }

    public static int primeAdder(int s1, int s2) {                    //function to check whether number is prime or not
        int sum = 0, flag = 0;
        for (int i = s1; i <= s2; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                } else {
                    flag = 1;
                }
            }
            if (flag == 1) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
