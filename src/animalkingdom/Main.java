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

        System.out.println("\n***Animals By Movement***");
        myList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        myList.forEach(animal -> System.out.println(animal.getName() + " " + animal.move()));

        System.out.println("\n***Animals That Breathe With Lungs ***");
        filter(myList, animal -> animal.breathe().equalsIgnoreCase("lungs"));
        filteredList.forEach(animal -> System.out.println(animal.getName() + " uses " + animal.breathe()));

        System.out.println("\n***Animals That Breathe With Lungs and Were Named in 1758 ***");
        filter(myList, animal -> animal.breathe().equalsIgnoreCase("lungs") && animal.getYear() == 1758);
        filteredList.forEach(animal -> System.out
                .println(animal.getName() + " uses " + animal.breathe() + " and was named in " + animal.getYear()));

        System.out.println("\n***Animals That Breathe With Lungs and Lay Eggs ***");
        filter(myList,
                animal -> animal.breathe().equalsIgnoreCase("lungs") && animal.reproduce().equalsIgnoreCase("eggs"));
        filteredList.forEach(animal -> System.out
                .println(animal.getName() + " uses " + animal.breathe() + " and reproduces by " + animal.reproduce()));

        System.out.println("\n***Animals That Were Named in 1758 Sorted Alphabetically ***");
        filter(myList, animal -> animal.getYear() == 1758);
        filteredList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        filteredList.forEach(animal -> System.out.println(animal.getName() + " was named in " + animal.getYear()));
    }
}