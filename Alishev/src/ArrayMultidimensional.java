public class ArrayMultidimensional {
    public static void main(String [] args){

        int n = 4;
        int m = 5;
        int[][] arr = new int[n][m];

        int x = 2;
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < m ; j++){
                x += 2;
                arr[i][j] = x;
            }
        }

        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < m ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        int[][] arr1 = {{1,3,4},
                        {3,4,5,6},
                        {4,5},
                        {0}};

        for (int a = 0 ; a < arr1.length ; a++){
            for (int k = 0 ; k < arr1[a].length ; k++){
                System.out.print(arr1[a][k] + " ");
            }
            System.out.println();
        }


    }
}
