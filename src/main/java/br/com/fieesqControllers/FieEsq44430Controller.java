package br.com.fieesqControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fieesq.dao.FieEsqDao44430;
import br.com.fieesq.model44430.FieEsq03444;
import br.com.fieesq.model44430.FieEsq04344;
import br.com.fieesq.model44430.FieEsq04434;
import br.com.fieesq.model44430.FieEsq04443;
import br.com.fieesq.model44430.FieEsq30444;
import br.com.fieesq.model44430.FieEsq34044;
import br.com.fieesq.model44430.FieEsq34404;
import br.com.fieesq.model44430.FieEsq34440;
import br.com.fieesq.model44430.FieEsq40344;
import br.com.fieesq.model44430.FieEsq40434;
import br.com.fieesq.model44430.FieEsq40443;
import br.com.fieesq.model44430.FieEsq43044;
import br.com.fieesq.model44430.FieEsq43404;
import br.com.fieesq.model44430.FieEsq43440;
import br.com.fieesq.model44430.FieEsq44034;
import br.com.fieesq.model44430.FieEsq44304;
import br.com.fieesq.model44430.FieEsq44403;
import br.com.fieesq.model44430.FieEsq44430;
import br.com.sistJCJ.regra.ResultRegra;

@Controller
public class FieEsq44430Controller {
	@Autowired
	FieEsqDao44430 fienumeroList;
	@Autowired
	ResultRegra regas;

	@RequestMapping("/esquemas/esq44430/44430")
	public ModelAndView listEsqLotofacil44430(FieEsq44430 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq44430> fieEsqLista = fienumeroList.listarFieEsq44430(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44430/44430");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}	
	
	@RequestMapping("/esquemas/esq44430/34440")
	public ModelAndView listEsqLotofacil34440(FieEsq34440 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq34440> fieEsqLista = fienumeroList.listarFieEsq34440(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44430/34440");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}	
	
	@RequestMapping("/esquemas/esq44430/34404")
	public ModelAndView listEsqLotofacil34404(FieEsq34404 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq34404> fieEsqLista = fienumeroList.listarFieEsq34404(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44430/34404");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq44430/34044")
	public ModelAndView listEsqLotofacil34044(FieEsq34044 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq34044> fieEsqLista = fienumeroList.listarFieEsq34044(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44430/34044");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	
	@RequestMapping("/esquemas/esq44430/30444")
	public ModelAndView listEsqLotofacil30444(FieEsq30444 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq30444> fieEsqLista = fienumeroList.listarFieEsq30444(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44430/30444");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq44430/44403")
	public ModelAndView listEsqLotofacil44403(FieEsq44403 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq44403> fieEsqLista = fienumeroList.listarFieEsq44403(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44430/44403");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq44430/44304")
	public ModelAndView listEsqLotofacil44304(FieEsq44304 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq44304> fieEsqLista = fienumeroList.listarFieEsq44304(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44430/44304");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq44430/44034")
	public ModelAndView listEsqLotofacil44034(FieEsq44034 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq44034> fieEsqLista = fienumeroList.listarFieEsq44034(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44430/44034");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq44430/43044")
	public ModelAndView listEsqLotofacil43044(FieEsq43044 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq43044> fieEsqLista = fienumeroList.listarFieEsq43044(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44430/43044");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq44430/40344")
	public ModelAndView listEsqLotofacil40344(FieEsq40344 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq40344> fieEsqLista = fienumeroList.listarFieEsq40344(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44430/40344");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq44430/43440")
	public ModelAndView listEsqLotofacil43440(FieEsq43440 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq43440> fieEsqLista = fienumeroList.listarFieEsq43440(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44430/43440");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq44430/43404")
	public ModelAndView listEsqLotofacil43404(FieEsq43404 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq43404> fieEsqLista = fienumeroList.listarFieEsq43404(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44430/43404");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq44430/40443")
	public ModelAndView listEsqLotofacil40443(FieEsq40443 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq40443> fieEsqLista = fienumeroList.listarFieEsq40443(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44430/40443");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	

	@RequestMapping("/esquemas/esq44430/40434")
	public ModelAndView listEsqLotofacil40434(FieEsq40434 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq40434> fieEsqLista = fienumeroList.listarFieEsq40434(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44430/40434");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq44430/03444")
	public ModelAndView listEsqLotofacil03444(FieEsq03444 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq03444> fieEsqLista = fienumeroList.listarFieEsq03444(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44430/03444");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq44430/04344")
	public ModelAndView listEsqLotofacil04344(FieEsq04344 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq04344> fieEsqLista = fienumeroList.listarFieEsq04344(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44430/04344");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq44430/04434")
	public ModelAndView listEsqLotofacil04434(FieEsq04434 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq04434> fieEsqLista = fienumeroList.listarFieEsq04434(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44430/04434");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq44430/04443")
	public ModelAndView listEsqLotofacil04443(FieEsq04443 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq04443> fieEsqLista = fienumeroList.listarFieEsq04443(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44430/04443");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	
}
