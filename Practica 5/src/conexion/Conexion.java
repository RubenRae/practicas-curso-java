package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
	public static void main(String[] args) {

		String url1 = "jdbc:mysql://sql2.freemysqlhosting.net:3306/sql2265139";
		String user = "sql2265139";
		String password = "wY5*gN8%";
		Connection conn1 = null;

		try {
			conn1 = DriverManager.getConnection(url1, user, password);
			if (conn1 != null) {
				System.out.println("Conectado a base de datos sql2265139");
			}
		} catch (SQLException e) {
			System.out.println("Error en la conexion, usuario / password incorrecto");
			e.printStackTrace();
		}
		
		String query="insert into categorias values(?,?)";
		
		try {
			PreparedStatement preparedStmt = conn1.prepareStatement(query);
			preparedStmt.setInt(1, 10);
			preparedStmt.setString(2, "Alimentacion");
			preparedStmt.execute();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		String query2 = "SELECT*FROM categorias";
		try {
		Statement st = conn1.createStatement();
		ResultSet rs = st.executeQuery(query2);
		while(rs.next()) {
			int id =rs.getInt("id");
			String nombre = rs.getString("nombre");
			System.out.format("%s,%s \n",id,nombre);
		}
		conn1.close();
		}catch(SQLException e) {
			
			e.printStackTrace();
		}
	}
}