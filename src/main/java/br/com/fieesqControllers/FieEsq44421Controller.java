package br.com.fieesqControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fieesq.dao.FieEsqDao44421;
import br.com.fieesq.model44421.FieEsq12444;
import br.com.fieesq.model44421.FieEsq14244;
import br.com.fieesq.model44421.FieEsq14424;
import br.com.fieesq.model44421.FieEsq14442;
import br.com.fieesq.model44421.FieEsq21444;
import br.com.fieesq.model44421.FieEsq24144;
import br.com.fieesq.model44421.FieEsq24414;
import br.com.fieesq.model44421.FieEsq24441;
import br.com.fieesq.model44421.FieEsq41244;
import br.com.fieesq.model44421.FieEsq41424;
import br.com.fieesq.model44421.FieEsq41442;
import br.com.fieesq.model44421.FieEsq42144;
import br.com.fieesq.model44421.FieEsq42414;
import br.com.fieesq.model44421.FieEsq42441;
import br.com.fieesq.model44421.FieEsq44124;
import br.com.fieesq.model44421.FieEsq44214;
import br.com.fieesq.model44421.FieEsq44412;
import br.com.fieesq.model44421.FieEsq44421;
import br.com.sistJCJ.regra.ResultRegra;

@Controller
public class FieEsq44421Controller {

	@Autowired
	FieEsqDao44421 fienumeroList;
	@Autowired
	ResultRegra regas;

	@RequestMapping("/esquemas/esq44421/44421")
	public ModelAndView listEsqLotofacil44421(FieEsq44421 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq44421> fieEsqLista = fienumeroList.listarFieEsq44421(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44421/44421");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq44421/14442")
	public ModelAndView listEsqLotofacil14442(FieEsq14442 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq14442> fieEsqLista = fienumeroList.listarFieEsq14442(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44421/14442");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq44421/14424")
	public ModelAndView listEsqLotofacil14424(FieEsq14424 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq14424> fieEsqLista = fienumeroList.listarFieEsq14424(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44421/14424");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq44421/14244")
	public ModelAndView listEsqLotofacil14244(FieEsq14244 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq14244> fieEsqLista = fienumeroList.listarFieEsq14244(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44421/14244");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq44421/12444")
	public ModelAndView listEsqLotofacil12444(FieEsq12444 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq12444> fieEsqLista = fienumeroList.listarFieEsq12444(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44421/12444");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq44421/44412")
	public ModelAndView listEsqLotofacil44412(FieEsq44412 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq44412> fieEsqLista = fienumeroList.listarFieEsq44412(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44421/44412");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq44421/44124")
	public ModelAndView listEsqLotofacil44124(FieEsq44124 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq44124> fieEsqLista = fienumeroList.listarFieEsq44124(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44421/44124");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq44421/44214")
	public ModelAndView listEsqLotofacil44214(FieEsq44214 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq44214> fieEsqLista = fienumeroList.listarFieEsq44214(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44421/44214");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq44421/41244")
	public ModelAndView listEsqLotofacil41244(FieEsq41244 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq41244> fieEsqLista = fienumeroList.listarFieEsq41244(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44421/41244");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq44421/42144")
	public ModelAndView listEsqLotofacil42144(FieEsq42144 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq42144> fieEsqLista = fienumeroList.listarFieEsq42144(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44421/42144");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq44421/41442")
	public ModelAndView listEsqLotofacil41442(FieEsq41442 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq41442> fieEsqLista = fienumeroList.listarFieEsq41442(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44421/41442");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq44421/41424")
	public ModelAndView listEsqLotofacil41424(FieEsq41424 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq41424> fieEsqLista = fienumeroList.listarFieEsq41424(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44421/41424");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq44421/42441")
	public ModelAndView listEsqLotofacil42441(FieEsq42441 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq42441> fieEsqLista = fienumeroList.listarFieEsq42441(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44421/42441");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq44421/42414")
	public ModelAndView listEsqLotofacil42414(FieEsq42414 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq42414> fieEsqLista = fienumeroList.listarFieEsq42414(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44421/42414");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq44421/21444")
	public ModelAndView listEsqLotofacil21444(FieEsq21444 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq21444> fieEsqLista = fienumeroList.listarFieEsq21444(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44421/21444");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq44421/24144")
	public ModelAndView listEsqLotofacil24144(FieEsq24144 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq24144> fieEsqLista = fienumeroList.listarFieEsq24144(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44421/24144");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq44421/24414")
	public ModelAndView listEsqLotofacil24414(FieEsq24414 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq24414> fieEsqLista = fienumeroList.listarFieEsq24414(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44421/24414");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq44421/24441")
	public ModelAndView listEsqLotofacil24441(FieEsq24441 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq24441> fieEsqLista = fienumeroList.listarFieEsq24441(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44421/24441");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	
	
	


	
}
