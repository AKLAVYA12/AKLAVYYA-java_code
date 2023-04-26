import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class TestDB {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Found");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "root");
			Statement statement=connection.createStatement();
			System.out.println("connected");
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter data: ");
			int id = scanner.nextInt();
			String name = scanner.next();
			String query = "INSERT INTO user('idnew_table') VALUES ('"+id+"','"+name+"');";
	        System.out.println("Data Inserted Successfully");
	        ResultSet rs = statement.executeQuery("SELECT * FROM sample.user");
	        while(rs.next()){
	        	System.out.println(rs.getInt(1)+" "+rs.getString(2));
	        }
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
