package Shopping;


import java.util.ArrayList;


import java.util.Scanner;

import static Shopping.Products.connect;
import static Shopping.Products.list;


public class Cart {
    static ArrayList<Format>cart=new ArrayList<>();


    static boolean canAddToCart(int id, int quantity){

        if(connect.containsKey(id)){

            Format f=connect.get(id);
            if(f.quantity<quantity){
                System.out.println("Please check the quantity");
                return false;
            }
            else
                return true;

        }
        System.out.println("No such product id present");
        return false;
    }
    static void displayCart(){
        System.out.println("ID \t\tName \t\tquantity \t\tprice");
        for(Format f:cart){
            System.out.println(f.id+" \t\t"+f.name+" \t\t"+f.quantity+" \t\t\t\t"+f.price);
        }
    }
    static void addDetails(){
        Scanner in=new Scanner(System.in);
        int id,quantity;
        System.out.println("Enter product id");
        id=in.nextInt();
        System.out.println("Enter quantity");
        quantity=in.nextInt();
        if(canAddToCart(id,quantity)){
            boolean flag=true;

            Format q=connect.get(id);
            q.quantity-=quantity;
            for(Format t:cart){
                if(t.id==id){
                    t.quantity+=quantity;

                    flag=false;
                }
            }
            if(flag){

                Format f=connect.get(id);

                cart.add(new Format(id,f.name,quantity,f.price));
            }

        }

    }

    static void removeFromCart(){
        int id;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the ID which you want to remove");
        id=in.nextInt();

        for(Format f:cart){
            if(f.id==id){
                int quan;
                System.out.println("Enter the quantity you want to remove");
                quan=in.nextInt();

                Format q=connect.get(id);
                if(quan>=f.quantity){
                    q.quantity+=f.quantity;
                    cart.remove(f);
                }
                else {
                    q.quantity+=quan;
                    f.quantity-=quan;
                }
                return;
            }
            else{
                System.out.println("No such id found");
            }
        }
    }
}
