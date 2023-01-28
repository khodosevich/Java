package Interfaces;

public class Animal implements Info {
    public int id;

    Animal(int id){
        this.id = id;
    }

    public void Sleep(){
        System.out.println("I a sleeping");
    }


    @Override
    public void showInfo(){
        System.out.println("\nInfo of Animal class.\nID: " + id + "\n");
    }

}
