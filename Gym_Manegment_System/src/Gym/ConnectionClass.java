package Gym;
import java.sql.*;
public class ConnectionClass {
	Connection con;
	Statement stm;
	ConnectionClass()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gym_managment","root","");
			stm=con.createStatement();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String s[])
	{
		new ConnectionClass();
	}

}
