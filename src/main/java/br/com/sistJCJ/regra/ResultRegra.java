package br.com.sistJCJ.regra;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import br.com.fieesq.model44322.FieEsq22344;
import br.com.sistJCJ.dao.CadResultDao;
import br.com.sistJCJ.dao.FieEsqDao;
import br.com.sistJCJ.model.CadResult;

@Transactional
public class ResultRegra {
	@Autowired
	CadResultDao cadResultDao;
	@Autowired
	FieEsqDao fienumeroList;

 public String criaEsquema(String resultArray) {
																	// de
	String[] resultArray1 = resultArray.split("-"); // usando spli
			int[] arrayTira = new int[5];
			int grupo1 = 0;
			int grupo2 = 0;
			int grupo3 = 0;
			int grupo4 = 0;
			int grupo5 = 0;
		     grupo1 = criaGrupo(resultArray1, arrayTira, 1, 2, 3, 4, 5);
		     grupo2 = criaGrupo(resultArray1, arrayTira, 6, 7, 8, 9, 10);
		     grupo3 = criaGrupo(resultArray1, arrayTira, 11, 12, 13, 14, 15);
		     grupo4 = criaGrupo(resultArray1, arrayTira, 16, 17, 18, 19, 20);
		     grupo5 = criaGrupo(resultArray1, arrayTira, 21, 22, 23, 24, 25);
			String grupos2 = grupo1 + "-" + grupo2 + "-" + grupo3 + "-" + grupo4 + "-" + grupo5;

			return grupos2;
	}
	
	//**************************************************************************************************888
	
	public String[] tiraNumerosEsquema(int linha1, int linha2, int linha3, int linha4, int linha5){
	
	  List<FieEsq22344> fieEsqLista = fienumeroList.listar(); // buscando n
	      String[] quantJogos = new String[145];  //quantidades de cartões gerados;
	
	boolean tem = false;
	int quant = 0;
	
	for (FieEsq22344 lista : fieEsqLista) { // adicionando na variavel
		String numConvertido = String.valueOf(lista); // convertendo de

		String[] numArray = numConvertido.split("-"); // usando split para criar um array de dos numeros
		
		int[] arrayTira = new int[5];
		
		int contador = 0;

		for (int i = 0; i < 15; i++) {

			      if ((Integer.parseInt(numArray[i]) == linha1
					|| Integer.parseInt(numArray[i]) == linha2
					|| Integer.parseInt(numArray[i]) == linha3 
					|| Integer.parseInt(numArray[i]) == linha4
					|| Integer.parseInt(numArray[i]) == linha5)) {
				arrayTira[contador] = Integer.parseInt(numArray[i]);
				
				contador++;

				if (arrayTira.length == 5) {
					tem = true;
					break;
				}
			}
		}

		if (tem) {      
			tem = false;
		} else if (!tem) {

			quant++;
			
			quantJogos[quant] = numConvertido;
			tem = false;
		}

	}
	 return quantJogos;
  }
	//**************************************************************************************
	public void pagaNumerosDoTXT() throws IOException{
		FileInputStream stream = new FileInputStream("C:/arquivoLotoFacil/resultadolotofacil.txt");
		InputStreamReader reader = new InputStreamReader(stream);
		BufferedReader br = new BufferedReader(reader);
		String linha = null;
		while((linha = br.readLine()) != null){
		
				Pattern padrao = Pattern.compile("(\\d{4})(\\s"
						+ "\\(\\d{2}\\/\\d{2}\\/\\d{4}\\)"
						+ "\\s)(\\d{2}\\s\\d{2}\\s\\d{2}\\s\\d{2}\\s\\d{2}\\s\\d{2}\\s\\d{2}\\s\\d{2}\\s\\d{2}\\s\\d{2}\\s\\d{2}\\s\\d{2}\\s\\d{2}\\s\\d{2}\\s\\d{2})");
				Matcher matcher = padrao.matcher(linha);
				
					while(matcher.find()) {
						
						CadResult resultado = new CadResult();
						
						   //String numeros = matcher.group();    // todos os grupos
						   int concurso = Integer.parseInt(matcher.group(1)) ;  // um separado por "(número do concurso)"
						  // String data = matcher.group(2);      // um separado por "(data do sorteio)"
						
						   String numerosSorteados = matcher.group(3);  // um separado por "(números sorteados)"
				           String numerosSorteado = numerosSorteados.replace(" ", "-"); // colocando "-" 
				           String  numerosSorteadoSemEspaco = numerosSorteado.replaceAll("\\s+","-");  // titando o ultimo espaco
				       				           
				           String grupos  = criaEsquema(numerosSorteadoSemEspaco);
  
						   System.out.println(concurso);
						   System.out.println(grupos);
				           System.out.println(numerosSorteadoSemEspaco);	
				           
				           
				           resultado.setResultado(numerosSorteado);
				           resultado.setNunConcurso(concurso);
				           resultado.setEsquema(grupos);
	           
						   cadResultDao.gravar(resultado); 
	                }
	    }
		reader.close();
		br.close();
  }
	//************************************************************************************************************************************************
	public int  criaGrupo(String[] resultArray, int[] arrayTira, int um, int dois, int tres, int quatro, int cinco){
		int grupo = 0;
		for (int i = 0; i < 15; i++) {

			if ((Integer.parseInt(resultArray[i]) == um || Integer.parseInt(resultArray[i]) == dois
					|| Integer.parseInt(resultArray[i]) == tres || Integer.parseInt(resultArray[i]) == quatro
					|| Integer.parseInt(resultArray[i]) == cinco)) {
				arrayTira[grupo] = Integer.parseInt(resultArray[i]);

				grupo++;
			}
		}
		return grupo;
	}
	
	public void gravarResultados(CadResult resultado ){
		
		String grupos  = criaEsquema(resultado.getResultado());
		resultado.setEsquema(grupos);
		resultado.getNunConcurso();
		resultado.getEsquema();
		
		cadResultDao.gravar(resultado);
	}
	
	

}
