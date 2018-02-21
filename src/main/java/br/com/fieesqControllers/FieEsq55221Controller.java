package br.com.fieesqControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fieesq.dao.FieEsqDao55221;
import br.com.fieesq.model55221.FieEsq12255;
import br.com.fieesq.model55221.FieEsq12525;
import br.com.fieesq.model55221.FieEsq12552;
import br.com.fieesq.model55221.FieEsq15225;
import br.com.fieesq.model55221.FieEsq15252;
import br.com.fieesq.model55221.FieEsq15522;
import br.com.fieesq.model55221.FieEsq21255;
import br.com.fieesq.model55221.FieEsq21525;
import br.com.fieesq.model55221.FieEsq21552;
import br.com.fieesq.model55221.FieEsq22155;
import br.com.fieesq.model55221.FieEsq22515;
import br.com.fieesq.model55221.FieEsq22551;
import br.com.fieesq.model55221.FieEsq25125;
import br.com.fieesq.model55221.FieEsq25152;
import br.com.fieesq.model55221.FieEsq25215;
import br.com.fieesq.model55221.FieEsq25251;
import br.com.fieesq.model55221.FieEsq25512;
import br.com.fieesq.model55221.FieEsq25521;
import br.com.fieesq.model55221.FieEsq51225;
import br.com.fieesq.model55221.FieEsq51252;
import br.com.fieesq.model55221.FieEsq51522;
import br.com.fieesq.model55221.FieEsq52125;
import br.com.fieesq.model55221.FieEsq52152;
import br.com.fieesq.model55221.FieEsq52215;
import br.com.fieesq.model55221.FieEsq52251;
import br.com.fieesq.model55221.FieEsq52512;
import br.com.fieesq.model55221.FieEsq52521;
import br.com.fieesq.model55221.FieEsq55122;
import br.com.fieesq.model55221.FieEsq55212;
import br.com.fieesq.model55221.FieEsq55221;
import br.com.sistJCJ.regra.ResultRegra;

@Controller
public class FieEsq55221Controller {

	@Autowired
	FieEsqDao55221 fienumeroList;
	@Autowired
	ResultRegra regas;

	@RequestMapping("/esquemas/esq55221/55221")
	public ModelAndView listEsqLotofacil55221(FieEsq55221 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq55221> fieEsqLista = fienumeroList.listarFieEsq55221(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55221/55221");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq55221/55122")
	public ModelAndView listEsqLotofacil55122(FieEsq55122 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq55122> fieEsqLista = fienumeroList.listarFieEsq55122(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55221/55122");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55221/55212")
	public ModelAndView listEsqLotofacil55212(FieEsq55212 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq55212> fieEsqLista = fienumeroList.listarFieEsq55212(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55221/55212");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55221/51522")
	public ModelAndView listEsqLotofacil51522(FieEsq51522 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq51522> fieEsqLista = fienumeroList.listarFieEsq51522(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55221/51522");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55221/51252")
	public ModelAndView listEsqLotofacil51252(FieEsq51252 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq51252> fieEsqLista = fienumeroList.listarFieEsq51252(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55221/51252");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55221/51225")
	public ModelAndView listEsqLotofacil51225(FieEsq51225 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq51225> fieEsqLista = fienumeroList.listarFieEsq51225(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55221/51225");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55221/52512")
	public ModelAndView listEsqLotofacil52512(FieEsq52512 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq52512> fieEsqLista = fienumeroList.listarFieEsq52512(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55221/52512");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55221/52521")
	public ModelAndView listEsqLotofacil52521(FieEsq52521 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq52521> fieEsqLista = fienumeroList.listarFieEsq52521(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55221/52521");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55221/52152")
	public ModelAndView listEsqLotofacil52152(FieEsq52152 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq52152> fieEsqLista = fienumeroList.listarFieEsq52152(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55221/52152");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55221/52125")
	public ModelAndView listEsqLotofacil52125(FieEsq52125 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq52125> fieEsqLista = fienumeroList.listarFieEsq52125(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55221/52125");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55221/52251")
	public ModelAndView listEsqLotofacil52251(FieEsq52251 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq52251> fieEsqLista = fienumeroList.listarFieEsq52251(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55221/52251");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55221/52215")
	public ModelAndView listEsqLotofacil52215(FieEsq52215 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq52215> fieEsqLista = fienumeroList.listarFieEsq52215(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55221/52215");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55221/15522")
	public ModelAndView listEsqLotofacil15522(FieEsq15522 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq15522> fieEsqLista = fienumeroList.listarFieEsq15522(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55221/15522");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55221/15252")
	public ModelAndView listEsqLotofacil15252(FieEsq15252 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq15252> fieEsqLista = fienumeroList.listarFieEsq15252(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55221/15252");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55221/15225")
	public ModelAndView listEsqLotofacil15225(FieEsq15225 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq15225> fieEsqLista = fienumeroList.listarFieEsq15225(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55221/15225");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55221/12255")
	public ModelAndView listEsqLotofacil12255(FieEsq12255 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq12255> fieEsqLista = fienumeroList.listarFieEsq12255(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55221/12255");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55221/12525")
	public ModelAndView listEsqLotofacil12525(FieEsq12525 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq12525> fieEsqLista = fienumeroList.listarFieEsq12525(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55221/12525");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55221/12552")
	public ModelAndView listEsqLotofacil12552(FieEsq12552 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq12552> fieEsqLista = fienumeroList.listarFieEsq12552(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55221/12552");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55221/22155")
	public ModelAndView listEsqLotofacil22155(FieEsq22155 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq22155> fieEsqLista = fienumeroList.listarFieEsq22155(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55221/22155");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55221/22515")
	public ModelAndView listEsqLotofacil22515(FieEsq22515 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq22515> fieEsqLista = fienumeroList.listarFieEsq22515(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55221/22515");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55221/22551")
	public ModelAndView listEsqLotofacil22551(FieEsq22551 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq22551> fieEsqLista = fienumeroList.listarFieEsq22551(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55221/22551");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55221/21255")
	public ModelAndView listEsqLotofacil21255(FieEsq21255 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq21255> fieEsqLista = fienumeroList.listarFieEsq21255(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55221/21255");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55221/21525")
	public ModelAndView listEsqLotofacil21525(FieEsq21525 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq21525> fieEsqLista = fienumeroList.listarFieEsq21525(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55221/21525");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55221/21552")
	public ModelAndView listEsqLotofacil21552(FieEsq21552 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq21552> fieEsqLista = fienumeroList.listarFieEsq21552(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55221/21552");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55221/25215")
	public ModelAndView listEsqLotofacil25215(FieEsq25215 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq25215> fieEsqLista = fienumeroList.listarFieEsq25215(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55221/25215");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55221/25251")
	public ModelAndView listEsqLotofacil25251(FieEsq25251 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq25251> fieEsqLista = fienumeroList.listarFieEsq25251(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55221/25251");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55221/25125")
	public ModelAndView listEsqLotofacil25125(FieEsq25125 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq25125> fieEsqLista = fienumeroList.listarFieEsq25125(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55221/25125");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55221/25152")
	public ModelAndView listEsqLotofacil25152(FieEsq25152 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq25152> fieEsqLista = fienumeroList.listarFieEsq25152(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55221/25152");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55221/25521")
	public ModelAndView listEsqLotofacil25521(FieEsq25521 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq25521> fieEsqLista = fienumeroList.listarFieEsq25521(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55221/25521");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55221/25512")
	public ModelAndView listEsqLotofacil25512(FieEsq25512 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq25512> fieEsqLista = fienumeroList.listarFieEsq25512(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55221/25512");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
}
