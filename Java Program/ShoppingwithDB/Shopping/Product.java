package Shopping;
import java.util.Scanner;
import static Shopping.Main.getAllEmployees;
import static Shopping.Main.addProducts;
import static Shopping.Cart.displayCart;
import static Shopping.Cart.addDetails;
import static Shopping.Cart.removeFromCart;
import static Shopping.Products.list;
import static Shopping.Products.connect;


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

                System.out.println("Enter 1 to add product to cart \n Enter 2 to View Cart \n Enter 3 Add Product in SHOP \nEnter 0 to go back");
                input=in.nextInt();
                switch (input) {
                    case 0:
                        return;
                    case 1:
                        addDetails();
                        break;
                    case 2:
                        displayCart();
                        break;
                    case 3:
                    	Scanner scan=new Scanner(System.in);
                    	System.out.println("Enter Product ID");
                    	int a=scan.nextInt();
                    	if(connect.containsKey(a)) {
                    		
                    		while(!connect.containsKey(a)) {
                    			System.out.println("Enter Again Product ID");
                            	a=scan.nextInt();
                    			
                    		}
                    		
                    		
                    		
                    	}
                    	System.out.println("Enter Product Name");
                    	String n=scan.next();
                    	System.out.println("Enter Product Price");
                    	float c=scan.nextFloat();
                    	System.out.println("Enter Product Quantity");
                    	int d=scan.nextInt();
                    	
                        addProducts(new Format(a,n,d,c));
                        list=getAllEmployees();
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

            System.out.println("Enter 1 to add product to cart\n Enter 2 to Remove product from Cart\n Enter 3 to Place Order  \nEnter 0 to back");
            input=in.nextInt();
            switch (input) {
                case 0:
                    return;
                case 1:
                	addDetails();
                    break;
                case 2:
                    removeFromCart();
                    break;
                case 3:
                	Placeorder pl=new Placeorder();
                	pl.finalize();
                	System.out.println("Order Placed Successfully!!!!");
                		
                default:
                    System.out.println("Wrong choice");
                    break;

            }
        }while(input!=0);
    }
}
