package WriteReadObjFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadFromFileArray {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("/Users/khodosevich/Java/Alishev/src/WriteReadObjFile/WriteArray");
            ObjectInputStream ois = new ObjectInputStream(fis);

//            int size = ois.readInt();
//
//            System.out.println(size);
//
//            while (size != 0){
//                Person person =(Person) ois.readObject();
//                System.out.println(person);
//                size--;
//            }

            Person[] people = (Person[]) ois.readObject();

            System.out.println(Arrays.toString(people));

            ois.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
