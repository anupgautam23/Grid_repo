package C4_Evaluation.Que1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo {

	public static void main(String[] args) {
		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		String url =  "jdbc:mysql://localhost:3306/jdbcdb";
		
		try(Connection conn = DriverManager.getConnection(url,"root","anupgautam@2303")){
			if(conn!=null)
				System.out.println("connected...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
