package Smth;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {

        Animal animal1 = new Animal(2);
        Animal animal2 = new Animal(2);


        System.out.println(animal1);

        System.out.println(animal1.equals(animal2));


        String str1 = "Hello";
        String str2 = "Hello";

        System.out.println(str1.equals(str2));


        String a = "hello";
        String b = "hello123".substring(0,5);
        System.out.println(a);
        System.out.println(b);
        System.out.println(a == b);
        System.out.println(a.equals(b));

    }

}

class Animal{
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        Animal otherAnimal = (Animal) obj;

        return (this.id == otherAnimal.id);

    }

    public String toString() {
        return "Your ID is " + this.id;
    }

}

