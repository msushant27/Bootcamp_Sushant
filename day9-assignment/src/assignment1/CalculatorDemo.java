package assignment1;

/**
 * Created by mandasu on 7/28/2017.
 */
public class CalculatorDemo {
    public static void main(String[] args) {
        CalculatorService.calculation( 1,2, (int a, int b) -> {
            System.out.printf("sum of %d and %d is = %d  %n", a,b,a+b);
        });
        CalculatorService.calculation( 6,2, (int a, int b) -> {
            System.out.printf("difference of %d and %d is = %d  %n", a,b,a-b);
        });
        CalculatorService.calculation( 3,2, (int a, int b) -> {
            System.out.printf("multiplication of %d and %d is = %d  %n", a,b,a*b);
        });
        CalculatorService.calculation( 10,2, (int a, int b) -> {
            System.out.printf("division of %d and %d is = %d  %n", a,b,a/b);
        });
    }
}

