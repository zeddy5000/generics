package collections;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MyTasks {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("zeddy");
        list1.add("helen");

        String[] names = list1.toArray(new String[list1.size()]);
        System.out.println(Arrays.toString(names));
    }
}
