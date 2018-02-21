package br.com.sistJCJ.conroller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.sistJCJ.dao.CadResultDao;
import br.com.sistJCJ.model.CadResult;
import br.com.sistJCJ.regra.ResultRegra;

@Controller
public class CadastroController {
	
	@Autowired
	CadResultDao cadResultDao;
	@Autowired
	ResultRegra regras;
	
	@RequestMapping("cadastrar/resultados") // abre a página de cadasro de resultados
	public String cadastroResult(){
		return "/cadastrar/cadResult";
	}
	
	@RequestMapping("cadastrar/gravar")      // grava um novo resultado
	public String gravar(CadResult resultado){
	regras.gravarResultados(resultado);
		return "/cadastrar/cadResult";
	}
	
  @RequestMapping("cadastrar/addresulttxt")  // pega os numeros do TXT externo
  public String addresultTxt() throws IOException {
	  regras.pagaNumerosDoTXT();
		return"/cadastrar/lotofacil";
	}
  
  @RequestMapping("cadastrar/listarresultado")
  public ModelAndView listarResult(CadResult nunConcurso){
	  int numConcurso = nunConcurso.getNunConcurso();
	     List<CadResult> resultado = cadResultDao.buscarResult(numConcurso);; 
		ModelAndView modelAndView = new ModelAndView("/cadastrar/cadResult");
		modelAndView.addObject("resultados", resultado); // levando para a
		
		return modelAndView;
  }
  
  
}
