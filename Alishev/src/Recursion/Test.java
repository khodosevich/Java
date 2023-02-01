package Recursion;

public class Test {
    public static void main(String[] args) {
        int x = 4;
        int res = Fact(x);
        System.out.println(res);
    }

    private static int Fact(int x){

       if( x < 1 ){
           return 1;
       }

       return x * Fact(x - 1);
    }
}