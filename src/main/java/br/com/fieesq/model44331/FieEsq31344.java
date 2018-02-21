package br.com.fieesq.model44331;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
@Entity
public class FieEsq31344 {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	
	private String numEsq31344;
	
	@Transient
	private String esqParam;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumEsq31344() {
		return numEsq31344;
	}

	public void setNumEsq31344(String numEsq31344) {
		this.numEsq31344 = numEsq31344;
	}

	public String getEsqParam() {
		return esqParam;
	}

	public void setEsqParam(String esqParam) {
		this.esqParam = esqParam;
	}
	
	
}
