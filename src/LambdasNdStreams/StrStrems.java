package LambdasNdStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StrStrems {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("zed");
        names.add("helen");
        names.add("sam");

        List<String> capsNmanes = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(capsNmanes);
    }
}
