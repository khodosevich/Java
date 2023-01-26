import java.util.Scanner;

public class InputOutput {

    public static void main(String [] args){

        Scanner s = new Scanner(System.in);
        Scanner a = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = s.nextLine();
        System.out.println("Enter age:");
        String age = a.nextLine();
        System.out.println("Your name is " + name + "\n" + "Your age is " + age);

    }

}
