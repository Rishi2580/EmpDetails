import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class Empdetails {
	public static void empname() throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/rishi";
		String username = "root";
		String password = "2580";
		String Query = "insert into emp values(?,?,?,?)";
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement pst = con.prepareStatement(Query);
		pst.setInt(1,5);
		pst.setString(2,"Vasanth");
		pst.setString(3,"Tester");
		pst.setLong(4,8877994345l);
		pst.executeUpdate();
		con.close(); 
 		
	}
	public static void main(String[] args) throws Exception {
		empname();
		
	}

}
