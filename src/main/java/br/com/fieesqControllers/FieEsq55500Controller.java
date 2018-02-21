package br.com.fieesqControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fieesq.dao.FieEsqDao55500;
import br.com.fieesq.model55500.FieEsq00555;
import br.com.fieesq.model55500.FieEsq05055;
import br.com.fieesq.model55500.FieEsq05505;
import br.com.fieesq.model55500.FieEsq05550;
import br.com.fieesq.model55500.FieEsq50055;
import br.com.fieesq.model55500.FieEsq50505;
import br.com.fieesq.model55500.FieEsq50550;
import br.com.fieesq.model55500.FieEsq55005;
import br.com.fieesq.model55500.FieEsq55050;
import br.com.fieesq.model55500.FieEsq55500;
import br.com.sistJCJ.regra.ResultRegra;

@Controller
public class FieEsq55500Controller {
	@Autowired
	FieEsqDao55500 fienumeroList;
	@Autowired
	ResultRegra regas;

	@RequestMapping("/esquemas/esq55500/55500")
	public ModelAndView listEsqLotofacil55500(FieEsq55500 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq55500> fieEsqLista = fienumeroList.listarFieEsq55500(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55500/55500");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55500/55050")
	public ModelAndView listEsqLotofacil55050(FieEsq55050 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq55050> fieEsqLista = fienumeroList.listarFieEsq55050(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55500/55050");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55500/55005")
	public ModelAndView listEsqLotofacil55005(FieEsq55005 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq55005> fieEsqLista = fienumeroList.listarFieEsq55005(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55500/55005");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55500/50505")
	public ModelAndView listEsqLotofacil50505(FieEsq50505 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq50505> fieEsqLista = fienumeroList.listarFieEsq50505(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55500/50505");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55500/50550")
	public ModelAndView listEsqLotofacil50550(FieEsq50550 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq50550> fieEsqLista = fienumeroList.listarFieEsq50550(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55500/50550");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55500/50055")
	public ModelAndView listEsqLotofacil50055(FieEsq50055 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq50055> fieEsqLista = fienumeroList.listarFieEsq50055(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55500/50055");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55500/05055")
	public ModelAndView listEsqLotofacil05055(FieEsq05055 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq05055> fieEsqLista = fienumeroList.listarFieEsq05055(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55500/05055");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55500/05505")
	public ModelAndView listEsqLotofacil05505(FieEsq05505 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq05505> fieEsqLista = fienumeroList.listarFieEsq05505(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55500/05505");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55500/05550")
	public ModelAndView listEsqLotofacil05550(FieEsq05550 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq05550> fieEsqLista = fienumeroList.listarFieEsq05550(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55500/05550");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55500/00555")
	public ModelAndView listEsqLotofacil00555(FieEsq00555 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq00555> fieEsqLista = fienumeroList.listarFieEsq00555(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55500/00555");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
}
