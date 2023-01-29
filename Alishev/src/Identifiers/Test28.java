package Identifiers;

public class Test28 {
    public int x = 33 ;
    private int id = 1;
    int a = 55;//пределы этого пакета

    protected int y = 123;

    public static void main(String[] args) {
        Test1 test = new Test1();
        test.printTest();
    }
}


class Test1 extends Test28{

    public void printTest(){
        Test28 a = new Test28();
        System.out.println( a.x + " " + a.a + " " + a.y );
    }

}