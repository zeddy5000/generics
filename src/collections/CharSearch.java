package collections;

import java.util.*;

public class CharSearch {
    public static void main(String[] args) {

        String [] letters = {"Test123", "ola","vic", "zed"};
        List<String> myLetters = new ArrayList<>(Arrays.asList(letters));
        Collections.sort(myLetters);
        System.out.println(myLetters);
        var location = Collections.binarySearch(myLetters, "ola");
        System.out.println(location);
        String name = "ikj";
        System.out.print(findChar(letters, name));

    }
    private static boolean findChar(String [] words, String key){
        for (int i = 0; i < words.length; i++){
            if(words[i] == key){
                return true;
            }
        }
        return false;
    }
}
