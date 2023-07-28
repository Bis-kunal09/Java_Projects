

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        String str="";
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the User Name ");
        str=in.next();
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(!(Character.isAlphabetic(ch[i])||Character.isDigit(ch[i])) ){
                System.out.println("Invalid User Name");
                return;
            }
        }
        System.out.println("Enter Password");
        String pass=in.next();
        ch=pass.toCharArray();
        boolean hasUpper=false,hasLower=false,hasDigit=false,hasSpecial=false;
        for(int i=0;i<ch.length;i++){
            if(Character.isUpperCase(ch[i]))
                hasUpper=true;
            else if(Character.isLowerCase(ch[i]))
                hasLower=true;
            else if(Character.isDigit(ch[i]))
                hasDigit=true;
            else
                hasSpecial=true;
        }

        if(hasDigit && hasLower && hasUpper && hasSpecial)
            System.out.println("Valid password");
        else
            System.out.println("Invalid password");
    }
}
