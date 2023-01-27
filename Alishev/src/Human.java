public class Human {
    public static void main(String[] args) {
        HumanClass person = new HumanClass("Tom" , 15);
        HumanClass person1 = new HumanClass("Tom" , 15);
        HumanClass person2 = new HumanClass("Tom" , 15);
        HumanClass person3 = new HumanClass("Tom" , 15);
        HumanClass person4 = new HumanClass("Tom" , 15);

        HumanClass.description = "Hello";

        person.getInfo();
    }

}


class HumanClass{
    private String name;
    private int age;
    private static int count;

    public static String description;

    public HumanClass(){}

    public HumanClass(String name,int age ){
        this.name = name;
        this.age = age;
        count++;
    }
    public void setAge(int age){this.age = age;}
    public void setName(String name){this.name = name;}

    public static void getDescription(){
        System.out.println(description);
    }

    public void getInfo(){
        System.out.println("Name: " + this.name + " Age: " + this.age + " " + "Number is " + count);
    }


}