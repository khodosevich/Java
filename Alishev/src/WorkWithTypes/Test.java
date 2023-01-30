package WorkWithTypes;

public class Test {
    public static void main(String[] args) {

        float f = 123.45f;
        int i = 12;

        i = (int) f;

        System.out.println(i);

        long l = 12312312312312312L;
        System.out.println(l);

        double q = 123123;

        float w = (float)q;

        float r = 123.12f;
        double e = r;

        byte a = (byte) 129;
        System.out.println(a);



        //класс-обертки
        int k = 1;
        Integer x2 = new Integer(12);
        Integer x3 = Integer.parseInt("123");

        System.out.println(x2);
        System.out.println(x3);
    }
}
