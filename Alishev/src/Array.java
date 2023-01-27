public class Array {
    public static void main(String[] args){

        int[] array = {1,2,3,4,5,0,9};
        int[] arr = new int[5];

        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = i * 2;
        }

        array[0] = 1000;
        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(array[i] + " ");
        }

        System.out.print("\n");

        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
