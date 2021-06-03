/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JasperReports_Sample;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Buddhi Rangana
 */
public class databaseConnection {

	private static Connection c;

	public static Connection getConnection() throws Exception {
		if (c == null || c.isClosed()) {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			c = DriverManager.getConnection("jdbc:mysql://localhost/jasperreport_sample?autoReconnect=true", "root", "");
		}
		return c;
	}
}
