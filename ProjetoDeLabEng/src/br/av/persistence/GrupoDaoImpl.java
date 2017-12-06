package br.av.persistence;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.av.model.Grupo;

public class GrupoDaoImpl implements GrupoDao{

private Connection c;
	
	public GrupoDaoImpl() {
		GenericDao gDao = new GenericDaoImpl();
		c = gDao.getConnection();
	}
	
	@Override
	public List<Grupo> sorteiaGruposA(){
		List<Grupo> listaA = new ArrayList<Grupo>();
		String sql = "select * from v_TimesGrupoA";
		PreparedStatement ps;
		try {
			ps = c.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Grupo g = new Grupo();
				g.setGrupo(rs.getString("Grupo"));
				g.setTime(rs.getString("NomeTime"));
				listaA.add(g);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaA;
	}

	@Override
	public List<Grupo> sorteiaGruposB(){
		List<Grupo> listaB = new ArrayList<Grupo>();
		String sql = "select * from v_TimesGrupoB";
		PreparedStatement ps;
		try {
			ps = c.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Grupo g = new Grupo();
				g.setGrupo(rs.getString("Grupo"));
				g.setTime(rs.getString("NomeTime"));
				listaB.add(g);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaB;
	}

	@Override
	public List<Grupo> sorteiaGruposC(){
		List<Grupo> listaC = new ArrayList<Grupo>();
		String sql = "select * from v_TimesGrupoC";
		PreparedStatement ps;
		try {
			ps = c.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Grupo g = new Grupo();
				g.setGrupo(rs.getString("Grupo"));
				g.setTime(rs.getString("NomeTime"));
				listaC.add(g);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listaC;
	}

	@Override
	public List<Grupo> sorteiaGruposD(){
		List<Grupo> listaD = new ArrayList<Grupo>();
		String sql = "select * from v_TimesGrupoD";
		PreparedStatement ps;
		try {
			ps = c.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Grupo g = new Grupo();
				g.setGrupo(rs.getString("Grupo"));
				g.setTime(rs.getString("NomeTime"));
				listaD.add(g);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listaD;
	}
	
	
	@Override
	public void sortearGrupos() throws SQLException {

		String sql = "{call sp_preencherGrupos}";
		try {
			CallableStatement cs = c.prepareCall(sql);
			cs.execute();
			cs.close();
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
	}
	
	@Override
	public List<Grupo> grupoA() throws SQLException {
		List<Grupo> lista = new ArrayList<Grupo>();
		String sql = "select * from   v_campeonatoGeral where grupo = 'A'";
		PreparedStatement ps;
		try {
			ps = c.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Grupo g = new Grupo();
				g.setGrupo(rs.getString("grupo"));
				g.setTime(rs.getString("nome_time"));
				g.setnJogos(rs.getInt("num_jogosDisputado"));
				g.setVitoria(rs.getInt("vitorias"));
				g.setEmpate(rs.getInt("empates"));
				g.setDerrota(rs.getInt("derrotas"));
				g.setGolsMarcados(rs.getInt("gols_marcados"));
				g.setGolsSofridos(rs.getInt("gols_sofridos"));
				g.setSaldo(rs.getInt("saldo_gols"));
				g.setPontos(rs.getInt("pontos"));
				g.setPosicao(rs.getInt("posicao"));
				lista.add(g);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public List<Grupo> grupoB() throws SQLException {
		List<Grupo> listab = new ArrayList<Grupo>();
		String sql = "select * from   v_campeonatoGeral where grupo = 'B'";
		PreparedStatement ps;
		try {
			ps = c.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Grupo g = new Grupo();
				g.setGrupo(rs.getString("grupo"));
				g.setTime(rs.getString("nome_time"));
				g.setnJogos(rs.getInt("num_jogosDisputado"));
				g.setVitoria(rs.getInt("vitorias"));
				g.setEmpate(rs.getInt("empates"));
				g.setDerrota(rs.getInt("derrotas"));
				g.setGolsMarcados(rs.getInt("gols_marcados"));
				g.setGolsSofridos(rs.getInt("gols_sofridos"));
				g.setSaldo(rs.getInt("saldo_gols"));
				g.setPontos(rs.getInt("pontos"));
				g.setPosicao(rs.getInt("posicao"));
				listab.add(g);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listab;
	}

	@Override
	public List<Grupo> grupoC() throws SQLException {
		List<Grupo> listac = new ArrayList<Grupo>();
		String sql = "select * from   v_campeonatoGeral where grupo = 'C'";
		PreparedStatement ps;
		try {
			ps = c.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Grupo g = new Grupo();
				g.setGrupo(rs.getString("grupo"));
				g.setTime(rs.getString("nome_time"));
				g.setnJogos(rs.getInt("num_jogosDisputado"));
				g.setVitoria(rs.getInt("vitorias"));
				g.setEmpate(rs.getInt("empates"));
				g.setDerrota(rs.getInt("derrotas"));
				g.setGolsMarcados(rs.getInt("gols_marcados"));
				g.setGolsSofridos(rs.getInt("gols_sofridos"));
				g.setSaldo(rs.getInt("saldo_gols"));
				g.setPontos(rs.getInt("pontos"));
				g.setPosicao(rs.getInt("posicao"));
				listac.add(g);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listac;
	}

	@Override
	public List<Grupo> grupoD(){
		List<Grupo> listad = new ArrayList<Grupo>();
		String sql = "select * from   v_campeonatoGeral where grupo = 'D'";
		PreparedStatement ps;
		try {
			ps = c.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Grupo g = new Grupo();
				g.setGrupo(rs.getString("grupo"));
				g.setTime(rs.getString("nome_time"));
				g.setnJogos(rs.getInt("num_jogosDisputado"));
				g.setVitoria(rs.getInt("vitorias"));
				g.setEmpate(rs.getInt("empates"));
				g.setDerrota(rs.getInt("derrotas"));
				g.setGolsMarcados(rs.getInt("gols_marcados"));
				g.setGolsSofridos(rs.getInt("gols_sofridos"));
				g.setSaldo(rs.getInt("saldo_gols"));
				g.setPontos(rs.getInt("pontos"));
				g.setPosicao(rs.getInt("posicao"));
				listad.add(g);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listad;
	}

	@Override
	public List<Grupo> classificacaoGeral(){
		List<Grupo> lista = new ArrayList<Grupo>();
		String sql = "select * from   v_campeonatoGeral";
		PreparedStatement ps;
		try {
			ps = c.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Grupo g = new Grupo();
				g.setGrupo(rs.getString("grupo"));
				g.setTime(rs.getString("nome_time"));
				g.setnJogos(rs.getInt("num_jogosDisputado"));
				g.setVitoria(rs.getInt("vitorias"));
				g.setEmpate(rs.getInt("empates"));
				g.setDerrota(rs.getInt("derrotas"));
				g.setGolsMarcados(rs.getInt("gols_marcados"));
				g.setGolsSofridos(rs.getInt("gols_sofridos"));
				g.setSaldo(rs.getInt("saldo_gols"));
				g.setPontos(rs.getInt("pontos"));
				g.setPosicao(rs.getInt("posicao"));
				lista.add(g);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lista;
	}
	
}
