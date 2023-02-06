package Student;

import java.util.List;

public class Person{

    private String Name;
    private double Ball;
    private int LessonSkip;

    public Person(String name, double ball, int lessonSkip) {
        Name = name;
        Ball = ball;
        LessonSkip = lessonSkip;
    }

    public Person() {

    }


    @Override
    public String toString() {
        return "Name:" + Name  + ", Ball:" + Ball + ", LessonSkip: " + LessonSkip;
    }


    public void CheckedBadStudent(List<Person> persons){

        int SizeList = persons.size();

        Person mostLessonSkipped = new Person("empty", 0 , 0);
        Person badMark = new Person("empty" , 10 , 0);


            for (int i = 0 ; i < SizeList ; i++){

                double ball = persons.get(i).Ball;
                int skipLesson = persons.get(i).LessonSkip;

                if(ball < badMark.Ball){
                    badMark = persons.get(i);
                }

                if(skipLesson > mostLessonSkipped.LessonSkip){
                    mostLessonSkipped = persons.get(i);
                }
            }

        System.out.println("Person with bad marks: " + badMark);
        System.out.println("Person with most skipped lesson: " + mostLessonSkipped);


    }
}