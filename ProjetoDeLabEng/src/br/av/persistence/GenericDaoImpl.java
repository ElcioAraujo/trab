package br.av.persistence;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GenericDaoImpl implements GenericDao{
	
	private Connection con;

	@Override
	public Connection getConnection() {
		try {
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			con = DriverManager
					.getConnection(
							"jdbc:jtds:sqlserver://127.0.0.1:1433;DatabaseName=p1LabBD;namedPipe=true",
							"sa", "kika006cris");
			System.out.println("Conexao ok");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	@Override
	public void fechaConexao(Connection con) {
		try {
			if (con != null)
				con.close();
			con = null;
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

}
