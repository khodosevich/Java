import javax.swing.plaf.PanelUI;

public class Object {
    public static void main(String[] args) {

        Person1 p1 = new Person1("Bob", 19);
        System.out.println(p1);

    }
}

class Person1{
    private String Name;
    private int age;

    public Person1(String Name,int age){
        this.Name = Name;
        this.age = age;
    }

    public String toString(){
        return     Name + ","+ age;
    }


}