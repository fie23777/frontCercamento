package br.com.fieesq.model44421;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
@Entity
public class FieEsq44214 {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	
	private String numEsq44214;
	
	@Transient
	private String esqParam;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumEsq44214() {
		return numEsq44214;
	}

	public void setNumEsq44214(String numEsq44214) {
		this.numEsq44214 = numEsq44214;
	}

	public String getEsqParam() {
		return esqParam;
	}

	public void setEsqParam(String esqParam) {
		this.esqParam = esqParam;
	}
	
	
}
