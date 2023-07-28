package Shopping;
import Shopping.Product;
import java.util.Scanner;

import static Shopping.Cart.displayCart;
import static Shopping.Product.*;

public class UI {
    void start(){
        Scanner in =new Scanner(System.in);

        int input;
        do {

            System.out.println("Enter 1 to view products in store \nEnter 2 to show cart \nEnter 0 to exit");
            input=in.nextInt();
            switch (input) {
                case 0:
                    return;
                case 1:
                    displayProducts();
                    choiceOne();
                    break;
                case 2:
                    displayCart();
                    choiceTwo();



            }
        }while(input!=0);

    }
}
