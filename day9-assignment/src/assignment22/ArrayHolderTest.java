package assignment22;

import java.util.function.Consumer;

/**
 * Created by mandasu on 7/28/2017.
 */
public class ArrayHolderTest {
    public static void main(String[] args) {

        try {
            Integer[] array = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            ArrayOperationsService<Integer> arrayOperationsService = new ArrayOperationsService(array);
            arrayOperationsService.forEach((Integer value1) -> {
                System.out.println(value1);
            });

            arrayOperationsService.modify((Integer value1) -> {
                return value1 * 2;
            });

            arrayOperationsService.delete(2, (Integer value1) -> {
                for (int i = 0; i < arrayOperationsService.array.length; i++) {
                    if (array[i] == value1) {
                        for (int j = i; j < arrayOperationsService.array.length - 1; j++) {
                            arrayOperationsService.array[j] = arrayOperationsService.array[j + 1];
                        }
                        arrayOperationsService.array[arrayOperationsService.array.length - 1] = null;
                        Integer[] newArray = new Integer[arrayOperationsService.array.length-1];
                        for (int k = 0; k < arrayOperationsService.array.length-1; k++) {
                            newArray[k] = arrayOperationsService.array[k];
                        }
                        arrayOperationsService.array=newArray;
                        return true;
                    }
                }
                return false;
            });
            arrayOperationsService.forEach((Integer value1) -> {
                System.out.println(value1 + " ");
            });

            arrayOperationsService.fold((Integer value1, Integer value2) -> {
                return (value1 + value2);
            });
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
