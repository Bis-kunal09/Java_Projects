import java.util.Scanner;

public class EvenOdd1D {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the range of array");
        int n=in.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++) {
            System.out.println("Enter element " + i);
            arr[i] = in.nextInt();
        }
        int even=0,odd=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0)
                even+=arr[i];
            else
                odd+=arr[i];
        }

        System.out.println("Sum of even numbers is "+even);
        System.out.println("Sum of odd numbers is "+odd);
    }
}
