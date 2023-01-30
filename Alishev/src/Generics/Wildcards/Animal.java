package Generics.Wildcards;

public class Animal {
    private int id;

    public Animal(){}
    public Animal(int id){
        this.id = id;
    }

    public void setId(int id){
        this.id = id;
    }

    public void eat(){
        System.out.println("Eating " + this.id);
    }

    public String toSring(){
        return String.valueOf(id);
    }

}

