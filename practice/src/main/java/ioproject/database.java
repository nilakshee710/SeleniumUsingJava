package ioproject;
import java.sql.*;
import java.util.Properties;

public class database {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "jdbc:postgresql://localhost/northwind";
		Properties props = new Properties();
		props.setProperty("user", "northwind");
		props.setProperty("password", "chinmay19!");
		props.setProperty("ssl", "false");
		try {
			Connection conn = DriverManager.getConnection(url, props);
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM public.us_states ORDER BY state_id ASC LIMIT 100");
			while (rs.next()) {
			   // System.out.print("Column 1 returned ");
			    System.out.println(rs.getString(1)+"<>"+rs.getString(2)+"<>"+rs.getString(3)+"<>"+rs.getString(4));
			}
			rs.close();
			st.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//String url = "jdbc:postgresql://localhost/northwind?user=northwind&password=chinmay19!&ssl=true";
		//Connection conn = DriverManager.getConnection(url)

		

	}

}
