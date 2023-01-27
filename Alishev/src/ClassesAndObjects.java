public class ClassesAndObjects {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setName("Tom");
        person1.setAge(15);
        person1.getInfo();
        person1.sayHello();
        int years = person1.calcAgeToRetirement();
        System.out.println("До пенсии " + years);

        System.out.println();

        Person person2 = new Person("Sasha",21);
        person2.getInfo();
        System.out.println("Возраст: " + person2.getAge());
        person2.calcSalary(1300);
    }
}

class Person{

     private String name;
     private int age;

     public void setName(String name){this.name = name;}

     public void setAge(int age){this.age = age;}

     public String getName(){
         return this.name;
     }

     public int getAge(){
         return this.age;
     }

     Person (){}

    Person(String name , int age){
        this.name = name;
        this.age = age;
    }

    public void getInfo(){
        System.out.println("Your name is " + this.name + "\nТвой возраст " + this.age );
    }

     public void sayHello(){
        System.out.println("Hello ," + this.name);
    }

    public int calcAgeToRetirement(){
        int years = 65 - this.age;
        return years;
    }

    public void calcSalary(double summa){
        double yearSalary = summa * 12;
        System.out.println("Твоя годовая зарплата составляет: " + yearSalary + "$");
    }
}
