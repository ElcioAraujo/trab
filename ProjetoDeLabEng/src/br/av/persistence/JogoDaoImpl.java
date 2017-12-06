package br.av.persistence;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.av.model.Jogo;
import br.av.model.JogoUpdate;
import br.av.model.QuartaFinal;

public class JogoDaoImpl implements JogoDao{
	
	private Connection c;
	
	public JogoDaoImpl() {
		GenericDao gDao = new GenericDaoImpl();
		c = gDao.getConnection();
	}

	

	@Override
	public void sorteiaJogos() {
		String sql = "{call sp_preencheJogos}";
		try {
			CallableStatement cs = c.prepareCall(sql);
			cs.execute();
			cs.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	@Override
	public List<Jogo> buscarJogosPelaData(Date data) {
		List<Jogo> lista = new ArrayList<Jogo>();
		String sql = "select timeA.nomeTime as TimeA, timeB.nomeTime as TimeB, Jogos.golsTimeA as GolsA, Jogos.golsTimeB as GolsB, Jogos.data as JogoData from Jogos inner join time timeA  on timeA.codigoTime = Jogos.codigoTimeA   inner join time timeB  on timeB.codigoTime = Jogos.codigoTimeB  where Jogos.data = ? order by Jogos.data";
		PreparedStatement ps;
		try {
			ps = c.prepareStatement(sql);

			ps.setDate(1, data);
			ResultSet rs = ps.executeQuery();
			
				while (rs.next()) {
					Jogo j = new Jogo();
					j.setTimeCasa(rs.getString("TimeA"));
					j.setTimeVisitante(rs.getString("TimeB"));
					j.setGolsTimeCasa(rs.getInt("GolsA"));
					j.setGolsTimeVisitante(rs.getInt("GolsB"));
					lista.add(j);
					
					
					
				} 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lista;
	}

	@Override
	public void limparTabelas(){
		String sql = "delete from grupos";
		PreparedStatement ps;
		try {
			ps = c.prepareStatement(sql);
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void limparJogos(){
		String sql = "delete from Jogos";
		PreparedStatement ps;
		try {
			ps = c.prepareStatement(sql);
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	

	@Override
	public int buscarCodigoTime(String time) throws SQLException {

		String sql = "Select codigoTime  from time where nomeTime like ?";
		int codigo=0;
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setString(1, time);
		ResultSet rs = ps.executeQuery();
		
		if ( rs.next()){
			
			codigo = rs.getInt("codigoTime");
		}
		
		
		return codigo;
	}

	@Override
	public void preencherJogos(JogoUpdate ju) throws SQLException {
		String sql = "update Jogos set golsTimeA = ? , golsTimeB = ? where codigoTimeA = ? and codigoTimeB = ? and data = ?   ";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setInt(1, ju.getGolA());
		ps.setInt(2, ju.getGolB());
		ps.setInt(3, ju.getIdTimeA());
		ps.setInt(4, ju.getIdTimeB());
		ps.setDate(5, ju.getData());
		ps.executeUpdate();
		ps.close();
		
		
	}


	@Override
	public List<QuartaFinal> quartasDeFinal() {
		List<QuartaFinal> listFinal = new ArrayList<QuartaFinal>();
		String sql = "select nomeTimeA , nomeTimeB from dbo.fn_QuartasFinais()";
		try {
			PreparedStatement ps = c.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				QuartaFinal q = new QuartaFinal();
				q.setTimeA(rs.getString("nomeTimeA"));
				q.setTimeB(rs.getString("nomeTimeB"));
				q.setIcon("X");
				listFinal.add(q);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listFinal;
	}



	@Override
	public List<Jogo> buscaNomeTime(String data) throws SQLException {
		List<Jogo> listaNomeTime = new ArrayList<Jogo>();
		String sql = "select timeA.nomeTime as TimeA, timeB.nomeTime as TimeB, Jogos.data as JogoData from Jogos inner join time timeA  on timeA.codigoTime = Jogos.codigoTimeA   inner join time timeB  on timeB.codigoTime = Jogos.codigoTimeB  where Jogos.data = ? order by Jogos.data";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setString(1, data);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			Jogo j = new Jogo();
			j.setTimeCasa(rs.getString("TimeA"));
			j.setTimeVisitante(rs.getString("TimeB"));
			listaNomeTime.add(j);
		}
		return listaNomeTime;
	}

}
