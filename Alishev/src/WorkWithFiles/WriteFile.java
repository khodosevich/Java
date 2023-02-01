package WorkWithFiles;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteFile {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/khodosevich/Java/Alishev/src/WorkWithFiles/testFile");
//        PrintWriter pw = new PrintWriter(file);
//        pw.println("hello");
//        pw.println(123);
//        pw.close();


        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }

        scanner.close();

    }

}

