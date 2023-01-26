import java.sql.SQLOutput;
import java.util.Scanner;

public class Switch {

    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("Enter number from 0 to 10: ");
        int y = x.nextInt();

        switch (y){

            case 0:{
                System.out.println("Introduced 0");
                break;
            }

            case 1:{
                System.out.println("Introduced 1");
                break;
            }

            case 2:{
                System.out.println("Introduced 2");
                break;
            }

            case 3:{
                System.out.println("Introduced 3");
                break;
            }

            case 4:{
                System.out.println("Introduced 4");
                break;
            }

            case 5:{
                System.out.println("Introduced 5");
                break;
            }

            case 6:{
                System.out.println("Introduced 6");
                break;
            }

            case 7:{
                System.out.println("Introduced 7");
                break;
            }

            case 8:{
                System.out.println("Introduced 8");
                break;
            }

            case 9:{
                System.out.println("Introduced 9");
                break;
            }

            case 10:{
                System.out.println("Introduced 10");
                break;
            }

            default:{
                System.out.println("Default");
                break;
            }


        }



    }

}
