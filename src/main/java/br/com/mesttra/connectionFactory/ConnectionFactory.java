package br.com.mesttra.connectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() {
		try {
			return DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/Maven", "postgres", "123");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
