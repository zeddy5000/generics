package collections;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        String [] colors = {"red","blue","green","purple","indigo","violet","black"};
        List<String> mainList = new LinkedList<>();
        Collections.addAll(mainList, colors);
        String [] newColors = {"magenta","cyan","deep blue"};
        List<String> secList = new LinkedList<>();
        Collections.addAll(secList, newColors);
        mainList.addAll(secList);
        System.out.println("This is the appended list" + mainList);


        System.out.println("The uppercase modified list is " + convertToUpperCase(mainList) );
        removeItems(mainList,4,7);
        System.out.println("The modified list contains elements: "+ mainList);
        printReverseList(mainList);
    }

    private static List<String> convertToUpperCase(List<String> list) {
        Iterator<String> iterator = list.listIterator();
        List<String> newList = new LinkedList<>();
        while (iterator.hasNext()){
            String color = iterator.next();
            ((ListIterator<String>)iterator).set(color.toUpperCase());
            newList.add(color);
        }
        return newList;
    }
    private static void removeItems(List<String> list, int start, int end){
        list.subList(start,end).clear();
    }
    private static void printReverseList(List<String> list){
        ListIterator<String> iterator = list.listIterator(list.size());
        System.out.println("The reverse list has elements: ");
        while (iterator.hasPrevious()){
            System.out.print(iterator.previous() + " ");
        }

    }
}
