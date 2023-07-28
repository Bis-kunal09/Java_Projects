package Shopping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Products {
    static ArrayList<Format> list=new ArrayList<Format>();
    static Map<Integer,Format> connect=new HashMap<>();

}
class Format{

    int id;
    String name="";
    int quantity=0;
    double price=0;

    public Format(int id,String name,int quantity,double price){
        this.id=id;
        this.name=name;
        this.quantity=quantity;
        this.price=price;
    }
}
