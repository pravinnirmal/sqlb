

import java.sql.*;
import java.util.Scanner;

import com.mysql.cj.x.protobuf.MysqlxCrud.Insert;
import com.mysql.cj.xdevapi.InsertStatement;

public class Sqldb {
	@SuppressWarnings("unused")
	public static void main(String args[]) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/registration";
		String uname = "root";
		String password = "dossboss";
		String query = "INSERT INTO registration VALUES (userid, username) ";

		try {
			Connection con = DriverManager.getConnection(url, uname, password);
			PreparedStatement state = con.prepareStatement(query);

			Scanner scan = new Scanner(System.in);
			System.out.println("---------User Registration--------");
			System.out.println("Enter name: ");
			String username = scan.next();
			System.out.println("Enter User Name: ");
			String userid = scan.next();
			
			
			
			state.executeUpdate(query);
			System.out.println("Registration Successful");
			scan.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
