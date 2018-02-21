package br.com.fieesqControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fieesq.dao.FieEsqDao54222;
import br.com.fieesq.model54222.FieEsq22245;
import br.com.fieesq.model54222.FieEsq22254;
import br.com.fieesq.model54222.FieEsq22452;
import br.com.fieesq.model54222.FieEsq22542;
import br.com.fieesq.model54222.FieEsq24225;
import br.com.fieesq.model54222.FieEsq24252;
import br.com.fieesq.model54222.FieEsq24522;
import br.com.fieesq.model54222.FieEsq25224;
import br.com.fieesq.model54222.FieEsq25242;
import br.com.fieesq.model54222.FieEsq25422;
import br.com.fieesq.model54222.FieEsq42225;
import br.com.fieesq.model54222.FieEsq42252;
import br.com.fieesq.model54222.FieEsq42522;
import br.com.fieesq.model54222.FieEsq45222;
import br.com.fieesq.model54222.FieEsq52224;
import br.com.fieesq.model54222.FieEsq52242;
import br.com.fieesq.model54222.FieEsq52422;
import br.com.fieesq.model54222.FieEsq54222;
import br.com.sistJCJ.regra.ResultRegra;

@Controller
public class FieEsq54222Controller {
	@Autowired
	FieEsqDao54222 fienumeroList;
	@Autowired
	ResultRegra regas;

	@RequestMapping("/esquemas/esq54222/54222")
	public ModelAndView listEsqLotofacil54222(FieEsq54222 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq54222> fieEsqLista = fienumeroList.listarFieEsq54222(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54222/54222");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54222/52224")
	public ModelAndView listEsqLotofacil52224(FieEsq52224 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq52224> fieEsqLista = fienumeroList.listarFieEsq52224(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54222/52224");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54222/52242")
	public ModelAndView listEsqLotofacil52242(FieEsq52242 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq52242> fieEsqLista = fienumeroList.listarFieEsq52242(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54222/52242");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54222/52422")
	public ModelAndView listEsqLotofacil52422(FieEsq52422 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq52422> fieEsqLista = fienumeroList.listarFieEsq52422(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54222/52422");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54222/22254")
	public ModelAndView listEsqLotofacil22254(FieEsq22254 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq22254> fieEsqLista = fienumeroList.listarFieEsq22254(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54222/22254");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54222/22245")
	public ModelAndView listEsqLotofacil22245(FieEsq22245 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq22245> fieEsqLista = fienumeroList.listarFieEsq22245(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54222/22245");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54222/22542")
	public ModelAndView listEsqLotofacil22542(FieEsq22542 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq22542> fieEsqLista = fienumeroList.listarFieEsq22542(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54222/22542");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54222/22452")
	public ModelAndView listEsqLotofacil22452(FieEsq22452 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq22452> fieEsqLista = fienumeroList.listarFieEsq22452(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54222/22452");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54222/25422")
	public ModelAndView listEsqLotofacil25422(FieEsq25422 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq25422> fieEsqLista = fienumeroList.listarFieEsq25422(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54222/25422");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54222/24522")
	public ModelAndView listEsqLotofacil24522(FieEsq24522 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq24522> fieEsqLista = fienumeroList.listarFieEsq24522(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54222/24522");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54222/25224")
	public ModelAndView listEsqLotofacil25224(FieEsq25224 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq25224> fieEsqLista = fienumeroList.listarFieEsq25224(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54222/25224");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54222/25242")
	public ModelAndView listEsqLotofacil25242(FieEsq25242 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq25242> fieEsqLista = fienumeroList.listarFieEsq25242(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54222/25242");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54222/24225")
	public ModelAndView listEsqLotofacil24225(FieEsq24225 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq24225> fieEsqLista = fienumeroList.listarFieEsq24225(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54222/24225");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54222/24252")
	public ModelAndView listEsqLotofacil24252(FieEsq24252 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq24252> fieEsqLista = fienumeroList.listarFieEsq24252(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54222/24252");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54222/45222")
	public ModelAndView listEsqLotofacil45222(FieEsq45222 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq45222> fieEsqLista = fienumeroList.listarFieEsq45222(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54222/45222");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54222/42522")
	public ModelAndView listEsqLotofacil42522(FieEsq42522 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq42522> fieEsqLista = fienumeroList.listarFieEsq42522(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54222/42522");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54222/42252")
	public ModelAndView listEsqLotofacil42252(FieEsq42252 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq42252> fieEsqLista = fienumeroList.listarFieEsq42252(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54222/42252");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54222/42225")
	public ModelAndView listEsqLotofacil42225(FieEsq42225 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq42225> fieEsqLista = fienumeroList.listarFieEsq42225(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54222/42225");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
}
