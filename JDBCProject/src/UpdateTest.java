
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateTest {
	public static void main(String[] args) {
		
		try {
			//1. load the driver...
			System.out.println("Trying to load the driver...");
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			System.out.println("Loaded the driver.....");
			
			System.out.println("Trying to connect to the DB...");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:"
					+ "@localhost:1521:xe",
					"system", "sysgitc");
			System.out.println("connected to the db...."+conn);
			
			System.out.println("Trying to create PreparedStatement...");
			PreparedStatement pst = conn.prepareStatement("update emp set ename='Adams' where empno=7934");
			
			
			System.out.println("Trying to execute statement...");
			
			
			
			int rowsInserted = pst.executeUpdate();
			
			System.out.println("Statement executed : rows created : "+rowsInserted);
			pst.close();			conn.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}