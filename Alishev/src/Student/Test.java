package Student;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();

        list.add(new Person("matvey" , 5.69 , 0) );
        list.add(new Person("bob" , 6.7 , 10) );
        list.add(new Person("jonh" , 5 , 6) );
        list.add(new Person("mike" , 4.5 , 3) );
        list.add(new Person("tommy" , 6.7 , 0) );
        list.add(new Person("shelby" , 9 , 16) );

        Person check = new Person();

        check.CheckedBadStudent(list);
    }
}
