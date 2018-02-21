package br.com.fieesq.model54330;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
@Entity
public class FieEsq04353 {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	
	private String numEsq04353;
	
	@Transient
	private String esqParam;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumEsq04353() {
		return numEsq04353;
	}

	public void setNumEsq04353(String numEsq04353) {
		this.numEsq04353 = numEsq04353;
	}

	public String getEsqParam() {
		return esqParam;
	}

	public void setEsqParam(String esqParam) {
		this.esqParam = esqParam;
	}
	
	
}
