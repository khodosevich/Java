package Enum;

import java.sql.SQLOutput;

public class Test {

    public static void main(String[] args) {
        Animal animal = Animal.FROG;
        switch (animal){
            case DOG:{
                System.out.println("Dog");
                break;
            }
            case CAT:{
                System.out.println("Cat");
                break;
            }
            case FROG: {
                System.out.println("Frog");
                break;
            }
            default:{
                System.out.println("I dont know");
            }
        }

        System.out.println();
        System.out.println(animal.getTranslation());
        System.out.println(animal.name());
        System.out.println();

        Season season = Season.WINTER;
        switch (season){
            case SUMMER:{
                System.out.println("Summer");
                break;
            }
            case AUTUMN:{
                System.out.println("Autumn");
                break;
            }
            case WINTER: {
                System.out.println("Winter");
                break;
            }
            case SPRING: {
                System.out.println("SPRING");
                break;
            }
            default:{
                System.out.println("I dont know");
            }
        }

        System.out.println(season instanceof Object);
        System.out.println(season instanceof Enum);
        System.out.println(season instanceof Season);

        System.out.println(season.getTemperature());
        System.out.println(season.name());

        Season season1 =Season.valueOf("SUMMER");
        System.out.println(season1.getTemperature());

        System.out.println(season1.ordinal());

    }
}