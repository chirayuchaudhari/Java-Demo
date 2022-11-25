import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args){
		try {
			String sql="insert into user(name,mobileno,email,password)"+ "values('bhushan','9423915988','bhushan@gmail.com','123456')";
			//String sql="delete from user where name='bhushan'";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydemo", "root", "root");
			Statement st=con.createStatement();
			st.execute(sql);
			System.out.println("Hii");
			con.close();
			st.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
