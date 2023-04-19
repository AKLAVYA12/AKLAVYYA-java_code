import java.sql.Connection;
import java.sql.DriverManager;

public class TestDB {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Found");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample", "root", "root");
			System.out.println("connected");
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
