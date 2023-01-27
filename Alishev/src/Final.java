public class Final {
    public static void main(String[] args) {
        final int X = 10;
        System.out.println(X);

        Test x = new Test();
        x.mult();

    }
}

class Test{
    public static final int CONSTANT = 10;

    public void mult(){
        System.out.println(CONSTANT * CONSTANT);
    }
}