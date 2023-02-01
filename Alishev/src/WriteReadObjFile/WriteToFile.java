package WriteReadObjFile;

import java.io.*;

public class WriteToFile {

    public static void main(String[] args) {

        Person person1 = new Person(12, "Bob");
        Person person2 = new Person(14, "Jonh");
        Person person3 = new Person(18, "Mike");
        Person person4 = new Person(16, "Nikitata");

        try {
            FileOutputStream fos = new FileOutputStream("/Users/khodosevich/Java/Alishev/src/WriteReadObjFile/persons");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(person1);
            oos.writeObject(person2);
            oos.writeObject(person3);
            oos.writeObject(person4);

            oos.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
