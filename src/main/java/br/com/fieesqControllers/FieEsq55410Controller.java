package br.com.fieesqControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fieesq.dao.FieEsqDao55410;
import br.com.fieesq.model55410.FieEsq01455;
import br.com.fieesq.model55410.FieEsq01545;
import br.com.fieesq.model55410.FieEsq01554;
import br.com.fieesq.model55410.FieEsq04155;
import br.com.fieesq.model55410.FieEsq04515;
import br.com.fieesq.model55410.FieEsq04551;
import br.com.fieesq.model55410.FieEsq05145;
import br.com.fieesq.model55410.FieEsq05154;
import br.com.fieesq.model55410.FieEsq05415;
import br.com.fieesq.model55410.FieEsq05451;
import br.com.fieesq.model55410.FieEsq05514;
import br.com.fieesq.model55410.FieEsq05541;
import br.com.fieesq.model55410.FieEsq10455;
import br.com.fieesq.model55410.FieEsq10545;
import br.com.fieesq.model55410.FieEsq10554;
import br.com.fieesq.model55410.FieEsq14055;
import br.com.fieesq.model55410.FieEsq14505;
import br.com.fieesq.model55410.FieEsq14550;
import br.com.fieesq.model55410.FieEsq15045;
import br.com.fieesq.model55410.FieEsq15054;
import br.com.fieesq.model55410.FieEsq15405;
import br.com.fieesq.model55410.FieEsq15450;
import br.com.fieesq.model55410.FieEsq15504;
import br.com.fieesq.model55410.FieEsq15540;
import br.com.fieesq.model55410.FieEsq40155;
import br.com.fieesq.model55410.FieEsq40515;
import br.com.fieesq.model55410.FieEsq40551;
import br.com.fieesq.model55410.FieEsq41055;
import br.com.fieesq.model55410.FieEsq41505;
import br.com.fieesq.model55410.FieEsq41550;
import br.com.fieesq.model55410.FieEsq45015;
import br.com.fieesq.model55410.FieEsq45051;
import br.com.fieesq.model55410.FieEsq45105;
import br.com.fieesq.model55410.FieEsq45150;
import br.com.fieesq.model55410.FieEsq45501;
import br.com.fieesq.model55410.FieEsq45510;
import br.com.fieesq.model55410.FieEsq50145;
import br.com.fieesq.model55410.FieEsq50154;
import br.com.fieesq.model55410.FieEsq50415;
import br.com.fieesq.model55410.FieEsq50451;
import br.com.fieesq.model55410.FieEsq50514;
import br.com.fieesq.model55410.FieEsq50541;
import br.com.fieesq.model55410.FieEsq51045;
import br.com.fieesq.model55410.FieEsq51054;
import br.com.fieesq.model55410.FieEsq51405;
import br.com.fieesq.model55410.FieEsq51450;
import br.com.fieesq.model55410.FieEsq51504;
import br.com.fieesq.model55410.FieEsq51540;
import br.com.fieesq.model55410.FieEsq54015;
import br.com.fieesq.model55410.FieEsq54051;
import br.com.fieesq.model55410.FieEsq54105;
import br.com.fieesq.model55410.FieEsq54150;
import br.com.fieesq.model55410.FieEsq54501;
import br.com.fieesq.model55410.FieEsq54510;
import br.com.fieesq.model55410.FieEsq55014;
import br.com.fieesq.model55410.FieEsq55041;
import br.com.fieesq.model55410.FieEsq55104;
import br.com.fieesq.model55410.FieEsq55140;
import br.com.fieesq.model55410.FieEsq55401;
import br.com.fieesq.model55410.FieEsq55410;
import br.com.sistJCJ.regra.ResultRegra;

@Controller
public class FieEsq55410Controller {

	@Autowired
	FieEsqDao55410 fienumeroList;
	@Autowired
	ResultRegra regas;

	@RequestMapping("/esquemas/esq55410/55410")
	public ModelAndView listEsqLotofacil55410(FieEsq55410 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq55410> fieEsqLista = fienumeroList.listarFieEsq55410(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/55410");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/41550")
	public ModelAndView listEsqLotofacil41550(FieEsq41550 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq41550> fieEsqLista = fienumeroList.listarFieEsq41550(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/41550");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/41505")
	public ModelAndView listEsqLotofacil41505(FieEsq41505 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq41505> fieEsqLista = fienumeroList.listarFieEsq41505(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/41505");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/41055")
	public ModelAndView listEsqLotofacil41055(FieEsq41055 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq41055> fieEsqLista = fienumeroList.listarFieEsq41055(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/41055");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/45150")
	public ModelAndView listEsqLotofacil45150(FieEsq45150 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq45150> fieEsqLista = fienumeroList.listarFieEsq45150(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/45150");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/45105")
	public ModelAndView listEsqLotofacil45105(FieEsq45105 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq45105> fieEsqLista = fienumeroList.listarFieEsq45105(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/45105");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/45510")
	public ModelAndView listEsqLotofacil45510(FieEsq45510 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq45510> fieEsqLista = fienumeroList.listarFieEsq45510(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/45510");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/45501")
	public ModelAndView listEsqLotofacil45501(FieEsq45501 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq45501> fieEsqLista = fienumeroList.listarFieEsq45501(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/45501");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/40155")
	public ModelAndView listEsqLotofacil40155(FieEsq40155 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq40155> fieEsqLista = fienumeroList.listarFieEsq40155(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/40155");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/40515")
	public ModelAndView listEsqLotofacil40515(FieEsq40515 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq40515> fieEsqLista = fienumeroList.listarFieEsq40515(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/40515");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/40551")
	public ModelAndView listEsqLotofacil40551(FieEsq40551 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq40551> fieEsqLista = fienumeroList.listarFieEsq40551(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/40551");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/45015")
	public ModelAndView listEsqLotofacil45015(FieEsq45015 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq45015> fieEsqLista = fienumeroList.listarFieEsq45015(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/45015");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/45051")
	public ModelAndView listEsqLotofacil45051(FieEsq45051 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq45051> fieEsqLista = fienumeroList.listarFieEsq45051(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/45051");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/14550")
	public ModelAndView listEsqLotofacil14550(FieEsq14550 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq14550> fieEsqLista = fienumeroList.listarFieEsq14550(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/14550");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/14505")
	public ModelAndView listEsqLotofacil14505(FieEsq14505 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq14505> fieEsqLista = fienumeroList.listarFieEsq14505(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/14505");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/14055")
	public ModelAndView listEsqLotofacil14055(FieEsq14055 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq14055> fieEsqLista = fienumeroList.listarFieEsq14055(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/14055");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/15450")
	public ModelAndView listEsqLotofacil15450(FieEsq15450 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq15450> fieEsqLista = fienumeroList.listarFieEsq15450(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/15450");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/15405")
	public ModelAndView listEsqLotofacil15405(FieEsq15405 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq15405> fieEsqLista = fienumeroList.listarFieEsq15405(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/15405");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/15540")
	public ModelAndView listEsqLotofacil15540(FieEsq15540 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq15540> fieEsqLista = fienumeroList.listarFieEsq15540(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/15540");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/15504")
	public ModelAndView listEsqLotofacil15504(FieEsq15504 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq15504> fieEsqLista = fienumeroList.listarFieEsq15504(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/15504");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/15045")
	public ModelAndView listEsqLotofacil15045(FieEsq15045 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq15045> fieEsqLista = fienumeroList.listarFieEsq15045(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/15045");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/15054")
	public ModelAndView listEsqLotofacil15054(FieEsq15054 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq15054> fieEsqLista = fienumeroList.listarFieEsq15054(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/15054");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/10455")
	public ModelAndView listEsqLotofacil10455(FieEsq10455 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq10455> fieEsqLista = fienumeroList.listarFieEsq10455(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/10455");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/10545")
	public ModelAndView listEsqLotofacil10545(FieEsq10545 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq10545> fieEsqLista = fienumeroList.listarFieEsq10545(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/10545");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/10554")
	public ModelAndView listEsqLotofacil10554(FieEsq10554 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq10554> fieEsqLista = fienumeroList.listarFieEsq10554(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/10554");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/54150")
	public ModelAndView listEsqLotofacil54150(FieEsq54150 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq54150> fieEsqLista = fienumeroList.listarFieEsq54150(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/54150");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/54105")
	public ModelAndView listEsqLotofacil54105(FieEsq54105 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq54105> fieEsqLista = fienumeroList.listarFieEsq54105(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/54105");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/54510")
	public ModelAndView listEsqLotofacil54510(FieEsq54510 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq54510> fieEsqLista = fienumeroList.listarFieEsq54510(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/54510");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/54501")
	public ModelAndView listEsqLotofacil54501(FieEsq54501 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq54501> fieEsqLista = fienumeroList.listarFieEsq54501(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/54501");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/54015")
	public ModelAndView listEsqLotofacil54015(FieEsq54015 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq54015> fieEsqLista = fienumeroList.listarFieEsq54015(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/54015");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/54051")
	public ModelAndView listEsqLotofacil54051(FieEsq54051 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq54051> fieEsqLista = fienumeroList.listarFieEsq54051(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/54051");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/51450")
	public ModelAndView listEsqLotofacil51450(FieEsq51450 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq51450> fieEsqLista = fienumeroList.listarFieEsq51450(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/51450");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/51405")
	public ModelAndView listEsqLotofacil51405(FieEsq51405 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq51405> fieEsqLista = fienumeroList.listarFieEsq51405(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/51405");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/51540")
	public ModelAndView listEsqLotofacil51540(FieEsq51540 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq51540> fieEsqLista = fienumeroList.listarFieEsq51540(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/51540");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/51504")
	public ModelAndView listEsqLotofacil51504(FieEsq51504 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq51504> fieEsqLista = fienumeroList.listarFieEsq51504(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/51504");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/51045")
	public ModelAndView listEsqLotofacil51045(FieEsq51045 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq51045> fieEsqLista = fienumeroList.listarFieEsq51045(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/51045");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/51054")
	public ModelAndView listEsqLotofacil51054(FieEsq51054 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq51054> fieEsqLista = fienumeroList.listarFieEsq51054(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/51054");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/55401")
	public ModelAndView listEsqLotofacil55401(FieEsq55401 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq55401> fieEsqLista = fienumeroList.listarFieEsq55401(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/55401");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/55140")
	public ModelAndView listEsqLotofacil55140(FieEsq55140 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq55140> fieEsqLista = fienumeroList.listarFieEsq55140(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/55140");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/55104")
	public ModelAndView listEsqLotofacil55104(FieEsq55104 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq55104> fieEsqLista = fienumeroList.listarFieEsq55104(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/55104");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/55041")
	public ModelAndView listEsqLotofacil55041(FieEsq55041 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq55041> fieEsqLista = fienumeroList.listarFieEsq55041(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/55041");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/55014")
	public ModelAndView listEsqLotofacil55014(FieEsq55014 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq55014> fieEsqLista = fienumeroList.listarFieEsq55014(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/55014");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/50415")
	public ModelAndView listEsqLotofacil50415(FieEsq50415 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq50415> fieEsqLista = fienumeroList.listarFieEsq50415(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/50415");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/50451")
	public ModelAndView listEsqLotofacil50451(FieEsq50451 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq50451> fieEsqLista = fienumeroList.listarFieEsq50451(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/50451");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/50145")
	public ModelAndView listEsqLotofacil50145(FieEsq50145 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq50145> fieEsqLista = fienumeroList.listarFieEsq50145(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/50145");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/50154")
	public ModelAndView listEsqLotofacil50154(FieEsq50154 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq50154> fieEsqLista = fienumeroList.listarFieEsq50154(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/50154");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/50541")
	public ModelAndView listEsqLotofacil50541(FieEsq50541 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq50541> fieEsqLista = fienumeroList.listarFieEsq50541(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/50541");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/50514")
	public ModelAndView listEsqLotofacil50514(FieEsq50514 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq50514> fieEsqLista = fienumeroList.listarFieEsq50514(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/50514");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/04155")
	public ModelAndView listEsqLotofacil04155(FieEsq04155 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq04155> fieEsqLista = fienumeroList.listarFieEsq04155(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/04155");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/04515")
	public ModelAndView listEsqLotofacil04515(FieEsq04515 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq04515> fieEsqLista = fienumeroList.listarFieEsq04515(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/04515");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/04551")
	public ModelAndView listEsqLotofacil04551(FieEsq04551 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq04551> fieEsqLista = fienumeroList.listarFieEsq04551(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/04551");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/01455")
	public ModelAndView listEsqLotofacil01455(FieEsq01455 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq01455> fieEsqLista = fienumeroList.listarFieEsq01455(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/01455");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/01545")
	public ModelAndView listEsqLotofacil01545(FieEsq01545 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq01545> fieEsqLista = fienumeroList.listarFieEsq01545(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/01545");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/01554")
	public ModelAndView listEsqLotofacil01554(FieEsq01554 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq01554> fieEsqLista = fienumeroList.listarFieEsq01554(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/01554");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/05415")
	public ModelAndView listEsqLotofacil05415(FieEsq05415 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq05415> fieEsqLista = fienumeroList.listarFieEsq05415(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/05415");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/05451")
	public ModelAndView listEsqLotofacil05451(FieEsq05451 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq05451> fieEsqLista = fienumeroList.listarFieEsq05451(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/05451");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/05145")
	public ModelAndView listEsqLotofacil05145(FieEsq05145 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq05145> fieEsqLista = fienumeroList.listarFieEsq05145(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/05145");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/05154")
	public ModelAndView listEsqLotofacil05154(FieEsq05154 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq05154> fieEsqLista = fienumeroList.listarFieEsq05154(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/05154");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/05541")
	public ModelAndView listEsqLotofacil05541(FieEsq05541 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq05541> fieEsqLista = fienumeroList.listarFieEsq05541(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/05541");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55410/05514")
	public ModelAndView listEsqLotofacil05514(FieEsq05514 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq05514> fieEsqLista = fienumeroList.listarFieEsq05514(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55410/05514");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
}

