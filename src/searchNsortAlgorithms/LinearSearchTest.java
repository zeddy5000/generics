package searchNsortAlgorithms;

import java.security.SecureRandom;

public class LinearSearchTest {
    public static void main(String[] args) {
        SecureRandom generator = new SecureRandom();
        int[] randomNumbers = new int[20];
        for(int i = 0; i < randomNumbers.length; i++){
            randomNumbers[i] = generator.nextInt(100);
        }
        System.out.println(linearSaerch(randomNumbers,5));

    }
    private static int linearSaerch(int[] array,int key){
        for (int index = 0; index < array.length; index++){
            if(array[index] == key){
                return index;
            }
        }
        return -1;
    }
}
