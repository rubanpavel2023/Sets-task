package Sets;

import java.util.HashSet;
import java.util.Set;

public class FruitsTask1 {

    Set<String> setFruit;
    private boolean isFirstList = true;


    public FruitsTask1() {
        setFruit = new HashSet<>();
    }

    public void addFruit(String fruit) {
        setFruit.add(fruit);
    }

    public void printList() {
        if (isFirstList) {
            System.out.println("Initial data");
            isFirstList = false;
        } else {
            System.out.println("Updated data");
        }
        int index = 1;
        for (String fruit : setFruit) {
            System.out.println(index + ") " + fruit);
            index++;
        }
        System.out.println();
    }
}
