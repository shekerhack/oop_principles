package polymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PolymorphicCollections {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();

        System.out.println("\n-----Cat Object-----\n");
        cat1.eat();
        cat1.sleep();
        cat1.eat("fish");


        System.out.println("\n-----Dog Object-----\n");
        dog1.eat();
        dog1.sleep();
        dog1.eat("meat");

        System.out.println("\n------Animal Object-----\n");
        Animal animal1 = new Animal();
        animal1.eat(); // Animal eats
        animal1.eat("some food"); // Animal eats some food
        animal1.sleep(); // Animal sleeps

        System.out.println("\n-----Cat and Dog Objects in Animal Shape----\n");

        /*
        Create a Cat and a Dog object in the shape of Animal
        Invoke their eat() and sleep() methods which are zero arg
         */
        Animal animal2 = new Cat();
        animal2.eat(); //Cat eats
        animal2.sleep(); // Cat sleeps

        Animal animal3 = new Dog();
        animal3.eat(); // Dog eats
        animal3.sleep(); // Dog sleeps

        System.out.println("\n-----Array Collection of Animals-----\n");

        // Animal, Cat, Dog

        Animal[] animals = {cat1, dog1, animal1, animal2, animal3};

        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName());
        }

       /*
       Cat
       Dog
       Animal
       Cat
       Dog
        */
        System.out.println("\n-----ArrayList Collection of Animals-----\n");
        // Store all objects in an ArrayList and execute eat() method for each other

        ArrayList<Animal> animalArrayList = new ArrayList<>();
        animalArrayList.add(cat1);
        animalArrayList.add(dog1);
        animalArrayList.add(animal1);
        animalArrayList.add(animal2);
        animalArrayList.add(animal3);

        // Other way
        Collections.addAll(animalArrayList,animals);

        // Other way
        ArrayList<Animal> animalArrayList2 = new ArrayList<>(Arrays.asList(animals));
        animalArrayList2.forEach(Animal::eat);

        // Other way
        new ArrayList<>(Arrays.asList(animals)).forEach(Animal::eat); // Anonymous object
    }
}
