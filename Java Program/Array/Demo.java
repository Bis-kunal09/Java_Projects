
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Demo{
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        pattern1(5);
        System.out.println();
        pattern3(5);
        System.out.println();
        pattern5(5);
        System.out.println();
        pattern6(5);
        System.out.println();
        pattern7(5);
        System.out.println();
        pattern8();
        System.out.println();
        pattern9();
        System.out.println();
        pattern10();
        System.out.println();
        pattern11();
        System.out.println();
        pattern12();
        System.out.println();




    }
    static void pattern1(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int row=1;row<=n;row++){
            for(int col=n;col>=row;col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int row=1;row<=n;row++){
            int totalcol=n-row+1;
            int totalspaces=n-totalcol;
            for(int s=1;s<=totalspaces;s++){
                System.out.print(" ");
            }
            for(int col=1;col<=totalcol;col++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    static void pattern4(int n){
        for(int row=0;row<2*n;row++){
            int totalcol=row>n?2*n-row:row;
            for(int col=0;col<totalcol;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for(int row=1;row<=n;row++){
            int totalcol=row;
            int totalspaces=n-totalcol;
            for(int s=1;s<=totalspaces;s++){
                System.out.print(" ");
            }
            for (int col=1;col<=totalcol;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for(int row=1;row<=n;row++){
            int totalcol=2*row-1;
            int totalspaces=n-row;
            for(int s=1;s<=totalspaces;s++){
                System.out.print(" ");
            }
            for (int col=1;col<=totalcol;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for(int row=1;row<=n;row++){
            int totalcol=2*n-2*row+1;
            int totalspaces=row-1;
            for(int s=1;s<=totalspaces;s++){
                System.out.print(" ");
            }
            for (int col=1;col<=totalcol;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern8(){
        for(int i=1;i<=7;i++){

            for(int k=7;k>i;k--)
                System.out.print(" ");

            for(int j=0;j<2*i-1;j++){
                if(j==0||j==2*i-2||i==4)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
    static void pattern9(){
        int count=0;
        for(int i=0;i<5;){


            if(count<=i){
                System.out.print("*");
                count++;
                continue;
            }

            if(count>i){
                System.out.println();
                count=0;
                i++;
            }
        }
    }
    static void pattern10(){
        int count=5;
        int co=0;
        for(int i=1;i<=5;){


            if(count>i){
                System.out.print(" ");
                count--;
                continue;
            }
            if(co<2*i-1){
                System.out.print("*");
                co++;
                continue;
            }
            if(co>=i){
                System.out.println();
                count=5;
                co=0;
                i++;
            }
        }
    }
    static void pattern11(){
        int count=0;
        int co=0;
        for(int i=5;i>0;){


            if(count<5-i){
                System.out.print(" ");
                count++;
                continue;
            }
            if(co<10-(2*(5-i)+1)){
                System.out.print("*");
                co++;
                continue;
            }
            if(co>=i){
                System.out.println();
                count=0;
                co=0;
                i--;
            }
        }
    }
    static void pattern12(){
        int count=5;
        int co=0;
        for(int i=1;i<=5;){


            if(count>i){
                System.out.print(" ");
                count--;
                continue;
            }
            if(co<i){
                System.out.print("*");
                co++;
                continue;
            }
            if(co>=i){
                System.out.println();
                count=5;
                co=0;
                i++;
            }
        }

    }






}
