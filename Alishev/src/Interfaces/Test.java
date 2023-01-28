package Interfaces;

public class Test{
    public static void main(String[] args) {

        Animal animal = new Animal(12);
        Person person = new Person("Jonh");

        animal.Sleep();
        person.sayHello();

        animal.showInfo();
        person.showInfo();

        Info info1 = new Animal(99);
        Info info2 = new Person("Bob");
        info1.showInfo();
        info2.showInfo();

        outputInfo(animal);
        outputInfo(person);

    }

    public static void outputInfo(Info info){
        info.showInfo();
    }

}

