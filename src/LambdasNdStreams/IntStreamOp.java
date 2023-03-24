package LambdasNdStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamOp {
    public static void main(String[] args) {
        int[] values = {2,4,5,6,7,8,9,6,4,3,2,445,66,7};
        int min = IntStream.of(values).min().getAsInt();
        System.out.println(min);
        double avg = IntStream.of(values).average().getAsDouble();
        System.out.println(avg);

        int[] nums  = {2,3,4,5,6};
        int sum = IntStream.of(nums)
                .reduce(0,(x,y)->x + y);
        System.out.println(sum);
        var product = IntStream.of(nums)
                .reduce((x,y)-> x*y);
        System.out.println(product);

        ArrayList<Integer> greaterThan4 = new ArrayList<>();
        greaterThan4.add(2);
        greaterThan4.add(6);
        greaterThan4.add(1);
        greaterThan4.add(5);

        List<Integer> g4 = greaterThan4.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(g4);

    }
}
