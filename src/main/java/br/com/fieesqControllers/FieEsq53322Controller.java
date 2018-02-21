package br.com.fieesqControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fieesq.dao.FieEsqDao53322;
import br.com.fieesq.model53322.FieEsq22335;
import br.com.fieesq.model53322.FieEsq22353;
import br.com.fieesq.model53322.FieEsq22533;
import br.com.fieesq.model53322.FieEsq23235;
import br.com.fieesq.model53322.FieEsq23253;
import br.com.fieesq.model53322.FieEsq23325;
import br.com.fieesq.model53322.FieEsq23352;
import br.com.fieesq.model53322.FieEsq23523;
import br.com.fieesq.model53322.FieEsq23532;
import br.com.fieesq.model53322.FieEsq25233;
import br.com.fieesq.model53322.FieEsq25323;
import br.com.fieesq.model53322.FieEsq25332;
import br.com.fieesq.model53322.FieEsq32235;
import br.com.fieesq.model53322.FieEsq32253;
import br.com.fieesq.model53322.FieEsq32325;
import br.com.fieesq.model53322.FieEsq32352;
import br.com.fieesq.model53322.FieEsq32523;
import br.com.fieesq.model53322.FieEsq32532;
import br.com.fieesq.model53322.FieEsq33225;
import br.com.fieesq.model53322.FieEsq33252;
import br.com.fieesq.model53322.FieEsq33522;
import br.com.fieesq.model53322.FieEsq35223;
import br.com.fieesq.model53322.FieEsq35232;
import br.com.fieesq.model53322.FieEsq35322;
import br.com.fieesq.model53322.FieEsq52233;
import br.com.fieesq.model53322.FieEsq52323;
import br.com.fieesq.model53322.FieEsq52332;
import br.com.fieesq.model53322.FieEsq53223;
import br.com.fieesq.model53322.FieEsq53232;
import br.com.fieesq.model53322.FieEsq53322;
import br.com.sistJCJ.regra.ResultRegra;

@Controller
public class FieEsq53322Controller {
	@Autowired
	FieEsqDao53322 fienumeroList;
	@Autowired
	ResultRegra regas;

	@RequestMapping("/esquemas/esq53322/53322")
	public ModelAndView listEsqLotofacil53322(FieEsq53322 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq53322> fieEsqLista = fienumeroList.listarFieEsq53322(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53322/53322");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq53322/33522")
	public ModelAndView listEsqLotofacil33522(FieEsq33522 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq33522> fieEsqLista = fienumeroList.listarFieEsq33522(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53322/33522");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq53322/33252")
	public ModelAndView listEsqLotofacil33252(FieEsq33252 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq33252> fieEsqLista = fienumeroList.listarFieEsq33252(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53322/33252");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq53322/33225")
	public ModelAndView listEsqLotofacil33225(FieEsq33225 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq33225> fieEsqLista = fienumeroList.listarFieEsq33225(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53322/33225");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq53322/35322")
	public ModelAndView listEsqLotofacil35322(FieEsq35322 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq35322> fieEsqLista = fienumeroList.listarFieEsq35322(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53322/35322");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq53322/35232")
	public ModelAndView listEsqLotofacil35232(FieEsq35232 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq35232> fieEsqLista = fienumeroList.listarFieEsq35232(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53322/35232");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq53322/35223")
	public ModelAndView listEsqLotofacil35223(FieEsq35223 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq35223> fieEsqLista = fienumeroList.listarFieEsq35223(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53322/35223");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq53322/32352")
	public ModelAndView listEsqLotofacil32352(FieEsq32352 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq32352> fieEsqLista = fienumeroList.listarFieEsq32352(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53322/32352");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq53322/32325")
	public ModelAndView listEsqLotofacil32325(FieEsq32325 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq32325> fieEsqLista = fienumeroList.listarFieEsq32325(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53322/32325");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq53322/32532")
	public ModelAndView listEsqLotofacil32532(FieEsq32532 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq32532> fieEsqLista = fienumeroList.listarFieEsq32532(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53322/32532");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq53322/32523")
	public ModelAndView listEsqLotofacil32523(FieEsq32523 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq32523> fieEsqLista = fienumeroList.listarFieEsq32523(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53322/32523");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq53322/32235")
	public ModelAndView listEsqLotofacil32235(FieEsq32235 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq32235> fieEsqLista = fienumeroList.listarFieEsq32235(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53322/32235");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq53322/32253")
	public ModelAndView listEsqLotofacil32253(FieEsq32253 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq32253> fieEsqLista = fienumeroList.listarFieEsq32253(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53322/32253");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq53322/53232")
	public ModelAndView listEsqLotofacil53232(FieEsq53232 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq53232> fieEsqLista = fienumeroList.listarFieEsq53232(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53322/53232");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq53322/53223")
	public ModelAndView listEsqLotofacil53223(FieEsq53223 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq53223> fieEsqLista = fienumeroList.listarFieEsq53223(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53322/53223");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq53322/52233")
	public ModelAndView listEsqLotofacil52233(FieEsq52233 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq52233> fieEsqLista = fienumeroList.listarFieEsq52233(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53322/52233");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq53322/52323")
	public ModelAndView listEsqLotofacil52323(FieEsq52323 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq52323> fieEsqLista = fienumeroList.listarFieEsq52323(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53322/52323");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq53322/52332")
	public ModelAndView listEsqLotofacil52332(FieEsq52332 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq52332> fieEsqLista = fienumeroList.listarFieEsq52332(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53322/52332");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq53322/22533")
	public ModelAndView listEsqLotofacil22533(FieEsq22533 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq22533> fieEsqLista = fienumeroList.listarFieEsq22533(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53322/22533");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq53322/22353")
	public ModelAndView listEsqLotofacil22353(FieEsq22353 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq22353> fieEsqLista = fienumeroList.listarFieEsq22353(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53322/22353");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq53322/22335")
	public ModelAndView listEsqLotofacil22335(FieEsq22335 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq22335> fieEsqLista = fienumeroList.listarFieEsq22335(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53322/22335");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq53322/25233")
	public ModelAndView listEsqLotofacil25233(FieEsq25233 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq25233> fieEsqLista = fienumeroList.listarFieEsq25233(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53322/25233");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq53322/25323")
	public ModelAndView listEsqLotofacil25323(FieEsq25323 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq25323> fieEsqLista = fienumeroList.listarFieEsq25323(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53322/25323");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq53322/25332")
	public ModelAndView listEsqLotofacil25332(FieEsq25332 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq25332> fieEsqLista = fienumeroList.listarFieEsq25332(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53322/25332");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq53322/23253")
	public ModelAndView listEsqLotofacil23253(FieEsq23253 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq23253> fieEsqLista = fienumeroList.listarFieEsq23253(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53322/23253");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq53322/23235")
	public ModelAndView listEsqLotofacil23235(FieEsq23235 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq23235> fieEsqLista = fienumeroList.listarFieEsq23235(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53322/23235");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq53322/23523")
	public ModelAndView listEsqLotofacil23523(FieEsq23523 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq23523> fieEsqLista = fienumeroList.listarFieEsq23523(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53322/23523");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq53322/23532")
	public ModelAndView listEsqLotofacil23532(FieEsq23532 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq23532> fieEsqLista = fienumeroList.listarFieEsq23532(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53322/23532");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq53322/23325")
	public ModelAndView listEsqLotofacil23325(FieEsq23325 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq23325> fieEsqLista = fienumeroList.listarFieEsq23325(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53322/23325");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq53322/23352")
	public ModelAndView listEsqLotofacil23352(FieEsq23352 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq23352> fieEsqLista = fienumeroList.listarFieEsq23352(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq53322/23352");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	

}
