package br.com.fieesqControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fieesq.dao.FieEsqDao43332;
import br.com.fieesq.model43332.FieEsq23334;
import br.com.fieesq.model43332.FieEsq23343;
import br.com.fieesq.model43332.FieEsq23433;
import br.com.fieesq.model43332.FieEsq24333;
import br.com.fieesq.model43332.FieEsq32334;
import br.com.fieesq.model43332.FieEsq32343;
import br.com.fieesq.model43332.FieEsq32433;
import br.com.fieesq.model43332.FieEsq33243;
import br.com.fieesq.model43332.FieEsq33324;
import br.com.fieesq.model43332.FieEsq33342;
import br.com.fieesq.model43332.FieEsq33423;
import br.com.fieesq.model43332.FieEsq34233;
import br.com.fieesq.model43332.FieEsq34323;
import br.com.fieesq.model43332.FieEsq34332;
import br.com.fieesq.model43332.FieEsq42333;
import br.com.fieesq.model43332.FieEsq43233;
import br.com.fieesq.model43332.FieEsq43323;
import br.com.fieesq.model43332.FieEsq43332;
import br.com.sistJCJ.regra.ResultRegra;

@Controller
public class FieEsq43332Controller {
	@Autowired
	FieEsqDao43332 fienumeroList;
	@Autowired
	ResultRegra regas;

	@RequestMapping("/esquemas/esq43332/43332")
	public ModelAndView listEsqLotofacil43332(FieEsq43332 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq43332> fieEsqLista = fienumeroList.listarFieEsq43332(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq43332/43332");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq43332/43323")
	public ModelAndView listEsqLotofacil43323(FieEsq43323 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq43323> fieEsqLista = fienumeroList.listarFieEsq43323(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq43332/43323");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq43332/43233")
	public ModelAndView listEsqLotofacil43233(FieEsq43233 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq43233> fieEsqLista = fienumeroList.listarFieEsq43233(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq43332/43233");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq43332/42333")
	public ModelAndView listEsqLotofacil42333(FieEsq42333 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq42333> fieEsqLista = fienumeroList.listarFieEsq42333(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq43332/42333");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq43332/33342")
	public ModelAndView listEsqLotofacil33342(FieEsq33342 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq33342> fieEsqLista = fienumeroList.listarFieEsq33342(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq43332/33342");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq43332/33324")
	public ModelAndView listEsqLotofacil33324(FieEsq33324 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq33324> fieEsqLista = fienumeroList.listarFieEsq33324(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq33324/33324");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq43332/33423")
	public ModelAndView listEsqLotofacil33423(FieEsq33423 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq33423> fieEsqLista = fienumeroList.listarFieEsq33423(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq43332/33423");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq43332/33243")
	public ModelAndView listEsqLotofacil33243(FieEsq33243 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq33243> fieEsqLista = fienumeroList.listarFieEsq33243(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq43332/33243");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq43332/34233")
	public ModelAndView listEsqLotofacil34233(FieEsq34233 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq34233> fieEsqLista = fienumeroList.listarFieEsq34233(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq43332/34233");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq43332/32433")
	public ModelAndView listEsqLotofacil32433(FieEsq32433 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq32433> fieEsqLista = fienumeroList.listarFieEsq32433(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq43332/32433");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq43332/34332")
	public ModelAndView listEsqLotofacil34332(FieEsq34332 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq34332> fieEsqLista = fienumeroList.listarFieEsq34332(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq43332/34332");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq43332/34323")
	public ModelAndView listEsqLotofacil34323(FieEsq34323 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq34323> fieEsqLista = fienumeroList.listarFieEsq34323(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq43332/34323");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq43332/32334")
	public ModelAndView listEsqLotofacil32334(FieEsq32334 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq32334> fieEsqLista = fienumeroList.listarFieEsq32334(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq43332/32334");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq43332/32343")
	public ModelAndView listEsqLotofacil32343(FieEsq32343 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq32343> fieEsqLista = fienumeroList.listarFieEsq32343(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq43332/32343");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq43332/24333")
	public ModelAndView listEsqLotofacil24333(FieEsq24333 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq24333> fieEsqLista = fienumeroList.listarFieEsq24333(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq43332/24333");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq43332/23433")
	public ModelAndView listEsqLotofacil23433(FieEsq23433 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq23433> fieEsqLista = fienumeroList.listarFieEsq23433(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq43332/23433");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq43332/23343")
	public ModelAndView listEsqLotofacil23343(FieEsq23343 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq23343> fieEsqLista = fienumeroList.listarFieEsq23343(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq43332/23343");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq43332/23334")
	public ModelAndView listEsqLotofacil23334(FieEsq23334 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq23334> fieEsqLista = fienumeroList.listarFieEsq23334(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq43332/23334");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	
} // fim da classe classe completa!
