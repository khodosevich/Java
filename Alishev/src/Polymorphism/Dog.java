package Polymorphism;

public class Dog extends Animal {

    public void dog(){
        System.out.println("Method for dog");
    }

    @Override
    public void eat(){
        System.out.println("Dog is eating");
    }


}
