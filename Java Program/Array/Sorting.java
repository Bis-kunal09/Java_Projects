import java.util.Scanner;

public class Sorting{
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
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the range of array");
        int n=in.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++) {
            System.out.println("Enter element " + i);
            arr[i] = in.nextInt();
        }

        System.out.println("Array Before Sorting");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        bubbleSort(arr);//sorting array elements using bubble sort

        System.out.println("Array After Sorting");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("Array After decending order");
        for(int i=arr.length-1; i >=0; i--){
            System.out.print(arr[i] + " ");
        }



    }
}
