package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exp1 {

    public static void main(String[] args)  {

        try{
            readFile();
        } catch(FileNotFoundException e){
            System.out.println("Обработка исключения в main");
        }

        System.out.println("Hello man");
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("test");
        Scanner scanner = new Scanner(file);
    }

}
