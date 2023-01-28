public class Lesson25 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();

        System.out.println("\n");

        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.bark();
        dog.name = "Baikal" ;
        dog.showName();
    }
}
