package br.com.fieesq.model44322;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class FieEsq22434 {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	
	private String numEsq22434;
	
	@Transient
	private String esqParam; // o nome na view tem que ser o mesmo para passar como parametro.

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumEsq22434() {
		return numEsq22434;
	}

	public void setNumEsq22434(String numEsq22434) {
		this.numEsq22434 = numEsq22434;
	}

	public String getEsqParam() {
		return esqParam;
	}

	public void setEsqParam(String esqParam) {
		this.esqParam = esqParam;
	}

	
	
}
