package assignment22;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by mandasu on 8/9/2017.
 */
public class ArrayOperationsService<T> {
    T[] array;

    public ArrayOperationsService(T[] array) {
        this.array = array;
    }

    public void forEach(Consumer<T> a) {
        for (T value : array) {
            a.accept(value);
        }
    }

    public void modify(Function<T, T> a) {
        for (int i = 0; i < array.length; i++) {
            T e = a.apply(array[i]);
            array[i] = e;
            System.out.println(e);
        }
    }

    public void delete(int value, Predicate<T> a) {
        for (T integer : array) {
            boolean e = a.test(integer);
            if (e == true) {
                System.out.println(e + "found");
                break;
            }
        }

    }

    public void fold(BiFunction<T, Integer, Integer> a) {
        Integer sum=0 ;
        for (int j = 0; j < array.length ; j++) {
            sum = a.apply(array[j],sum);
            System.out.println("array[j]=" + array[j] + "sum=" + sum);
        }
        System.out.println(sum);

    }
}
