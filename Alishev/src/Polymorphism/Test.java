package Polymorphism;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Dog();
        Dog dog = new Dog();

        animal.eat();

        dog.eat();
        dog.dog();

        Animal animal1 = new Animal();
        Dog dog1 = new Dog();
        Cat cat = new Cat();

        System.out.println();

        test(animal1);
        test(dog1);
        test(cat);

    }

    public static void test(Animal animal){
        animal.eat();
    }


}

