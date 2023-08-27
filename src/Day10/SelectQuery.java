package Day10;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

// 1) Create a connection
// 2) Create a query/statement
// 3) Execute statement/query
// 4) Close connection

public class SelectQuery {

	public static void main(String[] args) throws SQLException {
		
		// Create a connection
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/pdborcl","hr","hr");
		
		// Create a query/statement
		
		Statement stmt1=con.createStatement();
		String s="select employee_id,first_name,last_name from employees";
		

		
		//Execute statement/query
		
		ResultSet rs=stmt1.executeQuery(s);
		
		while(rs.next())
		{
			int ei=rs.getInt("EMPLOYEE_ID");
			int fn=rs.getString("FIRST_NAME");
			int ln=rs.getString("LAST_NAME");
			
			System.out.println(ei+" "+fn+ln);
		}
		
		// Close connection
		
		con.close();
		
		System.out.println("Program completed");

	}

}
