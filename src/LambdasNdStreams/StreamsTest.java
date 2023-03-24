package LambdasNdStreams;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsTest {
    public static void main(String[] args) {
        String numbers = IntStream
                .rangeClosed(1,20)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));
        System.out.println(numbers);
    }
}
