package br.av.model;


import java.sql.Date;

public class JogoUpdate {
	private int idTimeA  ;
	private int idTimeB ;
	private int golA;
	private int golB;
	private Date data ;
	
	

	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public int getIdTimeA() {
		return idTimeA;
	}
	public void setIdTimeA(int idTimeA) {
		this.idTimeA = idTimeA;
	}
	public int getIdTimeB() {
		return idTimeB;
	}
	public void setIdTimeB(int idTimeB) {
		this.idTimeB = idTimeB;
	}
	public int getGolA() {
		return golA;
	}
	public void setGolA(int golA) {
		this.golA = golA;
	}
	public int getGolB() {
		return golB;
	}
	public void setGolB(int golB) {
		this.golB = golB;
	}

}
