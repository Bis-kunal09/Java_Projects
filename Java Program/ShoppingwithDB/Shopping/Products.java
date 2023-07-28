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
    String name;
    int quantity;
    float price;
    Format(){
    	
    }
    
    
	public Format(int id, String name, int quantity, float price) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
    
}
