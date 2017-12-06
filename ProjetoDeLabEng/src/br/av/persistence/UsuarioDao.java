package br.av.persistence;


import java.sql.SQLException;

import br.av.model.Usuario;
import br.av.model.UsuarioPadrao;

public interface UsuarioDao {
	
	public void insereUsuario(Usuario u) throws SQLException;
	public UsuarioPadrao autenticaUsuarioPadrao(String usuario) throws SQLException;
	public Usuario autenticaUsuario(String usuario) throws SQLException;
	public void alteraUsuario(Usuario u) throws SQLException;
	public Usuario pesquisaDadosUsuario(String usuario) throws SQLException;

}
