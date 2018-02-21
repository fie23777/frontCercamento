package br.com.fieesq.model44430;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
@Entity
public class FieEsq43044 {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	
	private String numEsq43044;
	
	@Transient
	private String esqParam;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumEsq43044() {
		return numEsq43044;
	}

	public void setNumEsq43044(String numEsq43044) {
		this.numEsq43044 = numEsq43044;
	}

	public String getEsqParam() {
		return esqParam;
	}

	public void setEsqParam(String esqParam) {
		this.esqParam = esqParam;
	}
	
	
}
