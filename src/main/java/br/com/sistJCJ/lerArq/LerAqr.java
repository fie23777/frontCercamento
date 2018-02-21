package br.com.sistJCJ.lerArq;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LerAqr {

	public static void main(String[] args) throws IOException {
		
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
					
						   //String numeros = matcher.group();    // todos os grupos
						   String concurso = matcher.group(1);  // um separado por "(número do concurso)"
						  // String data = matcher.group(2);      // um separado por "(datza do sorteio)"
						   String numerosSorteados = matcher.group(3);  // um separado por "(números sorteados)"
				           String novastring = numerosSorteados.replace(" ", "-"); // colocando "-" 
				           System.out.println(concurso);
				           System.out.println(novastring);
                   }
	    }
		
		reader.close();
		br.close();
	}
}
