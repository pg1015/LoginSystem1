package nauka;

import java.sql.*;

public class JDBCExam {

	public static void main(String[] args) {
		JDBCExam jd = new JDBCExam();
		System.out.println(jd.get_connection()); 
	}
	public Connection get_connection() {
		
		Connection connection = null;
		String host = "localhost";
		String port = "5432";
		String db_name = "postgres";
		String userName = "postgres";
		String pass = "Jack_Reacher_@2020";
		String url = "jdbc:postgresql://localhost:5432/postgres";
		try {

			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://" +host+ ":" +port+ "/" + db_name, userName, pass );
				if (connection != null) {
					System.out.println("Connected");
				}
				else {
					System.out.println("Connection failed.");
				}
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return connection;
		
	}
}
	
	
