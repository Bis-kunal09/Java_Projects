package Quiz;

import java.util.Scanner;

public class Quiz {
    static int score=0;
    static boolean flag;
    public static void main(String[] args) {



        String questions[]={"What is the capital of Uttarakhand ?","What is the capital of India ?","Who is the National sport of India ?","Which Planet is closest to the sun ?"};
        String options[]={
                "A. Dehradun\tB. Almora\tC. Nainital\tD. Champawat\t",
                "A. Punjab\tB. Bangalore\tC. New Delhi\tD. Chennai\t",
                "A. Hockey\tB. Cricket\tC. Football\tD. Badminton\t",
                "A. Earth\tB. Mars\tC. Mercury\tD. Saturn\t"
        };

        char[] answers = { 'a', 'c', 'a', 'c' };
        int random;
        char input='x';
        for(int i=0;i<5;i++){
            flag=false;
            random=(int)(Math.random()*4);


            System.out.println("Question " + (i + 1) + ":");
            System.out.println(questions[random]);
            System.out.println(options[random]);

            TimeThread t1=new TimeThread();
            t1.start();

            input=getInput();

            t1.stop();

            if(input==answers[random]&&flag==false)
                score++;
        }


        System.out.println("Your score was "+score);
    }

    static char getInput(){
        Scanner in=new Scanner(System.in);
        char ch;
        ch=in.next().charAt(0);

        return Character.toLowerCase(ch);
    }

    static class TimeThread extends Thread{
        public void run() {
            try {
                Thread.sleep(7000);
                System.out.println("\nTime's up!");
                System.out.println("Please Enter n For Next Question");
                flag=true;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}



