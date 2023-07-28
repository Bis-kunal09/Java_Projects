package threadpoolexecuter;

import Quiz.Quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class WorkerThread implements Runnable {
    String questions[]={"1What is the capital of Uttarakhand ?","2What is the capital of India ?","3What is the capital of Australia?","4Which Planet is closest to the sun ?",
                        "5What is the capital of Uttarakhand ?","6What is the capital of India ?","7What is the capital of Australia?","8Which Planet is closest to the sun ?",
                        "9What is the capital of Uttarakhand ?","10What is the capital of India ?","11What is the capital of Australia?","12Which Planet is closest to the sun ?",
                        "13What is the capital of Uttarakhand ?","14What is the capital of India ?","15What is the capital of Australia?","16Which Planet is closest to the sun ?",
                        "17What is the capital of Uttarakhand ?","18What is the capital of India ?","19What is the capital of Australia?","20Which Planet is closest to the sun ?"};
    String options[]={
            "A. Dehradun\tB. Almora\tC. Nainital\tD. Champawat\t",
            "A. Punjab\tB. Bangalore\tC. New Delhi\tD. Chennai\t",
            "A. Canberra\tB. Sydney\tC. Gabba\tD. Perth\t",
            "A. Earth\tB. Mars\tC. Mercury\tD. Saturn\t",
            "A. Dehradun\tB. Almora\tC. Nainital\tD. Champawat\t",
            "A. Punjab\tB. Bangalore\tC. New Delhi\tD. Chennai\t",
            "A. Canberra\tB. Sydney\tC. Gabba\tD. Perth\t",
            "A. Earth\tB. Mars\tC. Mercury\tD. Saturn\t",
            "A. Dehradun\tB. Almora\tC. Nainital\tD. Champawat\t",
            "A. Punjab\tB. Bangalore\tC. New Delhi\tD. Chennai\t",
            "A. Canberra\tB. Sydney\tC. Gabba\tD. Perth\t",
            "A. Earth\tB. Mars\tC. Mercury\tD. Saturn\t",
            "A. Dehradun\tB. Almora\tC. Nainital\tD. Champawat\t",
            "A. Punjab\tB. Bangalore\tC. New Delhi\tD. Chennai\t",
            "A. Canberra\tB. Sydney\tC. Gabba\tD. Perth\t",
            "A. Earth\tB. Mars\tC. Mercury\tD. Saturn\t",
            "A. Dehradun\tB. Almora\tC. Nainital\tD. Champawat\t",
            "A. Punjab\tB. Bangalore\tC. New Delhi\tD. Chennai\t",
            "A. Canberra\tB. Sydney\tC. Gabba\tD. Perth\t",
            "A. Earth\tB. Mars\tC. Mercury\tD. Saturn\t"
    };
    static int score=0;
    char[] answers = { 'a', 'c', 'a', 'c','a', 'c', 'a', 'c' ,'a', 'c', 'a', 'c' ,'a', 'c', 'a', 'c' ,'a', 'c', 'a', 'c' ,'a', 'c', 'a', 'c'  };
    int random;
    static boolean flag;
    char input='x';

    static ArrayList<Integer>arr=new ArrayList<>();
    static char getInput(){
        Scanner in=new Scanner(System.in);
        char ch;
        ch=in.next().charAt(0);

        return Character.toLowerCase(ch);
    }
    public void run(){

        do {
            random = (int) (Math.random() * 20);


        }while(arr.contains(random));
        arr.add(random);

        flag=false;
        System.out.println("Question:");
        System.out.println(questions[random]);
        System.out.println(options[random]);

        TimeThread t1=new TimeThread();
        t1.start();
        input=getInput();
        t1.stop();
        if(input==answers[random]&&flag==false)
            score++;

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