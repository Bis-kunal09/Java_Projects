import java.util.Scanner;

public class JaggedArray {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. of rows of array");
        int n = in.nextInt();
        int arr[][] = new int[n][];
        for(int i=0;i<n;i++){
            System.out.println("Enter the length of row "+i);
            int m=in.nextInt();
            arr[i]=new int[m];
            for(int j=0;j<m;j++){
                System.out.println("Enter element at array index " + i + " " + j);
                arr[i][j] = in.nextInt();
            }

        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
            for(int j=0;j<arr[i].length;j++)
                max=Math.max(max,arr[i][j]);

        System.out.println("Max value in array is "+max);
    }
}
