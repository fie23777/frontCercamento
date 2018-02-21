package br.com.sistJCJ.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CadResult {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int nunConcurso;
	private String resultado;
	private String esquema;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNunConcurso() {
		return nunConcurso;
	}
	public void setNunConcurso(int nunConcurso) {
		this.nunConcurso = nunConcurso;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	public String getEsquema() {
		return esquema;
	}
	public void setEsquema(String esquema) {
		this.esquema = esquema;
	}
	@Override
	public String toString() {
		return "" + nunConcurso + " " + resultado + "" + esquema + "";
	}
	
	

}
