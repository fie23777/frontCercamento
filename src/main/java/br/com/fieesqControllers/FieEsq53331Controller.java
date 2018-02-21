package br.com.fieesqControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fieesq.dao.FieEsqDao53331;
import br.com.fieesq.model53331.FieEsq13335;
import br.com.fieesq.model53331.FieEsq13353;
import br.com.fieesq.model53331.FieEsq13533;
import br.com.fieesq.model53331.FieEsq15333;
import br.com.fieesq.model53331.FieEsq31335;
import br.com.fieesq.model53331.FieEsq31353;
import br.com.fieesq.model53331.FieEsq31533;
import br.com.fieesq.model53331.FieEsq33153;
import br.com.fieesq.model53331.FieEsq33315;
import br.com.fieesq.model53331.FieEsq33351;
import br.com.fieesq.model53331.FieEsq33513;
import br.com.fieesq.model53331.FieEsq35133;
import br.com.fieesq.model53331.FieEsq35313;
import br.com.fieesq.model53331.FieEsq35331;
import br.com.fieesq.model53331.FieEsq51333;
import br.com.fieesq.model53331.FieEsq53133;
import br.com.fieesq.model53331.FieEsq53313;
import br.com.fieesq.model53331.FieEsq53331;
import br.com.sistJCJ.regra.ResultRegra;

@Controller
public class FieEsq53331Controller {
	@Autowired
	FieEsqDao53331 fienumeroList;
	@Autowired
	ResultRegra regas;

	@RequestMapping("/esquemas/esq53331/53331")
	public ModelAndView listEsqLotofacil53331(FieEsq53331 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq53331> fieEsqLista = fienumeroList.listarFieEsq53331(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53331/53331");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq53331/53313")
	public ModelAndView listEsqLotofacil53313(FieEsq53313 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq53313> fieEsqLista = fienumeroList.listarFieEsq53313(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53331/53313");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq53331/53133")
	public ModelAndView listEsqLotofacil53133(FieEsq53133 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq53133> fieEsqLista = fienumeroList.listarFieEsq53133(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53331/53133");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq53331/51333")
	public ModelAndView listEsqLotofacil51333(FieEsq51333 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq51333> fieEsqLista = fienumeroList.listarFieEsq51333(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53331/51333");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq53331/33351")
	public ModelAndView listEsqLotofacil33351(FieEsq33351 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq33351> fieEsqLista = fienumeroList.listarFieEsq33351(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53331/33351");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq53331/33315")
	public ModelAndView listEsqLotofacil33315(FieEsq33315 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq33315> fieEsqLista = fienumeroList.listarFieEsq33315(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53331/33315");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq53331/33513")
	public ModelAndView listEsqLotofacil33513(FieEsq33513 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq33513> fieEsqLista = fienumeroList.listarFieEsq33513(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53331/33513");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq53331/33153")
	public ModelAndView listEsqLotofacil33153(FieEsq33153 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq33153> fieEsqLista = fienumeroList.listarFieEsq33153(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53331/33153");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	
	@RequestMapping("/esquemas/esq53331/35133")
	public ModelAndView listEsqLotofacil35133(FieEsq35133 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq35133> fieEsqLista = fienumeroList.listarFieEsq35133(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53331/35133");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq53331/31533")
	public ModelAndView listEsqLotofacil31533(FieEsq31533 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq31533> fieEsqLista = fienumeroList.listarFieEsq31533(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53331/31533");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq53331/35331")
	public ModelAndView listEsqLotofacil35331(FieEsq35331 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq35331> fieEsqLista = fienumeroList.listarFieEsq35331(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53331/35331");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq53331/35313")
	public ModelAndView listEsqLotofacil35313(FieEsq35313 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq35313> fieEsqLista = fienumeroList.listarFieEsq35313(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53331/35313");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq53331/31335")
	public ModelAndView listEsqLotofacil31335(FieEsq31335 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq31335> fieEsqLista = fienumeroList.listarFieEsq31335(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53331/31335");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq53331/31353")
	public ModelAndView listEsqLotofacil31353(FieEsq31353 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq31353> fieEsqLista = fienumeroList.listarFieEsq31353(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53331/31353");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq53331/15333")
	public ModelAndView listEsqLotofacil15333(FieEsq15333 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq15333> fieEsqLista = fienumeroList.listarFieEsq15333(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53331/15333");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq53331/13533")
	public ModelAndView listEsqLotofacil13533(FieEsq13533 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq13533> fieEsqLista = fienumeroList.listarFieEsq13533(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53331/13533");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq53331/13353")
	public ModelAndView listEsqLotofacil13353(FieEsq13353 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq13353> fieEsqLista = fienumeroList.listarFieEsq13353(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53331/13353");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq53331/13335")
	public ModelAndView listEsqLotofacil13335(FieEsq13335 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq13335> fieEsqLista = fienumeroList.listarFieEsq13335(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53331/13335");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
}

