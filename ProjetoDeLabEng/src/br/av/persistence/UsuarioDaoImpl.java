package br.av.persistence;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.av.model.Usuario;
import br.av.model.UsuarioPadrao;

public class UsuarioDaoImpl implements UsuarioDao {

	private Connection c;

	public UsuarioDaoImpl() {
		GenericDao gDao = new GenericDaoImpl();
		c = gDao.getConnection();
	}

	@Override
	public void insereUsuario(Usuario u) throws SQLException {
		String sql = "INSERT INTO usuario VALUES (?, ?, ?)";
		PreparedStatement ps;
			ps = c.prepareStatement(sql);
			ps.setString(1, u.getUsuario());
			ps.setString(2, u.getSenha());
			ps.setString(3, u.getEmail());
			ps.executeUpdate();
			ps.close();
	}

	@Override
	public UsuarioPadrao autenticaUsuarioPadrao(String usuario) throws SQLException {
		String sql = "select login, senha from usuarioPadrao where login = ?";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setString(1, usuario);
		ResultSet rs = ps.executeQuery();
		UsuarioPadrao up = new UsuarioPadrao();
		if (rs.next()) {
			up.setUsuario(rs.getString("login"));
			up.setSenha(rs.getString("senha"));
		} else {
			up = null;
		}
		return up;
	}

	@Override
	public Usuario autenticaUsuario(String usuario) {
		Usuario u = new Usuario();
		String sql = "select login, senha from usuario where login = ?";
		try {
			PreparedStatement ps = c.prepareStatement(sql);
			ps.setString(1, usuario);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				u.setUsuario(rs.getString("login"));
				u.setSenha(rs.getString("senha"));
			} else {
				u = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return u;
	}

	@Override
	public void alteraUsuario(Usuario u) {
		String sql = "update usuario set email = ?, senha = ? where login = ?";
		PreparedStatement ps;
		try {
			ps = c.prepareStatement(sql);
			ps.setString(1, u.getEmail());
			ps.setString(2, u.getSenha());
			System.out.println(u.getUsuario());
			ps.setString(3, u.getUsuario());
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Usuario pesquisaDadosUsuario(String usuario) throws SQLException {
		String sql = "select senha, email from usuario where login = ?";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setString(1, usuario);
		ResultSet rs = ps.executeQuery();
		Usuario u = new Usuario();
		if (rs.next()) {
			u.setSenha(rs.getString("senha"));
			u.setEmail(rs.getString("email"));
		}
		return u;
	}

}
