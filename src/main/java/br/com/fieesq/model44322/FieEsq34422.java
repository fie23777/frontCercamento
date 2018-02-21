package br.com.fieesq.model44322;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
@Entity
public class FieEsq34422 {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	
	private String numEsq34422;
	
	@Transient
	private String esqParam; // o nome na view tem que ser o mesmo para passar como parametro.

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumEsq34422() {
		return numEsq34422;
	}

	public void setNumEsq34422(String numEsq34422) {
		this.numEsq34422 = numEsq34422;
	}

	public String getEsqParam() {
		return esqParam;
	}

	public void setEsqParam(String esqParam) {
		this.esqParam = esqParam;
	}

	
}
