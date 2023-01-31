package AbstractClass;

public class Dog extends Animal{

    @Override
    public void eat(){
        System.out.println("DOg is eating");
    }

    @Override
    public void hello() {
        System.out.println("Hello,Dog");
    }
}
