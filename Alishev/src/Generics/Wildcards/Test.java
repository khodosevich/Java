package Generics.Wildcards;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog(6));
        dogs.add(new Dog(5));


        test(listOfAnimal);
        test(dogs);

    }


    private static void test(List<? extends Animal> list){
        for (Animal el : list){
           el.eat();
        }
    }
}
