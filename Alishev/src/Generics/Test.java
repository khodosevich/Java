package Generics;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        //Java5

        List list = new ArrayList();

        list.add("dog");
        list.add("cat");
        list.add("frog");

        for (var el : list){
            String animal =(String) el;
            System.out.println(animal);
        }


        //Generics

        List<String> animals = new ArrayList<String>();

        animals.add("dog");
        animals.add("cat");
        animals.add("frog");

        System.out.println();
        String dog = animals.get(0);
        System.out.println(dog);
        System.out.println();

        for (var el : animals){
            String animal1 = el;
            System.out.println(animal1);
        }

        //Java7

        List<String> arr= new ArrayList<>();
        arr.add(" qqq ");
        arr.add(" www ");
        arr.add(" eee ");

        System.out.println(arr.get(0) + arr.get(1) + arr.get(2) );
    }
}
