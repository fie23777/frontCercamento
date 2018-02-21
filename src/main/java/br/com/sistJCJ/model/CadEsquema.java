package br.com.sistJCJ.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class CadEsquema {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String esquema;
	private String resultado;
	private int concurso;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEsquema() {
		return esquema;
	}
	public void setEsquema(String esquema) {
		this.esquema = esquema;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	public int getConcurso() {
		return concurso;
	}
	public void setConcurso(int concurso) {
		this.concurso = concurso;
	}
	
	
	
}

