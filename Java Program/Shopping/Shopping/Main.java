package Shopping;
import Shopping.Products;

import static Shopping.Products.connect;
import static Shopping.Products.list;

public class Main {
    public static void main(String[] args) {
        list.add(new Format(1,"Lux",4,30.5));
        list.add(new Format(2,"abc",7,44.4));
        for(Format f:list){
            connect.put(f.id,f);
        }


        UI u=new UI();
        u.start();
    }
}
