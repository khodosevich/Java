package WorkWithFiles;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {

        String path = "/Users/khodosevich/Java/Alishev/src/WorkWithFiles/Test";
        File file = new File(path);

        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();

        System.out.println("\n\n\nSplit:\n");

        String path1 = "/Users/khodosevich/Java/Alishev/src/WorkWithFiles/Test1";
        File file1 = new File(path1);

        Scanner scanner1 = new Scanner(file1);
        String line = scanner1.nextLine();
        String[] arr = line.split(" ");


        for (String el : arr){
            System.out.println(el);
        }

        System.out.println();
        System.out.println(Arrays.toString(arr));


        String path2 = "/Users/khodosevich/Java/Alishev/src/WorkWithFiles/Names";
        File file2 = new File(path2);
        Scanner scanner2 = new Scanner(file2);

        while(scanner2.hasNextLine()){
            System.out.println(scanner2.nextLine());
        }
        scanner2.close();

    }
}
