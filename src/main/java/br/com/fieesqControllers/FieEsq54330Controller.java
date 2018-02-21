package br.com.fieesqControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fieesq.dao.FieEsqDao54330;
import br.com.fieesq.model54330.FieEsq03345;
import br.com.fieesq.model54330.FieEsq03354;
import br.com.fieesq.model54330.FieEsq03435;
import br.com.fieesq.model54330.FieEsq03453;
import br.com.fieesq.model54330.FieEsq03534;
import br.com.fieesq.model54330.FieEsq03543;
import br.com.fieesq.model54330.FieEsq04335;
import br.com.fieesq.model54330.FieEsq04353;
import br.com.fieesq.model54330.FieEsq04533;
import br.com.fieesq.model54330.FieEsq05334;
import br.com.fieesq.model54330.FieEsq05343;
import br.com.fieesq.model54330.FieEsq05433;
import br.com.fieesq.model54330.FieEsq30345;
import br.com.fieesq.model54330.FieEsq30354;
import br.com.fieesq.model54330.FieEsq30435;
import br.com.fieesq.model54330.FieEsq30453;
import br.com.fieesq.model54330.FieEsq30534;
import br.com.fieesq.model54330.FieEsq30543;
import br.com.fieesq.model54330.FieEsq33045;
import br.com.fieesq.model54330.FieEsq33054;
import br.com.fieesq.model54330.FieEsq33405;
import br.com.fieesq.model54330.FieEsq33450;
import br.com.fieesq.model54330.FieEsq33504;
import br.com.fieesq.model54330.FieEsq33540;
import br.com.fieesq.model54330.FieEsq34035;
import br.com.fieesq.model54330.FieEsq34053;
import br.com.fieesq.model54330.FieEsq34305;
import br.com.fieesq.model54330.FieEsq34350;
import br.com.fieesq.model54330.FieEsq34503;
import br.com.fieesq.model54330.FieEsq34530;
import br.com.fieesq.model54330.FieEsq35034;
import br.com.fieesq.model54330.FieEsq35043;
import br.com.fieesq.model54330.FieEsq35304;
import br.com.fieesq.model54330.FieEsq35340;
import br.com.fieesq.model54330.FieEsq35403;
import br.com.fieesq.model54330.FieEsq35430;
import br.com.fieesq.model54330.FieEsq40335;
import br.com.fieesq.model54330.FieEsq40353;
import br.com.fieesq.model54330.FieEsq40533;
import br.com.fieesq.model54330.FieEsq43035;
import br.com.fieesq.model54330.FieEsq43053;
import br.com.fieesq.model54330.FieEsq43305;
import br.com.fieesq.model54330.FieEsq43350;
import br.com.fieesq.model54330.FieEsq43503;
import br.com.fieesq.model54330.FieEsq43530;
import br.com.fieesq.model54330.FieEsq45033;
import br.com.fieesq.model54330.FieEsq45303;
import br.com.fieesq.model54330.FieEsq45330;
import br.com.fieesq.model54330.FieEsq50334;
import br.com.fieesq.model54330.FieEsq50343;
import br.com.fieesq.model54330.FieEsq50433;
import br.com.fieesq.model54330.FieEsq53034;
import br.com.fieesq.model54330.FieEsq53043;
import br.com.fieesq.model54330.FieEsq53304;
import br.com.fieesq.model54330.FieEsq53340;
import br.com.fieesq.model54330.FieEsq53403;
import br.com.fieesq.model54330.FieEsq53430;
import br.com.fieesq.model54330.FieEsq54033;
import br.com.fieesq.model54330.FieEsq54303;
import br.com.fieesq.model54330.FieEsq54330;
import br.com.sistJCJ.regra.ResultRegra;

@Controller
public class FieEsq54330Controller {
	@Autowired
	FieEsqDao54330 fienumeroList;
	@Autowired
	ResultRegra regas;

	@RequestMapping("/esquemas/esq54330/54330")
	public ModelAndView listEsqLotofacil54330(FieEsq54330 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq54330> fieEsqLista = fienumeroList.listarFieEsq54330(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/54330");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/54303")
	public ModelAndView listEsqLotofacil54303(FieEsq54303 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq54303> fieEsqLista = fienumeroList.listarFieEsq54303(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/54303");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/54033")
	public ModelAndView listEsqLotofacil54033(FieEsq54033 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq54033> fieEsqLista = fienumeroList.listarFieEsq54033(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/54033");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/53430")
	public ModelAndView listEsqLotofacil53430(FieEsq53430 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq53430> fieEsqLista = fienumeroList.listarFieEsq53430(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/53430");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/53403")
	public ModelAndView listEsqLotofacil53403(FieEsq53403 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq53403> fieEsqLista = fienumeroList.listarFieEsq53403(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/53403");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/53340")
	public ModelAndView listEsqLotofacil53340(FieEsq53340 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq53340> fieEsqLista = fienumeroList.listarFieEsq53340(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/53340");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/53304")
	public ModelAndView listEsqLotofacil53304(FieEsq53304 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq53304> fieEsqLista = fienumeroList.listarFieEsq53304(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/53304");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/50433")
	public ModelAndView listEsqLotofacil50433(FieEsq50433 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq50433> fieEsqLista = fienumeroList.listarFieEsq50433(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/50433");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/50343")
	public ModelAndView listEsqLotofacil50343(FieEsq50343 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq50343> fieEsqLista = fienumeroList.listarFieEsq50343(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/50343");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/50334")
	public ModelAndView listEsqLotofacil50334(FieEsq50334 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq50334> fieEsqLista = fienumeroList.listarFieEsq50334(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/50334");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/53043")
	public ModelAndView listEsqLotofacil53043(FieEsq53043 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq53043> fieEsqLista = fienumeroList.listarFieEsq53043(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/53043");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/53034")
	public ModelAndView listEsqLotofacil53034(FieEsq53034 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq53034> fieEsqLista = fienumeroList.listarFieEsq53034(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/53034");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/45330")
	public ModelAndView listEsqLotofacil45330(FieEsq45330 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq45330> fieEsqLista = fienumeroList.listarFieEsq45330(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/45330");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/45303")
	public ModelAndView listEsqLotofacil45303(FieEsq45303 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq45303> fieEsqLista = fienumeroList.listarFieEsq45303(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/45303");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/45033")
	public ModelAndView listEsqLotofacil45033(FieEsq45033 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq45033> fieEsqLista = fienumeroList.listarFieEsq45033(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/45033");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/43530")
	public ModelAndView listEsqLotofacil43530(FieEsq43530 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq43530> fieEsqLista = fienumeroList.listarFieEsq43530(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/43530");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/43503")
	public ModelAndView listEsqLotofacil43503(FieEsq43503 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq43503> fieEsqLista = fienumeroList.listarFieEsq43503(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/43503");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/43350")
	public ModelAndView listEsqLotofacil43350(FieEsq43350 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq43350> fieEsqLista = fienumeroList.listarFieEsq43350(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/43350");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/43305")
	public ModelAndView listEsqLotofacil43305(FieEsq43305 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq43305> fieEsqLista = fienumeroList.listarFieEsq43305(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/43305");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/43053")
	public ModelAndView listEsqLotofacil43053(FieEsq43053 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq43053> fieEsqLista = fienumeroList.listarFieEsq43053(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/43053");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/43035")
	public ModelAndView listEsqLotofacil43035(FieEsq43035 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq43035> fieEsqLista = fienumeroList.listarFieEsq43035(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/43035");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/40533")
	public ModelAndView listEsqLotofacil40533(FieEsq40533 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq40533> fieEsqLista = fienumeroList.listarFieEsq40533(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/40533");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/40353")
	public ModelAndView listEsqLotofacil40353(FieEsq40353 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq40353> fieEsqLista = fienumeroList.listarFieEsq40353(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/40353");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/40335")
	public ModelAndView listEsqLotofacil40335(FieEsq40335 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq40335> fieEsqLista = fienumeroList.listarFieEsq40335(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/40335");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/35430")
	public ModelAndView listEsqLotofacil35430(FieEsq35430 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq35430> fieEsqLista = fienumeroList.listarFieEsq35430(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/35430");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/35403")
	public ModelAndView listEsqLotofacil35403(FieEsq35403 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq35403> fieEsqLista = fienumeroList.listarFieEsq35403(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/35403");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/35340")
	public ModelAndView listEsqLotofacil35340(FieEsq35340 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq35340> fieEsqLista = fienumeroList.listarFieEsq35340(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/35340");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/35304")
	public ModelAndView listEsqLotofacil35304(FieEsq35304 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq35304> fieEsqLista = fienumeroList.listarFieEsq35304(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/35304");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/35043")
	public ModelAndView listEsqLotofacil35043(FieEsq35043 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq35043> fieEsqLista = fienumeroList.listarFieEsq35043(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/35043");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/35034")
	public ModelAndView listEsqLotofacil35034(FieEsq35034 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq35034> fieEsqLista = fienumeroList.listarFieEsq35034(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/35034");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/34530")
	public ModelAndView listEsqLotofacil34530(FieEsq34530 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq34530> fieEsqLista = fienumeroList.listarFieEsq34530(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/34530");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/34503")
	public ModelAndView listEsqLotofacil34503(FieEsq34503 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq34503> fieEsqLista = fienumeroList.listarFieEsq34503(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/34503");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/34350")
	public ModelAndView listEsqLotofacil34350(FieEsq34350 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq34350> fieEsqLista = fienumeroList.listarFieEsq34350(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/34350");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/34305")
	public ModelAndView listEsqLotofacil34305(FieEsq34305 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq34305> fieEsqLista = fienumeroList.listarFieEsq34305(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/34305");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/34053")
	public ModelAndView listEsqLotofacil34053(FieEsq34053 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq34053> fieEsqLista = fienumeroList.listarFieEsq34053(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/34053");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/34035")
	public ModelAndView listEsqLotofacil34035(FieEsq34035 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq34035> fieEsqLista = fienumeroList.listarFieEsq34035(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/34035");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/33540")
	public ModelAndView listEsqLotofacil33540(FieEsq33540 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq33540> fieEsqLista = fienumeroList.listarFieEsq33540(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/33540");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/33504")
	public ModelAndView listEsqLotofacil33504(FieEsq33504 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq33504> fieEsqLista = fienumeroList.listarFieEsq33504(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/33504");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/33450")
	public ModelAndView listEsqLotofacil33450(FieEsq33450 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq33450> fieEsqLista = fienumeroList.listarFieEsq33450(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/33450");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/33405")
	public ModelAndView listEsqLotofacil33405(FieEsq33405 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq33405> fieEsqLista = fienumeroList.listarFieEsq33405(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/33405");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/33054")
	public ModelAndView listEsqLotofacil33054(FieEsq33054 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq33054> fieEsqLista = fienumeroList.listarFieEsq33054(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/33054");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/33045")
	public ModelAndView listEsqLotofacil33045(FieEsq33045 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq33045> fieEsqLista = fienumeroList.listarFieEsq33045(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/33045");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/30543")
	public ModelAndView listEsqLotofacil30543(FieEsq30543 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq30543> fieEsqLista = fienumeroList.listarFieEsq30543(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/30543");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/30534")
	public ModelAndView listEsqLotofacil30534(FieEsq30534 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq30534> fieEsqLista = fienumeroList.listarFieEsq30534(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/30534");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/30453")
	public ModelAndView listEsqLotofacil30453(FieEsq30453 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq30453> fieEsqLista = fienumeroList.listarFieEsq30453(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/30453");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/30435")
	public ModelAndView listEsqLotofacil30435(FieEsq30435 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq30435> fieEsqLista = fienumeroList.listarFieEsq30435(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/30435");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/30354")
	public ModelAndView listEsqLotofacil30354(FieEsq30354 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq30354> fieEsqLista = fienumeroList.listarFieEsq30354(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/30354");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/30345")
	public ModelAndView listEsqLotofacil30345(FieEsq30345 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq30345> fieEsqLista = fienumeroList.listarFieEsq30345(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/30345");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/05433")
	public ModelAndView listEsqLotofacil05433(FieEsq05433 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq05433> fieEsqLista = fienumeroList.listarFieEsq05433(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/05433");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/05343")
	public ModelAndView listEsqLotofacil05343(FieEsq05343 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq05343> fieEsqLista = fienumeroList.listarFieEsq05343(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/05343");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/05334")
	public ModelAndView listEsqLotofacil05334(FieEsq05334 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq05334> fieEsqLista = fienumeroList.listarFieEsq05334(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/05334");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/04533")
	public ModelAndView listEsqLotofacil04533(FieEsq04533 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq04533> fieEsqLista = fienumeroList.listarFieEsq04533(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/04533");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/04353")
	public ModelAndView listEsqLotofacil04353(FieEsq04353 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq04353> fieEsqLista = fienumeroList.listarFieEsq04353(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/04353");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/04335")
	public ModelAndView listEsqLotofacil04335(FieEsq04335 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq04335> fieEsqLista = fienumeroList.listarFieEsq04335(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/04335");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/03543")
	public ModelAndView listEsqLotofacil03543(FieEsq03543 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq03543> fieEsqLista = fienumeroList.listarFieEsq03543(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/03543");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/03534")
	public ModelAndView listEsqLotofacil03534(FieEsq03534 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq03534> fieEsqLista = fienumeroList.listarFieEsq03534(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/03534");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/03453")
	public ModelAndView listEsqLotofacil03453(FieEsq03453 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq03453> fieEsqLista = fienumeroList.listarFieEsq03453(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/03453");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/03435")
	public ModelAndView listEsqLotofacil03435(FieEsq03435 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq03435> fieEsqLista = fienumeroList.listarFieEsq03435(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/03435");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/03354")
	public ModelAndView listEsqLotofacil03354(FieEsq03354 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq03354> fieEsqLista = fienumeroList.listarFieEsq03354(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/03354");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq54330/03345")
	public ModelAndView listEsqLotofacil03345(FieEsq03345 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq03345> fieEsqLista = fienumeroList.listarFieEsq03345(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq54330/03345");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
}
