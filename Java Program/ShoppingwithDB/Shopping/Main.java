package Shopping;
import Shopping.Products;


import static Shopping.Products.connect;
import static Shopping.Products.list;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
	private static final String TABLE_NAME = "products";
	 private static final String COLUMN_ID = "id";
	    private static final String COLUMN_NAME = "name";
	    private static final String COLUMN_PRICE = "price";
	 private static final String COLUMN_QUANTITY = "quantity";

	    private static final String SELECT_ALL_EMPLOYEES = "SELECT * FROM " + TABLE_NAME;
	    private static final String INSERT_PRODUCT = "INSERT INTO " + TABLE_NAME + " (" + COLUMN_ID + ", " + COLUMN_NAME +", " + COLUMN_PRICE +", " + COLUMN_QUANTITY +") VALUES (?, ?,?,?)";
	
    public static void main(String[] args) {
        list=getAllEmployees();
        
        for(Format f:list) {
        	System.out.println(f);
        }
        for(Format f:list){
            connect.put(f.id,f);
        }


        UI u=new UI();
        u.start();
    }
    static public ArrayList<Format> getAllEmployees() {
        ArrayList<Format> list = new ArrayList<>();
        try (Connection connection = DatabaseConnectionProducts.getInstance().getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(SELECT_ALL_EMPLOYEES)) {
            while (resultSet.next()) {
                Format item = new Format();
                item.setId(resultSet.getInt(COLUMN_ID));
                item.setName(resultSet.getString(COLUMN_NAME));
                item.setPrice(resultSet.getFloat(COLUMN_PRICE));
                item.setQuantity(resultSet.getInt(COLUMN_QUANTITY));
                
                // Set other fields as per your table schema
                
                list.add(item);
            }
        } catch (SQLException | IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
    static public void addProducts(Format item) {
        try (Connection connection = DatabaseConnectionProducts.getInstance().getConnection();
             PreparedStatement statement = connection.prepareStatement(INSERT_PRODUCT)) {
            statement.setInt(1, item.getId());
            statement.setString(2, item.getName());
            statement.setDouble(3, item.getPrice());
            statement.setInt(4, item.getQuantity());
            
            // Set other fields as per your table schema

            statement.executeUpdate();
        } catch (SQLException | IOException | ClassNotFoundException e) {
        	System.out.println("Item Already Present ");
            e.printStackTrace();
        }
    }
    
}
