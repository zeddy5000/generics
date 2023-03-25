package LambdasNdStreams;

import java.util.*;

public class StringStreams {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("zed");
        names.add("sam");
        names.add("helen");
        names.add("faith");

        names.stream()
                .sorted()
                .map((name)->name.toUpperCase())
                .forEach(System.out::println);
        String[] removeNames = {"ZED","ACE","ABBY"};
        String[] addNames = {"ZED","ACE","ABBY","LION","AMOS"};
        List<String> list1 = new ArrayList<>();
        Collections.addAll(list1,addNames);
        List<String> list2 = new ArrayList<>(Arrays.asList(removeNames));
        removeFromList(list1,list2);
        System.out.println(list1);

    }
    private static void removeFromList(Collection<String> list1,Collection<String> list2){
        Iterator<String> iterator =  list1.iterator();
        while (iterator.hasNext()){
            if (list2.contains(iterator.next()))iterator.remove();
        }
    }
}
