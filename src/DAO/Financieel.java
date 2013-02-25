package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Financieel {
	private Connection con;
	private Statement stmt;

	public Financieel() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/expensesandincommings", "root",
				"flapdakda2");
		stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
				ResultSet.CONCUR_READ_ONLY);

	}

	public void addExpences(String Name, int amount, Date date, String Project)
			throws SQLException {
		stmt.execute("INSERT INTO expensesandincommings VALUES (null," + Name
				+ ", CURDATE() , "+date+","+amount);
	}
}
