package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        String [] colors = {"red","blue","green","purple","indigo","violet","black"};
        List<String> mainList = new LinkedList<>();
        for(String color : colors){
            mainList.add(color);
        }
        String [] newColors = {"magenta","cyan","deep blue"};
        List<String> secList = new LinkedList<>();
        for(String color : newColors){
            secList.add(color);
        }
        mainList.addAll(secList);
        secList = null;
        System.out.println("This is the appended list" + mainList);


        System.out.println("The uppercase modified list is " + convertToUpperCase(mainList) );
    }

    private static List<String> convertToUpperCase(List<String> list) {
        Iterator<String> iterator = list.listIterator();
        List<String> newList = new LinkedList<>();
        while (iterator.hasNext()){
            String color = iterator.next().toUpperCase();
            newList.add(color);
        }
        return newList;
    }
}
