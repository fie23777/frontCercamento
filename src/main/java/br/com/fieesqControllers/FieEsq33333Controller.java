package br.com.fieesqControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fieesq.dao.FieEsqDao33333;
import br.com.fieesq.model33333.FieEsq33333;
import br.com.sistJCJ.regra.ResultRegra;

@Controller
public class FieEsq33333Controller {

	@Autowired
	FieEsqDao33333 fienumeroList;
	@Autowired
	ResultRegra regas;

	@RequestMapping("/esquemas/esq33333/33333")
	public ModelAndView listEsqLotofacil33333(FieEsq33333 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq33333> fieEsqLista = fienumeroList.listarFieEsq33333(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq33333/33333");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
}
