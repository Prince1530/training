import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","sysgitc");
			System.out.println("Loaded the Driver....");
			System.out.println("Trying to connect ot the Db");
			System.out.println("Trying to create statement");
			
		Statement statement = conn.createStatement();
		System.out.println("Trying to execute statement");
		ResultSet resultset = statement.executeQuery("Select * from customer");
		System.out.println("Statement executed got the result" +resultset);
		while (resultset.next())
		{
			int deptno = resultset.getInt(1);
			String deptName = resultset.getString(2);
			String locName = resultset.getString(3);
			System.out.println("Dept No :..."+deptno+"...DNAME  :....."+deptName+"...Location..."+locName);
		}
		resultset.close();
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
