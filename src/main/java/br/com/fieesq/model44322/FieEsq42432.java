package br.com.fieesq.model44322;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
@Entity
public class FieEsq42432 {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	
	private String numEsq42432;
	
	@Transient
	private String esqParam; // o nome na view tem que ser o mesmo para passar como parametro.

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumEsq42432() {
		return numEsq42432;
	}

	public void setNumEsq42432(String numEsq42432) {
		this.numEsq42432 = numEsq42432;
	}

	public String getEsqParam() {
		return esqParam;
	}

	public void setEsqParam(String esqParam) {
		this.esqParam = esqParam;
	}

	
}
