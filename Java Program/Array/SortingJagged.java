import java.util.Scanner;
public class SortingJagged {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }
    static void sort(int arr[][]){
        for(int i=0;i<arr.length;i++){
            bubbleSort(arr[i]);
        }
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. of rows of array");
        int n = in.nextInt();
        int arr[][] = new int[n][];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the length of row " + i);
            int m = in.nextInt();
            arr[i] = new int[m];
            for (int j = 0; j < m; j++) {
                System.out.println("Enter element at array index " + i + " " + j);
                arr[i][j] = in.nextInt();
            }

        }
        sort(arr);
    }
}
