import java.sql.SQLOutput;

public class StringBuilderQ {
    public static void main(String[] args) {

        String str2 = " my ";
        String str3 = "friend";

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());

        sb.append(str2);
        sb.append(str3);

        System.out.println(sb.toString());

        sb = sb.reverse();

        System.out.println(sb.toString());

        System.out.println(sb.length());

        String name = "Job";
        int age = 18;

        //printf
        System.out.printf("Your name is %s , your age is %d" , name , age);


    }
}


