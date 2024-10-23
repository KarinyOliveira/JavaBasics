package mysqlconnection;

import java.sql.*;

public class MySQLConnection {

	public static void main(String[] args) {

		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/hr?&serverTimezone=UTC";
		String user = "root";
		String password = "";

		try {
			Class.forName(driver);
			String query = "SELECT * FROM jobs;";
			try (Connection con = DriverManager.getConnection(url, user, password);
					Statement st = con.createStatement();
					ResultSet rs = st.executeQuery(query)) {
				int colNum = getColumnNames(rs);
				if (colNum > 0) {
					while(rs.next()) {
						for (int i = 0; i < colNum; i++) {
							if (i+1 == colNum)
								System.out.println(rs.getString(i+1));
							else
								System.out.print(rs.getString(i+1) + "");
						}
					} 
				}
			} catch (SQLException e) {
				System.out.println(e);

			}
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}

	}

	public static int getColumnNames(ResultSet rs) throws SQLException {
		int numberofColumns = 0;
		if (rs != null) {
			ResultSetMetaData rsMetaData = rs.getMetaData();
			numberofColumns = rsMetaData.getColumnCount();
			for (int i = 1; i < numberofColumns+1; i++) {
				String columnName = rsMetaData.getColumnName(i);
				System.out.print(columnName + ", ");
			}
			System.out.println();
		}
		return numberofColumns;
	}

}
