import java.util.Scanner;

public class EvenOddJagged {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. of rows of array");
        int n = in.nextInt();
        int arr[][] = new int[n][];
        for(int i=0;i<n;i++) {
            System.out.println("Enter the length of row " + i);
            int m = in.nextInt();
            arr[i] = new int[m];
            for (int j = 0; j < m; j++) {
                System.out.println("Enter element at array index " + i + " " + j);
                arr[i][j] = in.nextInt();
            }
        }

        int even=0,odd=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]%2==0)
                    even+=arr[i][j];
                else
                    odd+=arr[i][j];
            }
        }

        System.out.println("Sum of even numbers is "+even);
        System.out.println("Sum of odd numbers is "+odd);

    }
}
