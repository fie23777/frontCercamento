package br.com.fieesq.model44322;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class FieEsq22344 {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	
	private String numEsq22344;
	
	@Transient
	private String esqParam; // o nome na view tem que ser o mesmo para passar como parametro.
	@Transient
	private String linha1; // o nome na view tem que ser o mesmo para passar como parametro.
	@Transient
	private String linha2; // o nome na view tem que ser o mesmo para passar como parametro.
	@Transient
	private String linha3; // o nome na view tem que ser o mesmo para passar como parametro.
	@Transient
	private String linha4; // o nome na view tem que ser o mesmo para passar como parametro.
	@Transient
	private String linha5; // o nome na view tem que ser o mesmo para passar como parametro.

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumEsq22344() {
		return numEsq22344;
	}

	public void setNumEsq22344(String numEsq22344) {
		this.numEsq22344 = numEsq22344;
	}

	public String getEsqParam() {
		return esqParam;
	}

	public void setEsqParam(String esqParam) {
		this.esqParam = esqParam;
	}

	
	public String getLinha1() {
		return linha1;
	}

	public void setLinha1(String linha1) {
		this.linha1 = linha1;
	}

	public String getLinha2() {
		return linha2;
	}

	public void setLinha2(String linha2) {
		this.linha2 = linha2;
	}

	public String getLinha3() {
		return linha3;
	}

	public void setLinha3(String linha3) {
		this.linha3 = linha3;
	}

	public String getLinha4() {
		return linha4;
	}

	public void setLinha4(String linha4) {
		this.linha4 = linha4;
	}

	public String getLinha5() {
		return linha5;
	}

	public void setLinha5(String linha5) {
		this.linha5 = linha5;
	}

	@Override
	public String toString() {
		return "" + numEsq22344 + "";
	}
}
	