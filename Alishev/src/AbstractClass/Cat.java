package AbstractClass;

public class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("Cat is eating");
    }

    @Override
    public void hello() {
        System.out.println("Hello,Cat");
    }

}
