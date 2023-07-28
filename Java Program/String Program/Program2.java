

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        String str="";
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the String in Lower Case or Upper Case");
        str=in.next();

        if(Character.isLowerCase(str.charAt(0)))
            System.out.println("The String is "+str.toUpperCase());
        else
            System.out.println("The String is "+str.toLowerCase());




    }
}
