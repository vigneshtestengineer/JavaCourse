package Day10;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

// 1) Create a connection
// 2) Create a query/statement
// 3) Execute statement/query
// 4) Close connection

public class JavaDatabaseConnectivity {

	public static void main(String[] args) {
		
		// Create a connection
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/pdborcl","hr","hr");
		
		// Create a query/statement
		
		Statement stmt=(Statement) con.createStatement();
//		String s="insert into student values(101,'scott')";  // Insert query
		
//		String s="update student set sname='kim' where sid=100";  //Update query
		
//		String s="delete student where sid=105"; // Delete query
		
		//Execute statement/query
		
		stmt.executeQuery(s);
		
		// Close connection
		
		con.close();
		
		System.out.println("Program completed");

	}

}
