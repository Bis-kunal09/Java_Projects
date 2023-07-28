package Shopping;
import Shopping.Products;

import static Shopping.Cart.cart;
import static Shopping.Products.connect;
import static Shopping.Products.list;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Placeorder {
	private static final String TABLE_NAME = "products";
	 private static final String COLUMN_ID = "id";
	    private static final String COLUMN_NAME = "name";
	    private static final String COLUMN_PRICE = "price";
	 private static final String COLUMN_QUANTITY = "quantity";

	    private static final String SELECT_ALL_EMPLOYEES = "SELECT * FROM " + TABLE_NAME;
	    private static final String INSERT_PRODUCTS = "INSERT INTO " + TABLE_NAME + " (" + COLUMN_ID + ", " + COLUMN_NAME +", " + COLUMN_PRICE +", " + COLUMN_QUANTITY +") VALUES (?, ?,?,?)";
	    private static final String INSERT_ORDERS = "INSERT INTO " + "orders" + " (" + COLUMN_ID + ", " + COLUMN_NAME +", " + COLUMN_PRICE +", " + COLUMN_QUANTITY +") VALUES (?, ?,?,?)";
	    private static final String UPDATE_PRODUCTS = "UPDATE " + TABLE_NAME + " SET " + COLUMN_NAME + "=?, " + COLUMN_PRICE + "=?, " + COLUMN_QUANTITY+ "=? WHERE " + COLUMN_ID + "=?";
	    
	    public void finalize() {
	    	for(Format x:list) {
	    		updateEmployee(x);
	    	}
	    	for(Format x:cart) {
	    		addOrders(x);
	    		System.out.println(x);
	    		
	    	}
	    	
	    	cart.clear();
	    	list.clear();
	    	return;
	    }
	    
	    static public void updateEmployee(Format item) {
	        try (Connection connection = DatabaseConnectionProducts.getInstance().getConnection();
	             PreparedStatement statement = connection.prepareStatement(UPDATE_PRODUCTS)) {
	        	statement.setString(1, item.getName());
	            statement.setDouble(2, item.getPrice());
	            statement.setInt(3, item.getQuantity());
	            
	            // Set other fields as per your table schema
	            statement.setInt(4, item.getId());

	            statement.executeUpdate();
	        } catch (SQLException | IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }
	    static public void addOrders(Format item) {
	        try (Connection connection = DatabaseConnectionProducts.getInstance().getConnection();
	             PreparedStatement statement = connection.prepareStatement(INSERT_ORDERS)) {
	            statement.setInt(1, item.getId());
	            statement.setString(2, item.getName());
	            statement.setDouble(3, item.getPrice());
	            statement.setInt(4, item.getQuantity());
	            
	            // Set other fields as per your table schema

	            statement.executeUpdate();
	        } catch (SQLException | IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }
	    
}
