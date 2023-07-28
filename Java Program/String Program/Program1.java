

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        String str="";
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the String ");
        str=in.next();

        palindrome(str);

    }
    static void palindrome(String str){
        int i=0,n=str.length()-1;
        while(i<n){
            if(str.charAt(i)!=str.charAt(n)){
                System.out.println("Not a palindrome");
                return;
            }
            i++;
            n--;
        }
        System.out.println("It is a palindrome");
    }
}
