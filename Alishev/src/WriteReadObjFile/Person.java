package WriteReadObjFile;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int id;

    public Person(){}

    public Person(int id , String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + ": " + name;
    }
}
