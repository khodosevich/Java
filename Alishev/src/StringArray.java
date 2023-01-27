public class StringArray {
    public static void main(String [] args){

        String[] strArr = new String[3];

        strArr[0] = "Matvey";
        strArr[1] = "Java";
        strArr[2] = "BSUIR";

        for (int i = 0 ; i < strArr.length ; i++){
            System.out.println(strArr[i]);
        }

        System.out.println();

       for(String x:strArr){
           System.out.println(x);
       }

       int[] arr = {1,2,3};
       int sum = 0;
       for (int y:arr){
            sum += y;
       }

       System.out.println(sum);

    }
}