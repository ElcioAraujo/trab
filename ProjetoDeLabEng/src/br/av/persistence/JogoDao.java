package br.av.persistence;


import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import br.av.model.Jogo;
import br.av.model.JogoUpdate;
import br.av.model.QuartaFinal;

public interface JogoDao {
	
	
	public void sorteiaJogos() throws SQLException;
	public List<Jogo> buscarJogosPelaData(Date data) throws SQLException;
	public void limparTabelas() throws SQLException;
	public void limparJogos() throws SQLException;
	public int buscarCodigoTime(String time) throws SQLException;
	public void preencherJogos(JogoUpdate ju) throws SQLException;
	public List<QuartaFinal> quartasDeFinal() throws SQLException;
	public List<Jogo> buscaNomeTime(String data) throws SQLException;

}
