package collections;

import java.util.Arrays;

public class AltTab {
    public static void main(String[] args) {
        int[] apps = {4,7,9,8,2};
        int numPressed = 3;
        recentApps(apps,numPressed);
        System.out.println(Arrays.toString(apps));

    }

    private static void recentApps(int[] apps, int numPressed){
        int size = apps.length;
        int appIndex = numPressed%size;
        for(int i =0; i < size; i++){
            if(appIndex > 0){
                int temp = apps[appIndex];
                apps[appIndex] = apps[appIndex-1];
                apps[appIndex-1] = temp;
        }


        }
    }

}
