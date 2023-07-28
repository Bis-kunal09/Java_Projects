package Shopping;
import java.util.Scanner;

import static Shopping.Cart.addDetails;
import static Shopping.Cart.removeFromCart;
import static Shopping.Products.list;

public class Product {
        static void displayProducts(){
            System.out.println("Id \t\tName \t\tquantity \t\tprice");
            for(Format f:list){
                System.out.println(f.id+" \t\t"+f.name+" \t\t"+f.quantity+" \t\t\t\t"+f.price);
            }
        }

        static void choiceOne(){
            Scanner in =new Scanner(System.in);

            int input;
            do {

                System.out.println("Enter 1 to add product to cart \nEnter 0 to go back");
                input=in.nextInt();
                switch (input) {
                    case 0:
                        return;
                    case 1:
                        addDetails();
                        break;
                    default:
                        System.out.println("Wrong choice");
                        break;

                }
            }while(input!=0);
        }

    static void choiceTwo(){
        Scanner in =new Scanner(System.in);

        int input;
        do {

            System.out.println("Enter 1 to remove product from cart \nEnter 0 to back");
            input=in.nextInt();
            switch (input) {
                case 0:
                    return;
                case 1:
                    removeFromCart();
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;

            }
        }while(input!=0);
    }
}
