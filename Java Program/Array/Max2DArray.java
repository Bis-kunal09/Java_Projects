import java.util.Scanner;

public class Max2DArray {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no. of rows of array");
        int n=in.nextInt();
        System.out.println("Enter no. of columns of array");
        int m=in.nextInt();
        int arr[][]=new int[n][m];

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                System.out.println("Enter element at array index " + i+" "+ j);
                arr[i][j] = in.nextInt();
            }

        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
                max=Math.max(max,arr[i][j]);
        }

        System.out.println("Max value in array is "+max);
    }
}
