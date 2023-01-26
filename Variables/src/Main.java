public class Main {
    public static void main(String[] args) {

        int age = 19;
        short myShort = 3233;
        long myLong = 6465556;
        double myDouble = 64.64;
        float myFloat = 32.32f;
        char c = 'c';
        boolean a = true;
        byte myByte = -128 ;

//        int i = 10;
//        while(i >= 0){
//          //  System.out.println(i);
//            i--;
//        }

//        System.out.println("J: ");
//
//        for (int j = 0; j < 10; j++) {
//            System.out.println(j);
//        }

        String str = "hello,";
        String name = "Matvey";
        String znak = "!";
        System.out.println(str + name + znak + " " +  age );

        boolean t = true;
        int i = 0;

        while(t){
            System.out.println(i);
            i++;
            if(i == 5){
                System.out.println("t is False");
                break;
            }
        }
    }
}




