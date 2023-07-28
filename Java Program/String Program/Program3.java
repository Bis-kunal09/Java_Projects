

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        String str="";
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the String ");
        str=in.next();
        char ch[]=str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(Character.isLowerCase(ch[i]))
                ch[i]-=32;
            else
                ch[i]+=32;
        }

        str = String.copyValueOf(ch);
        System.out.println(str);
    }
}
