package WriteReadObjFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadFromFile {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("/Users/khodosevich/Java/Alishev/src/WriteReadObjFile/persons");
            ObjectInputStream ois = new ObjectInputStream(fis);


            Person person1 = (Person) ois.readObject();
            Person person2 = (Person) ois.readObject();
            Person person3 = (Person) ois.readObject();
            Person person4 = (Person) ois.readObject();

            System.out.println(person1);
            System.out.println(person2);
            System.out.println(person3);
            System.out.println(person4);

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
