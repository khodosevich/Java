package NestedClass;

public class Car {
    private int id;

    private class Motor{
        public void startMotor(){
            System.out.println("Motor " + id + " is staring..");
        }
    }

    public static class Battery{
        public void charge(){
            System.out.println("Charging..");
        }
    }



    public Car(int id) {
        this.id = id;
    }

    public void start(){
        Motor motor = new Motor();
        motor.startMotor();

        class Smth{
            final int x = 4 ;
            public void smthMethod(){
                System.out.println(x);
                System.out.println(id);
            }
        }

        Smth obj = new Smth();
        obj.smthMethod();

        System.out.println("Car " + this.id + " is staring..");
    }

}
