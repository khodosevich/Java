package WriteReadObjFile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Array {
    public static void main(String[] args) {
        Person[] people = {new Person(1,"Mike") ,
                            new Person(2,"Jonh"),
                             new Person(3,"Bob"),
                             new Person(1,"Mike") ,
                             new Person(2,"Jonh"),
                             new Person(3,"Bob")};



        try{
            FileOutputStream fos = new FileOutputStream("/Users/khodosevich/Java/Alishev/src/WriteReadObjFile/WriteArray");
            ObjectOutputStream oos = new ObjectOutputStream(fos);


//            oos.writeInt(people.length);
//
//            for (Person i : people) {
//                oos.writeObject(i);
//            }


            oos.writeObject(people);

            oos.close();

        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
