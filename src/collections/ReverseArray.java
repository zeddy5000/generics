package collections;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {33,4,5,66,7,8};
        System.out.println(Arrays.toString(reverseArray(array)));
    }

    private static int[] reverseArray(int[] array) {
        int n = array.length;
        int[] reversedArray = new int[n];
        int i = 0;
        int j = n-1;
        while (i < n){
            reversedArray[i] = array[j];
            i++;
            j--;
        }
        return reversedArray;
    }
}
