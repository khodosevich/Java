import java.util.Scanner;

public class DoWhile {
    public static void main(String [] args){
        Scanner x = new Scanner(System.in);
        int value;
        do{
            System.out.println("Enter 5 ");
            value = x.nextInt();
        }while(value != 5);
    }
}

