package br.av.persistence;


import java.sql.SQLException;
import java.util.List;

import br.av.model.Grupo;

public interface GrupoDao {
	
	public List<Grupo> sorteiaGruposA() throws SQLException;
	public List<Grupo> sorteiaGruposB() throws SQLException;
	public List<Grupo> sorteiaGruposC() throws SQLException;
	public List<Grupo> sorteiaGruposD() throws SQLException;
	public void sortearGrupos() throws SQLException;
	public List<Grupo> grupoA() throws SQLException;
	public List<Grupo> grupoB() throws SQLException;
	public List<Grupo> grupoC() throws SQLException;
	public List<Grupo> grupoD() throws SQLException;
	public List<Grupo> classificacaoGeral() throws SQLException;
	
}
