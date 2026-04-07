package jdbc;

import java.sql.*;
public class sqlCrudOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String url = "database_url";
			String user = "database_user";
			String password = "database_password";
		    Connection connect = DriverManager.getConnection(url, user, password);
		    // Inserting values --> Post Operation
		    
		    String insertionQuery = "INSERT INTO studentInfo (sname, sage, scity) VALUES ( 'Pankaj', 26, 'Patna')";
		    
		    Statement stmt = connect.createStatement();
		    int rowsAffected = stmt.executeUpdate(insertionQuery);
		    if(rowsAffected > 0) {
		    	System.out.println("Data Inserted Successfully");
		    }
		    else {
		    	System.out.println("Data Insertion Fails");
		    }
		    
		    // Fetch Operation --> get operation
		    
		    String fetchQuery = "Select * from studentInfo";
		    ResultSet rs = stmt.executeQuery(fetchQuery);
		    while(rs.next()) {
		    	System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + "  " + rs.getString(4));
		    }
		    System.out.println("Data fetched successfully");
		    
		    
		    // Updating value --> Put Opearation
		    
		    String updationQuery = "UPDATE studentInfo SET sname = 'Aditya' WHERE sname = 'pankaj'";
		    
		    int valueAffected = stmt.executeUpdate(updationQuery);
		    if(valueAffected > 0) {
		    	System.out.println("Value updated");
		    }
		    else {
		    	System.out.println("Data updateion fails");
		    }
		    
		    // Fetch Operation --> get operation
		    
		    fetchQuery = "Select * from studentInfo";
		    rs = stmt.executeQuery(fetchQuery);
		    while(rs.next()) {
		    	System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + "  " + rs.getString(4));
		    }
		    System.out.println("Data fetched successfully");
		    
		    // Delete row --> delete Operation
		    String deleteQuery = "Delete from studentInfo where sname = 'Aditya'";
		    int deleteRowsAffected = stmt.executeUpdate(deleteQuery);
		    if(deleteRowsAffected > 0) {
		    	System.out.println("Data deleted succefully");
		    }
		    else {
		    	System.out.println("Deleteion operation fails");
		    }
		    		
		    
		    // Fetch Operation --> get operation
		    rs = stmt.executeQuery(fetchQuery);
		    while(rs.next()) {
		    	System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + "  " + rs.getString(4));
		    }
		    System.out.println("Data fetched successfully");
		    
		    rs.close();
		    stmt.close();
		    connect.close();
		}
		catch(Exception e) {
			System.out.println("Class Not found " + e.getMessage());
		}
		)

		

	}

}
