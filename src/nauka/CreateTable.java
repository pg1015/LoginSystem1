package nauka;

import java.sql.Connection;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		
		Connection connection = null;
		Statement statement = null;
		JDBCExam jd = new JDBCExam();
		 connection = jd.get_connection();
		
		try {
			
			String query = "CREATE TABLE import_data(data_id SERIAL PRIMARY KEY, name varchar(200), name2 varchar(200))";
			statement = connection.createStatement();
			statement.executeUpdate(query);
			System.out.println("Table created.");
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
