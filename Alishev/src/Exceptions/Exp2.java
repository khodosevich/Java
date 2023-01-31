package Exceptions;
import java.util.Scanner;

public class Exp2 {
    public static void main(String[] args) throws ScannerExp {
        Scanner num = new Scanner(System.in);

        while(true){
            int x = Integer.parseInt(num.nextLine());
            if( x!= 0){
                try{
                    throw new ScannerExp("Пользователь ввел не 0");
                }catch (ScannerExp e){
                   e.nameOfExp();
                    break;
                }
            }
        }
    }
}