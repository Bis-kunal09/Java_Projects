import java.util.Scanner;

public class Max1DArray{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the range of array");
        int n=in.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter element "+i);
            arr[i]=in.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
            max=Math.max(max,arr[i]);

        System.out.println("Max value in array is "+max);
    }
}
