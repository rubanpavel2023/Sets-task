package Sets;

import java.util.Set;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task #1");

        FruitsTask1 setFruits = new FruitsTask1();

        setFruits.addFruit("orange");
        setFruits.addFruit("apple");
        setFruits.addFruit("kiwi");
        setFruits.addFruit("strawberry");
        setFruits.addFruit("mango");

        setFruits.printList();
        setFruits.addFruit("grape");
        setFruits.printList();
        System.out.println();
        //__________________________
        System.out.println("________________________________");

        System.out.println("Task #2");

        FruitsTask2 setFruits2 = new FruitsTask2();

        setFruits2.addFruit("orange");
        setFruits2.addFruit("apple");
        setFruits2.addFruit("kiwi");
        setFruits2.addFruit("strawberry");
        setFruits2.addFruit("mango");

        setFruits2.printList();
        setFruits2.removeFruit("mango");
        setFruits2.printList();




    }
}