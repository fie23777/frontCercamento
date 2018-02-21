package br.com.fieesqControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fieesq.dao.FieEsqDao44331;
import br.com.fieesq.model44331.FieEsq13344;
import br.com.fieesq.model44331.FieEsq13434;
import br.com.fieesq.model44331.FieEsq13443;
import br.com.fieesq.model44331.FieEsq14334;
import br.com.fieesq.model44331.FieEsq14343;
import br.com.fieesq.model44331.FieEsq14433;
import br.com.fieesq.model44331.FieEsq31344;
import br.com.fieesq.model44331.FieEsq31434;
import br.com.fieesq.model44331.FieEsq31443;
import br.com.fieesq.model44331.FieEsq33144;
import br.com.fieesq.model44331.FieEsq33414;
import br.com.fieesq.model44331.FieEsq33441;
import br.com.fieesq.model44331.FieEsq34134;
import br.com.fieesq.model44331.FieEsq34143;
import br.com.fieesq.model44331.FieEsq34314;
import br.com.fieesq.model44331.FieEsq34341;
import br.com.fieesq.model44331.FieEsq34413;
import br.com.fieesq.model44331.FieEsq34431;
import br.com.fieesq.model44331.FieEsq41334;
import br.com.fieesq.model44331.FieEsq41343;
import br.com.fieesq.model44331.FieEsq41433;
import br.com.fieesq.model44331.FieEsq43134;
import br.com.fieesq.model44331.FieEsq43143;
import br.com.fieesq.model44331.FieEsq43314;
import br.com.fieesq.model44331.FieEsq43341;
import br.com.fieesq.model44331.FieEsq43413;
import br.com.fieesq.model44331.FieEsq43431;
import br.com.fieesq.model44331.FieEsq44133;
import br.com.fieesq.model44331.FieEsq44313;
import br.com.fieesq.model44331.FieEsq44331;
import br.com.sistJCJ.regra.ResultRegra;

@Controller
public class FieEsq44331Controller {
	@Autowired
	FieEsqDao44331 fienumeroList;
	@Autowired
	ResultRegra regas;

	@RequestMapping("/esquemas/esq44331/44331")
	public ModelAndView listEsqLotofacil44331(FieEsq44331 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form
		List<FieEsq44331> fieEsqLista = fienumeroList.listarFieEsq44331(esqParam);
		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44331/44331");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq44331/33144")
	public ModelAndView listEsqLotofacil33144(FieEsq33144 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form
		List<FieEsq33144> fieEsqLista = fienumeroList.listarFieEsq33144(esqParam);
		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44331/33144");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq44331/33414")
	public ModelAndView listEsqLotofacil33414(FieEsq33414 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form
		List<FieEsq33414> fieEsqLista = fienumeroList.listarFieEsq33414(esqParam);
		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44331/33414");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq44331/33441")
	public ModelAndView listEsqLotofacil33441(FieEsq33441 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form
		List<FieEsq33441> fieEsqLista = fienumeroList.listarFieEsq33441(esqParam);
		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44331/33441");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq44331/31344")
	public ModelAndView listEsqLotofacil31344(FieEsq31344 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form
		List<FieEsq31344> fieEsqLista = fienumeroList.listarFieEsq31344(esqParam);
		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44331/31344");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq44331/31434")
	public ModelAndView listEsqLotofacil31434(FieEsq31434 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form
		List<FieEsq31434> fieEsqLista = fienumeroList.listarFieEsq31434(esqParam);
		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44331/31434");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq44331/31443")
	public ModelAndView listEsqLotofacil31443(FieEsq31443 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form
		List<FieEsq31443> fieEsqLista = fienumeroList.listarFieEsq31443(esqParam);
		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44331/31443");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq44331/34314")
	public ModelAndView listEsqLotofacil34314(FieEsq34314 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form
		List<FieEsq34314> fieEsqLista = fienumeroList.listarFieEsq34314(esqParam);
		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44331/34314");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq44331/34341")
	public ModelAndView listEsqLotofacil34341(FieEsq34341 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form
		List<FieEsq34341> fieEsqLista = fienumeroList.listarFieEsq34341(esqParam);
		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44331/34341");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq44331/34134")
	public ModelAndView listEsqLotofacil34134(FieEsq34134 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form
		List<FieEsq34134> fieEsqLista = fienumeroList.listarFieEsq34134(esqParam);
		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44331/34134");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq44331/34143")
	public ModelAndView listEsqLotofacil34143(FieEsq34143 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form
		List<FieEsq34143> fieEsqLista = fienumeroList.listarFieEsq34143(esqParam);
		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44331/34143");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq44331/34431")
	public ModelAndView listEsqLotofacil34431(FieEsq34431 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form
		List<FieEsq34431> fieEsqLista = fienumeroList.listarFieEsq34431(esqParam);
		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44331/34431");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq44331/34413")
	public ModelAndView listEsqLotofacil34413(FieEsq34413 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form
		List<FieEsq34413> fieEsqLista = fienumeroList.listarFieEsq34413(esqParam);
		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44331/34413");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq44331/13344")
	public ModelAndView listEsqLotofacil13344(FieEsq13344 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form
		List<FieEsq13344> fieEsqLista = fienumeroList.listarFieEsq13344(esqParam);
		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44331/13344");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq44331/13434")
	public ModelAndView listEsqLotofacil13434(FieEsq13434 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form
		List<FieEsq13434> fieEsqLista = fienumeroList.listarFieEsq13434(esqParam);
		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44331/13434");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq44331/13443")
	public ModelAndView listEsqLotofacil13443(FieEsq13443 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form
		List<FieEsq13443> fieEsqLista = fienumeroList.listarFieEsq13443(esqParam);
		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44331/13443");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq44331/14433")
	public ModelAndView listEsqLotofacil14433(FieEsq14433 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form
		List<FieEsq14433> fieEsqLista = fienumeroList.listarFieEsq14433(esqParam);
		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44331/14433");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq44331/14343")
	public ModelAndView listEsqLotofacil14343(FieEsq14343 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form
		List<FieEsq14343> fieEsqLista = fienumeroList.listarFieEsq14343(esqParam);
		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44331/14343");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq44331/14334")
	public ModelAndView listEsqLotofacil14334(FieEsq14334 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form
		List<FieEsq14334> fieEsqLista = fienumeroList.listarFieEsq14334(esqParam);
		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44331/14334");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq44331/44133")
	public ModelAndView listEsqLotofacil44133(FieEsq44133 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form
		List<FieEsq44133> fieEsqLista = fienumeroList.listarFieEsq44133(esqParam);
		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44331/44133");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq44331/44313")
	public ModelAndView listEsqLotofacil44313(FieEsq44313 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form
		List<FieEsq44313> fieEsqLista = fienumeroList.listarFieEsq44313(esqParam);
		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44331/44313");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq44331/41433")
	public ModelAndView listEsqLotofacil41433(FieEsq41433 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form
		List<FieEsq41433> fieEsqLista = fienumeroList.listarFieEsq41433(esqParam);
		ModelAndView modelAndView = new ModelAndView("/esquemas/esq41433/41433");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq44331/41343")
	public ModelAndView listEsqLotofacil41343(FieEsq41343 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form
		List<FieEsq41343> fieEsqLista = fienumeroList.listarFieEsq41343(esqParam);
		ModelAndView modelAndView = new ModelAndView("/esquemas/esq41343/41343");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq44331/41334")
	public ModelAndView listEsqLotofacil41334(FieEsq41334 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form
		List<FieEsq41334> fieEsqLista = fienumeroList.listarFieEsq41334(esqParam);
		ModelAndView modelAndView = new ModelAndView("/esquemas/esq41334/41334");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq44331/43413")
	public ModelAndView listEsqLotofacil43413(FieEsq43413 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form
		List<FieEsq43413> fieEsqLista = fienumeroList.listarFieEsq43413(esqParam);
		ModelAndView modelAndView = new ModelAndView("/esquemas/esq43413/43413");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq44331/43431")
	public ModelAndView listEsqLotofacil43431(FieEsq43431 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form
		List<FieEsq43431> fieEsqLista = fienumeroList.listarFieEsq43431(esqParam);
		ModelAndView modelAndView = new ModelAndView("/esquemas/esq43431/43431");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq44331/43143")
	public ModelAndView listEsqLotofacil43143(FieEsq43143 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form
		List<FieEsq43143> fieEsqLista = fienumeroList.listarFieEsq43143(esqParam);
		ModelAndView modelAndView = new ModelAndView("/esquemas/esq43143/43143");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq44331/43134")
	public ModelAndView listEsqLotofacil43134(FieEsq43134 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form
		List<FieEsq43134> fieEsqLista = fienumeroList.listarFieEsq43134(esqParam);
		ModelAndView modelAndView = new ModelAndView("/esquemas/esq43134/43134");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq44331/43341")
	public ModelAndView listEsqLotofacil43341(FieEsq43341 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form
		List<FieEsq43341> fieEsqLista = fienumeroList.listarFieEsq43341(esqParam);
		ModelAndView modelAndView = new ModelAndView("/esquemas/esq43341/43341");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq44331/43314")
	public ModelAndView listEsqLotofacil43314(FieEsq43314 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form
		List<FieEsq43314> fieEsqLista = fienumeroList.listarFieEsq43314(esqParam);
		ModelAndView modelAndView = new ModelAndView("/esquemas/esq43314/43314");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
}
