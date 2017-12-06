package br.av.model;


import java.sql.Date;

public class Jogo {
	
	private int idTimeCasa;
	private int idTimeVisitante;
	private String timeCasa;
	private String timeVisitante;
	private int golsTimeCasa;
	private int golsTimeVisitante;
	private Date data;
	
	
	public int getIdTimeCasa() {
		return idTimeCasa;
	}
	public void setIdTimeCasa(int idTimeCasa) {
		this.idTimeCasa = idTimeCasa;
	}
	public int getIdTimeVisitante() {
		return idTimeVisitante;
	}
	public void setIdTimeVisitante(int idTimeVisitante) {
		this.idTimeVisitante = idTimeVisitante;
	}
	public String getTimeCasa() {
		return timeCasa;
	}
	public void setTimeCasa(String timeCasa) {
		this.timeCasa = timeCasa;
	}
	public String getTimeVisitante() {
		return timeVisitante;
	}
	public void setTimeVisitante(String timeVisitante) {
		this.timeVisitante = timeVisitante;
	}
	public int getGolsTimeCasa() {
		return golsTimeCasa;
	}
	public void setGolsTimeCasa(int golsTimeCasa) {
		this.golsTimeCasa = golsTimeCasa;
	}
	public int getGolsTimeVisitante() {
		return golsTimeVisitante;
	}
	public void setGolsTimeVisitante(int golsTimeVisitante) {
		this.golsTimeVisitante = golsTimeVisitante;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
}
