package br.com.fieesqControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fieesq.dao.FieEsqDao54321;
import br.com.fieesq.model54321.*;
import br.com.sistJCJ.regra.ResultRegra;

@Controller
public class FieEsq54321Controller {
	@Autowired
	FieEsqDao54321 fienumeroList;
	@Autowired
	ResultRegra regas;

	@RequestMapping("/esquemas/esq54321/54321")
	public ModelAndView listEsqLotofacil54321(FieEsq54321 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq54321> fieEsqLista = fienumeroList.listarFieEsq54321(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/54321");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/14325")
	public ModelAndView listEsqLotofacil14325(FieEsq14325 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq14325> fieEsqLista = fienumeroList.listarFieEsq14325(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/14325");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/14352")
	public ModelAndView listEsqLotofacil14352(FieEsq14352 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq14352> fieEsqLista = fienumeroList.listarFieEsq14352(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/14352");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/14253")
	public ModelAndView listEsqLotofacil14253(FieEsq14253 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq14253> fieEsqLista = fienumeroList.listarFieEsq14253(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/14253");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/14523")
	public ModelAndView listEsqLotofacil14523(FieEsq14523 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq14523> fieEsqLista = fienumeroList.listarFieEsq14523(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/14523");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/14235")
	public ModelAndView listEsqLotofacil14235(FieEsq14235 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq14235> fieEsqLista = fienumeroList.listarFieEsq14235(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/14235");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/14532")
	public ModelAndView listEsqLotofacil14532(FieEsq14532 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq14532> fieEsqLista = fienumeroList.listarFieEsq14532(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/14532");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/13425")
	public ModelAndView listEsqLotofacil13425(FieEsq13425 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq13425> fieEsqLista = fienumeroList.listarFieEsq13425(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/13425");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/13452")
	public ModelAndView listEsqLotofacil13452(FieEsq13452 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq13452> fieEsqLista = fienumeroList.listarFieEsq13452(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/13452");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/13245")
	public ModelAndView listEsqLotofacil13245(FieEsq13245 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq13245> fieEsqLista = fienumeroList.listarFieEsq13245(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/13245");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/13254")
	public ModelAndView listEsqLotofacil13254(FieEsq13254 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq13254> fieEsqLista = fienumeroList.listarFieEsq13254(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/13254");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/13542")
	public ModelAndView listEsqLotofacil13542(FieEsq13542 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq13542> fieEsqLista = fienumeroList.listarFieEsq13542(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/13542");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/13524")
	public ModelAndView listEsqLotofacil13524(FieEsq13524 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq13524> fieEsqLista = fienumeroList.listarFieEsq13524(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/13524");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/12435")
	public ModelAndView listEsqLotofacil12435(FieEsq12435 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq12435> fieEsqLista = fienumeroList.listarFieEsq12435(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/12435");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/12453")
	public ModelAndView listEsqLotofacil12453(FieEsq12453 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq12453> fieEsqLista = fienumeroList.listarFieEsq12453(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/12453");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}

	@RequestMapping("/esquemas/esq54321/12345")
	public ModelAndView listEsqLotofacil12345(FieEsq12345 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq12345> fieEsqLista = fienumeroList.listarFieEsq12345(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/12345");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/12354")
	public ModelAndView listEsqLotofacil12354(FieEsq12354 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq12354> fieEsqLista = fienumeroList.listarFieEsq12354(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/12354");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/12543")
	public ModelAndView listEsqLotofacil12543(FieEsq12543 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq12543> fieEsqLista = fienumeroList.listarFieEsq12543(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/12543");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/12534")
	public ModelAndView listEsqLotofacil12534(FieEsq12534 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq12534> fieEsqLista = fienumeroList.listarFieEsq12534(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/12534");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/15432")
	public ModelAndView listEsqLotofacil15432(FieEsq15432 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq15432> fieEsqLista = fienumeroList.listarFieEsq15432(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/15432");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/15423")
	public ModelAndView listEsqLotofacil15423(FieEsq15423 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq15423> fieEsqLista = fienumeroList.listarFieEsq15423(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/15423");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/15342")
	public ModelAndView listEsqLotofacil15342(FieEsq15342 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq15342> fieEsqLista = fienumeroList.listarFieEsq15342(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/15342");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/15324")
	public ModelAndView listEsqLotofacil15324(FieEsq15324 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq15324> fieEsqLista = fienumeroList.listarFieEsq15324(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/15324");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/15243")
	public ModelAndView listEsqLotofacil15243(FieEsq15243 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq15243> fieEsqLista = fienumeroList.listarFieEsq15243(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/15243");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/15234")
	public ModelAndView listEsqLotofacil15234(FieEsq15234 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq15234> fieEsqLista = fienumeroList.listarFieEsq15234(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/15234");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/24315")
	public ModelAndView listEsqLotofacil24315(FieEsq24315 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq24315> fieEsqLista = fienumeroList.listarFieEsq24315(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/24315");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/24351")
	public ModelAndView listEsqLotofacil24351(FieEsq24351 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq24351> fieEsqLista = fienumeroList.listarFieEsq24351(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/24351");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/24153")
	public ModelAndView listEsqLotofacil24153(FieEsq24153 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq24153> fieEsqLista = fienumeroList.listarFieEsq24153(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/24153");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/24513")
	public ModelAndView listEsqLotofacil24513(FieEsq24513 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq24513> fieEsqLista = fienumeroList.listarFieEsq24513(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/24513");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/24135")
	public ModelAndView listEsqLotofacil24135(FieEsq24135 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq24135> fieEsqLista = fienumeroList.listarFieEsq24135(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/24135");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/24531")
	public ModelAndView listEsqLotofacil24531(FieEsq24531 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq24531> fieEsqLista = fienumeroList.listarFieEsq24531(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/24531");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/23415")
	public ModelAndView listEsqLotofacil23415(FieEsq23415 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq23415> fieEsqLista = fienumeroList.listarFieEsq23415(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/23415");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/23451")
	public ModelAndView listEsqLotofacil23451(FieEsq23451 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq23451> fieEsqLista = fienumeroList.listarFieEsq23451(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/23451");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/23145")
	public ModelAndView listEsqLotofacil23145(FieEsq23145 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq23145> fieEsqLista = fienumeroList.listarFieEsq23145(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/23145");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/23154")
	public ModelAndView listEsqLotofacil23154(FieEsq23154 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq23154> fieEsqLista = fienumeroList.listarFieEsq23154(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/23154");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}

	@RequestMapping("/esquemas/esq54321/23541")
	public ModelAndView listEsqLotofacil23541(FieEsq23541 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq23541> fieEsqLista = fienumeroList.listarFieEsq23541(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/23541");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/23514")
	public ModelAndView listEsqLotofacil23514(FieEsq23514 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq23514> fieEsqLista = fienumeroList.listarFieEsq23514(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/23514");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/21435")
	public ModelAndView listEsqLotofacil21435(FieEsq21435 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq21435> fieEsqLista = fienumeroList.listarFieEsq21435(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/21435");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/21453")
	public ModelAndView listEsqLotofacil21453(FieEsq21453 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq21453> fieEsqLista = fienumeroList.listarFieEsq21453(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/21453");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/21345")
	public ModelAndView listEsqLotofacil21345(FieEsq21345 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq21345> fieEsqLista = fienumeroList.listarFieEsq21345(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/21345");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/21354")
	public ModelAndView listEsqLotofacil21354(FieEsq21354 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq21354> fieEsqLista = fienumeroList.listarFieEsq21354(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/21354");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/21543")
	public ModelAndView listEsqLotofacil21543(FieEsq21543 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq21543> fieEsqLista = fienumeroList.listarFieEsq21543(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/21543");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/21534")
	public ModelAndView listEsqLotofacil21534(FieEsq21534 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq21534> fieEsqLista = fienumeroList.listarFieEsq21534(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/21534");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/25431")
	public ModelAndView listEsqLotofacil25431(FieEsq25431 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq25431> fieEsqLista = fienumeroList.listarFieEsq25431(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/25431");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/25413")
	public ModelAndView listEsqLotofacil25413(FieEsq25413 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq25413> fieEsqLista = fienumeroList.listarFieEsq25413(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/25413");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/25341")
	public ModelAndView listEsqLotofacil25341(FieEsq25341 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq25341> fieEsqLista = fienumeroList.listarFieEsq25341(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/25341");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/25314")
	public ModelAndView listEsqLotofacil25314(FieEsq25314 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq25314> fieEsqLista = fienumeroList.listarFieEsq25314(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/25314");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/25143")
	public ModelAndView listEsqLotofacil25143(FieEsq25143 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq25143> fieEsqLista = fienumeroList.listarFieEsq25143(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/25143");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/25134")
	public ModelAndView listEsqLotofacil25134(FieEsq25134 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq25134> fieEsqLista = fienumeroList.listarFieEsq25134(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/25134");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/34215")
	public ModelAndView listEsqLotofacil34215(FieEsq34215 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq34215> fieEsqLista = fienumeroList.listarFieEsq34215(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/34215");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/34251")
	public ModelAndView listEsqLotofacil34251(FieEsq34251 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq34251> fieEsqLista = fienumeroList.listarFieEsq34251(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/34251");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/34152")
	public ModelAndView listEsqLotofacil34152(FieEsq34152 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq34152> fieEsqLista = fienumeroList.listarFieEsq34152(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/34152");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/34512")
	public ModelAndView listEsqLotofacil34512(FieEsq34512 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq34512> fieEsqLista = fienumeroList.listarFieEsq34512(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/34512");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/34125")
	public ModelAndView listEsqLotofacil34125(FieEsq34125 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq34125> fieEsqLista = fienumeroList.listarFieEsq34125(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/34125");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/34521")
	public ModelAndView listEsqLotofacil34521(FieEsq34521 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq34521> fieEsqLista = fienumeroList.listarFieEsq34521(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/34521");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/32415")
	public ModelAndView listEsqLotofacil32415(FieEsq32415 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq32415> fieEsqLista = fienumeroList.listarFieEsq32415(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/32415");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/32451")
	public ModelAndView listEsqLotofacil32451(FieEsq32451 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq32451> fieEsqLista = fienumeroList.listarFieEsq32451(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/32451");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/32145")
	public ModelAndView listEsqLotofacil32145(FieEsq32145 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq32145> fieEsqLista = fienumeroList.listarFieEsq32145(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/32145");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/32154")
	public ModelAndView listEsqLotofacil32154(FieEsq32154 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq32154> fieEsqLista = fienumeroList.listarFieEsq32154(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/32154");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/32541")
	public ModelAndView listEsqLotofacil32541(FieEsq32541 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq32541> fieEsqLista = fienumeroList.listarFieEsq32541(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/32541");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/32514")
	public ModelAndView listEsqLotofacil32514(FieEsq32514 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq32514> fieEsqLista = fienumeroList.listarFieEsq32514(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/32514");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/31425")
	public ModelAndView listEsqLotofacil31425(FieEsq31425 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq31425> fieEsqLista = fienumeroList.listarFieEsq31425(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/31425");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/31452")
	public ModelAndView listEsqLotofacil31452(FieEsq31452 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq31452> fieEsqLista = fienumeroList.listarFieEsq31452(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/31452");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/31245")
	public ModelAndView listEsqLotofacil31245(FieEsq31245 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq31245> fieEsqLista = fienumeroList.listarFieEsq31245(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/31245");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/31254")
	public ModelAndView listEsqLotofacil31254(FieEsq31254 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq31254> fieEsqLista = fienumeroList.listarFieEsq31254(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/31254");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/31542")
	public ModelAndView listEsqLotofacil31542(FieEsq31542 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq31542> fieEsqLista = fienumeroList.listarFieEsq31542(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/31542");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/31524")
	public ModelAndView listEsqLotofacil31524(FieEsq31524 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq31524> fieEsqLista = fienumeroList.listarFieEsq31524(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/31524");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/35421")
	public ModelAndView listEsqLotofacil35421(FieEsq35421 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq35421> fieEsqLista = fienumeroList.listarFieEsq35421(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/35421");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/35412")
	public ModelAndView listEsqLotofacil35412(FieEsq35412 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq35412> fieEsqLista = fienumeroList.listarFieEsq35412(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/35412");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/35241")
	public ModelAndView listEsqLotofacil35241(FieEsq35241 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq35241> fieEsqLista = fienumeroList.listarFieEsq35241(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/35241");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/35214")
	public ModelAndView listEsqLotofacil35214(FieEsq35214 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq35214> fieEsqLista = fienumeroList.listarFieEsq35214(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/35214");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/35142")
	public ModelAndView listEsqLotofacil35142(FieEsq35142 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq35142> fieEsqLista = fienumeroList.listarFieEsq35142(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/35142");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/35124")
	public ModelAndView listEsqLotofacil35124(FieEsq35124 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq35124> fieEsqLista = fienumeroList.listarFieEsq35124(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/35124");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/43215")
	public ModelAndView listEsqLotofacil43215(FieEsq43215 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq43215> fieEsqLista = fienumeroList.listarFieEsq43215(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/43215");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/43251")
	public ModelAndView listEsqLotofacil43251(FieEsq43251 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq43251> fieEsqLista = fienumeroList.listarFieEsq43251(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/43251");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/43152")
	public ModelAndView listEsqLotofacil43152(FieEsq43152 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq43152> fieEsqLista = fienumeroList.listarFieEsq43152(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/43152");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/43512")
	public ModelAndView listEsqLotofacil43512(FieEsq43512 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq43512> fieEsqLista = fienumeroList.listarFieEsq43512(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/43512");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/43125")
	public ModelAndView listEsqLotofacil43125(FieEsq43125 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq43125> fieEsqLista = fienumeroList.listarFieEsq43125(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/43125");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/43521")
	public ModelAndView listEsqLotofacil43521(FieEsq43521 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq43521> fieEsqLista = fienumeroList.listarFieEsq43521(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/43521");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/42315")
	public ModelAndView listEsqLotofacil42315(FieEsq42315 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq42315> fieEsqLista = fienumeroList.listarFieEsq42315(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/42315");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/42351")
	public ModelAndView listEsqLotofacil42351(FieEsq42351 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq42351> fieEsqLista = fienumeroList.listarFieEsq42351(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/42351");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/42135")
	public ModelAndView listEsqLotofacil42135(FieEsq42135 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq42135> fieEsqLista = fienumeroList.listarFieEsq42135(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/42135");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/42153")
	public ModelAndView listEsqLotofacil42153(FieEsq42153 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq42153> fieEsqLista = fienumeroList.listarFieEsq42153(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/42153");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/42531")
	public ModelAndView listEsqLotofacil42531(FieEsq42531 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq42531> fieEsqLista = fienumeroList.listarFieEsq42531(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/42531");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/42513")
	public ModelAndView listEsqLotofacil42513(FieEsq42513 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq42513> fieEsqLista = fienumeroList.listarFieEsq42513(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/42513");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/41325")
	public ModelAndView listEsqLotofacil41325(FieEsq41325 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq41325> fieEsqLista = fienumeroList.listarFieEsq41325(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/41325");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/41352")
	public ModelAndView listEsqLotofacil41352(FieEsq41352 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq41352> fieEsqLista = fienumeroList.listarFieEsq41352(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/41352");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/41235")
	public ModelAndView listEsqLotofacil41235(FieEsq41235 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq41235> fieEsqLista = fienumeroList.listarFieEsq41235(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/41235");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/41253")
	public ModelAndView listEsqLotofacil41253(FieEsq41253 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq41253> fieEsqLista = fienumeroList.listarFieEsq41253(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/41253");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/41532")
	public ModelAndView listEsqLotofacil41532(FieEsq41532 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq41532> fieEsqLista = fienumeroList.listarFieEsq41532(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/41532");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/41523")
	public ModelAndView listEsqLotofacil41523(FieEsq41523 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq41523> fieEsqLista = fienumeroList.listarFieEsq41523(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/41523");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/45321")
	public ModelAndView listEsqLotofacil45321(FieEsq45321 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq45321> fieEsqLista = fienumeroList.listarFieEsq45321(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/45321");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/45312")
	public ModelAndView listEsqLotofacil45312(FieEsq45312 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq45312> fieEsqLista = fienumeroList.listarFieEsq45312(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/45312");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/45231")
	public ModelAndView listEsqLotofacil45231(FieEsq45231 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq45231> fieEsqLista = fienumeroList.listarFieEsq45231(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/45231");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/45213")
	public ModelAndView listEsqLotofacil45213(FieEsq45213 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq45213> fieEsqLista = fienumeroList.listarFieEsq45213(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/45213");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/45132")
	public ModelAndView listEsqLotofacil45132(FieEsq45132 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq45132> fieEsqLista = fienumeroList.listarFieEsq45132(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/45132");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/45123")
	public ModelAndView listEsqLotofacil45123(FieEsq45123 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq45123> fieEsqLista = fienumeroList.listarFieEsq45123(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/45123");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/54312")
	public ModelAndView listEsqLotofacil54312(FieEsq54312 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq54312> fieEsqLista = fienumeroList.listarFieEsq54312(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/54312");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/54213")
	public ModelAndView listEsqLotofacil54213(FieEsq54213 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq54213> fieEsqLista = fienumeroList.listarFieEsq54213(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/54213");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/54123")
	public ModelAndView listEsqLotofacil54123(FieEsq54123 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq54123> fieEsqLista = fienumeroList.listarFieEsq54123(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/54123");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/54231")
	public ModelAndView listEsqLotofacil54231(FieEsq54231 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq54231> fieEsqLista = fienumeroList.listarFieEsq54231(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/54231");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/54132")
	public ModelAndView listEsqLotofacil54132(FieEsq54132 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq54132> fieEsqLista = fienumeroList.listarFieEsq54132(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/54132");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/53421")
	public ModelAndView listEsqLotofacil53421(FieEsq53421 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq53421> fieEsqLista = fienumeroList.listarFieEsq53421(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/53421");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/53412")
	public ModelAndView listEsqLotofacil53412(FieEsq53412 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq53412> fieEsqLista = fienumeroList.listarFieEsq53412(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/53412");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/53241")
	public ModelAndView listEsqLotofacil53241(FieEsq53241 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq53241> fieEsqLista = fienumeroList.listarFieEsq53241(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/53241");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/53214")
	public ModelAndView listEsqLotofacil53214(FieEsq53214 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq53214> fieEsqLista = fienumeroList.listarFieEsq53214(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/53214");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/53142")
	public ModelAndView listEsqLotofacil53142(FieEsq53142 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq53142> fieEsqLista = fienumeroList.listarFieEsq53142(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/53142");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/53124")
	public ModelAndView listEsqLotofacil53124(FieEsq53124 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq53124> fieEsqLista = fienumeroList.listarFieEsq53124(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/53124");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}

	@RequestMapping("/esquemas/esq54321/52431")
	public ModelAndView listEsqLotofacil52431(FieEsq52431 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq52431> fieEsqLista = fienumeroList.listarFieEsq52431(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/52431");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/52413")
	public ModelAndView listEsqLotofacil52413(FieEsq52413 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq52413> fieEsqLista = fienumeroList.listarFieEsq52413(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/52413");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/52341")
	public ModelAndView listEsqLotofacil52341(FieEsq52341 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq52341> fieEsqLista = fienumeroList.listarFieEsq52341(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/52341");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/52314")
	public ModelAndView listEsqLotofacil52314(FieEsq52314 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq52314> fieEsqLista = fienumeroList.listarFieEsq52314(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/52314");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/52143")
	public ModelAndView listEsqLotofacil52143(FieEsq52143 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq52143> fieEsqLista = fienumeroList.listarFieEsq52143(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/52143");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/52134")
	public ModelAndView listEsqLotofacil52134(FieEsq52134 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq52134> fieEsqLista = fienumeroList.listarFieEsq52134(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/52134");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/51432")
	public ModelAndView listEsqLotofacil51432(FieEsq51432 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq51432> fieEsqLista = fienumeroList.listarFieEsq51432(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/51432");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/51423")
	public ModelAndView listEsqLotofacil51423(FieEsq51423 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq51423> fieEsqLista = fienumeroList.listarFieEsq51423(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/51423");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/51342")
	public ModelAndView listEsqLotofacil51342(FieEsq51342 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq51342> fieEsqLista = fienumeroList.listarFieEsq51342(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/51342");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/51324")
	public ModelAndView listEsqLotofacil51324(FieEsq51324 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq51324> fieEsqLista = fienumeroList.listarFieEsq51324(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/51324");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/51243")
	public ModelAndView listEsqLotofacil51243(FieEsq51243 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq51243> fieEsqLista = fienumeroList.listarFieEsq51243(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/51243");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54321/51234")
	public ModelAndView listEsqLotofacil51234(FieEsq51234 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq51234> fieEsqLista = fienumeroList.listarFieEsq51234(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54321/51234");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}


	

}

