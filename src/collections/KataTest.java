package collections;

import java.security.SecureRandom;
import java.util.Arrays;

public class KataTest {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(1,99);
        }
        System.out.println(Arrays.toString(numbers));
        mergeSort(numbers);
    }
    private static void mergeSort(int[] array){
        int size = array.length;
        int midPoint = size/2;
        int[] leftArray = new int[midPoint];
        int[] rightArray = new int[size-midPoint];

        for (int i = 0; i < midPoint; i++){
            leftArray[i] = array[i];
        }
        for (int i = midPoint; i < size; i++ ){
            rightArray[i - midPoint] = array[i];
        }
        mergeParts(leftArray,rightArray,array);

    }
    private static void mergeParts(int[] leftArray, int[] rightArray,int[] finalArray){
        int i = 0, j = 0, k = 0;
        while (leftArray[i] < rightArray[j] && k < finalArray.length){

        }
    }
}
