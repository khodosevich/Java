package AbstractClass;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.eat();
        cat.hello();

        System.out.println();

        dog.eat();
        dog.hello();

    }
}
