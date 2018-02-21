package br.com.fieesq.model44430;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
@Entity
public class FieEsq34440 {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	
	private String numEsq34440;
	
	@Transient
	private String esqParam;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumEsq34440() {
		return numEsq34440;
	}

	public void setNumEsq34440(String numEsq34440) {
		this.numEsq34440 = numEsq34440;
	}

	public String getEsqParam() {
		return esqParam;
	}

	public void setEsqParam(String esqParam) {
		this.esqParam = esqParam;
	}
	
	
}
