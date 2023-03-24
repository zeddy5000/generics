package collections;

import java.util.Arrays;

public class buSort {
    public static void main(String[] args) {
        int[] numbers = {3,5,6,4,1,2};
        bubbleSrt(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    private static void bubbleSrt(int[] array) {
        for (int i = 0; i < array.length-1; i++){
            for (int j = i; j < array.length-1; j++){
                int temp = array[j];
                if (array[j] > array[j +1]){
                    array[j] = array[j + 1];
                    array[j+1] = temp;
                }
            }
        }
    }

}
