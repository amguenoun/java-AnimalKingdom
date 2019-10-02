package animalkingdom;

import java.util.*;

public class Main {
    public static ArrayList<Animal> filteredList = new ArrayList<Animal>();

    public static void filter(ArrayList<Animal> list, TestAnimal tester) {
        filteredList.clear();
        for (Animal a : list) {
            if (tester.test(a)) {
                filteredList.add(a);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Animal> myList = new ArrayList<>();
        // Add Mammals
        myList.add(new Mammal("Panda", 1869));
        myList.add(new Mammal("Zebra", 1778));
        myList.add(new Mammal("Koala", 1816));
        myList.add(new Mammal("Sloth", 1804));
        myList.add(new Mammal("Armadillo", 1758));
        myList.add(new Mammal("Raccoon", 1758));
        myList.add(new Mammal("Bigfoot", 2021));

        // Add Birds
        myList.add(new Bird("Pigeon", 1837));
        myList.add(new Bird("Peacock", 1821));
        myList.add(new Bird("Toucan", 1758));
        myList.add(new Bird("Parrot", 1824));
        myList.add(new Bird("Swan", 1758));

        // Add Fish
        myList.add(new Fish("Salmon", 1758));
        myList.add(new Fish("Catfish", 1817));
        myList.add(new Fish("Perch", 1758));

        System.out.println("\n***Animals By Descending Year***");
        myList.sort((a1, a2) -> a2.getYear() - a1.getYear());
        myList.forEach(animal -> System.out.println(animal));

        System.out.println("\n***Animals By Alphabetically***");
        myList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        myList.forEach(animal -> System.out.println(animal));
    }
}