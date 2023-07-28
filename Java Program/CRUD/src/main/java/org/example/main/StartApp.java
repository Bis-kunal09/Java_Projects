package org.example.main;

import org.example.main.StudentInterface.StudentCrudService;
import org.example.main.StudentServices.*;

import java.util.Scanner;

public class StartApp {
    public static void main(String[] args) {
            int option=0;
        Scanner input=new Scanner(System.in);
            do{
                menu();
                option=input.nextInt();
                switch (option){
                    case 1: StudentCrudService obj=new StudentInsert();
                            obj.operate();
                            break;
                    case 2: StudentCrudService p=new StudentDelete();
                            p.operate();
                            break;
                    case 3: StudentCrudService q=new StudentUpdate();
                            q.operate();
                            break;
                    case 4: StudentCrudService r=new StudentSearch();
                            r.operate();
                            break;
                    case 5: StudentCrudService n=new StudentShow();
                            n.operate();
                            break;
                    case 9:
                        System.out.println("Thankyou");
                        System.exit(0);

                }
            }while(option!=9);

    }
    public static void menu()
    {

        // Printing statements displaying menu on console
        System.out.println("MENU");
        System.out.println("1: Add Student");
        System.out.println("2: Delete Student");
        System.out.println("3: Update Student");
        System.out.println("4: Search Student");
        System.out.println("5: Display Students");
        System.out.println("9: Exit program");
        System.out.print("Enter your selection : ");
    }
}
