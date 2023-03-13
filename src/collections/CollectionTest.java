package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {
        String [] addColor = {"red","blue","green","yellow","black","violet","indigo"};
        String [] removeColor = {"green","indigo","red"};

        List<String> addList = new ArrayList<>();
        List<String> removeList = new ArrayList<>();

        for(String color : addColor){
            addList.add(color);
        }
        for(String color : removeColor){
            removeList.add(color);
        }
        removeColors(addList,removeList);
        System.out.println("The modified arraylist is "+ addList);
    }

    private static void removeColors(Collection<String> collection1, Collection<String> collection2) {
        Iterator<String> iterator = collection1.iterator();
        while (iterator.hasNext()){
            if(collection2.contains(iterator.next())){
                iterator.remove();
            }
        }
    }
}
