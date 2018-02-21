package br.com.fieesqControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fieesq.dao.FieEsqDao55311;
import br.com.fieesq.model55311.FieEsq11355;
import br.com.fieesq.model55311.FieEsq11535;
import br.com.fieesq.model55311.FieEsq11553;
import br.com.fieesq.model55311.FieEsq13155;
import br.com.fieesq.model55311.FieEsq13515;
import br.com.fieesq.model55311.FieEsq13551;
import br.com.fieesq.model55311.FieEsq15135;
import br.com.fieesq.model55311.FieEsq15153;
import br.com.fieesq.model55311.FieEsq15315;
import br.com.fieesq.model55311.FieEsq15351;
import br.com.fieesq.model55311.FieEsq15513;
import br.com.fieesq.model55311.FieEsq15531;
import br.com.fieesq.model55311.FieEsq31155;
import br.com.fieesq.model55311.FieEsq31515;
import br.com.fieesq.model55311.FieEsq31551;
import br.com.fieesq.model55311.FieEsq35115;
import br.com.fieesq.model55311.FieEsq35151;
import br.com.fieesq.model55311.FieEsq35511;
import br.com.fieesq.model55311.FieEsq51135;
import br.com.fieesq.model55311.FieEsq51153;
import br.com.fieesq.model55311.FieEsq51315;
import br.com.fieesq.model55311.FieEsq51351;
import br.com.fieesq.model55311.FieEsq51513;
import br.com.fieesq.model55311.FieEsq51531;
import br.com.fieesq.model55311.FieEsq53115;
import br.com.fieesq.model55311.FieEsq53151;
import br.com.fieesq.model55311.FieEsq53511;
import br.com.fieesq.model55311.FieEsq55113;
import br.com.fieesq.model55311.FieEsq55131;
import br.com.fieesq.model55311.FieEsq55311;
import br.com.sistJCJ.regra.ResultRegra;

@Controller
public class FieEsq55311Controller {

	@Autowired
	FieEsqDao55311 fienumeroList;
	@Autowired
	ResultRegra regas;

	@RequestMapping("/esquemas/esq55311/55311")
	public ModelAndView listEsqLotofacil55311(FieEsq55311 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq55311> fieEsqLista = fienumeroList.listarFieEsq55311(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55311/55311");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55311/55131")
	public ModelAndView listEsqLotofacil55131(FieEsq55131 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq55131> fieEsqLista = fienumeroList.listarFieEsq55131(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55311/55131");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55311/55113")
	public ModelAndView listEsqLotofacil55113(FieEsq55113 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq55113> fieEsqLista = fienumeroList.listarFieEsq55113(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55311/55113");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55311/53511")
	public ModelAndView listEsqLotofacil53511(FieEsq53511 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq53511> fieEsqLista = fienumeroList.listarFieEsq53511(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55311/53511");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55311/53151")
	public ModelAndView listEsqLotofacil53151(FieEsq53151 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq53151> fieEsqLista = fienumeroList.listarFieEsq53151(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55311/53151");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55311/53115")
	public ModelAndView listEsqLotofacil53115(FieEsq53115 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq53115> fieEsqLista = fienumeroList.listarFieEsq53115(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55311/53115");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55311/51531")
	public ModelAndView listEsqLotofacil51531(FieEsq51531 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq51531> fieEsqLista = fienumeroList.listarFieEsq51531(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55311/51531");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55311/51513")
	public ModelAndView listEsqLotofacil51513(FieEsq51513 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq51513> fieEsqLista = fienumeroList.listarFieEsq51513(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55311/51513");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55311/51351")
	public ModelAndView listEsqLotofacil51351(FieEsq51351 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq51351> fieEsqLista = fienumeroList.listarFieEsq51351(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55311/51351");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55311/51315")
	public ModelAndView listEsqLotofacil51315(FieEsq51315 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq51315> fieEsqLista = fienumeroList.listarFieEsq51315(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55311/51315");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55311/51153")
	public ModelAndView listEsqLotofacil51153(FieEsq51153 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq51153> fieEsqLista = fienumeroList.listarFieEsq51153(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55311/51153");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55311/51135")
	public ModelAndView listEsqLotofacil51135(FieEsq51135 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq51135> fieEsqLista = fienumeroList.listarFieEsq51135(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55311/51135");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55311/35511")
	public ModelAndView listEsqLotofacil35511(FieEsq35511 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq35511> fieEsqLista = fienumeroList.listarFieEsq35511(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55311/35511");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55311/35151")
	public ModelAndView listEsqLotofacil35151(FieEsq35151 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq35151> fieEsqLista = fienumeroList.listarFieEsq35151(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55311/35151");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55311/35115")
	public ModelAndView listEsqLotofacil35115(FieEsq35115 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq35115> fieEsqLista = fienumeroList.listarFieEsq35115(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55311/35115");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55311/31155")
	public ModelAndView listEsqLotofacil31155(FieEsq31155 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq31155> fieEsqLista = fienumeroList.listarFieEsq31155(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55311/31155");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55311/31515")
	public ModelAndView listEsqLotofacil31515(FieEsq31515 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq31515> fieEsqLista = fienumeroList.listarFieEsq31515(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55311/31515");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55311/31551")
	public ModelAndView listEsqLotofacil31551(FieEsq31551 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq31551> fieEsqLista = fienumeroList.listarFieEsq31551(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55311/31551");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55311/11355")
	public ModelAndView listEsqLotofacil11355(FieEsq11355 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq11355> fieEsqLista = fienumeroList.listarFieEsq11355(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55311/11355");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55311/11535")
	public ModelAndView listEsqLotofacil11535(FieEsq11535 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq11535> fieEsqLista = fienumeroList.listarFieEsq11535(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55311/11535");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55311/11553")
	public ModelAndView listEsqLotofacil11553(FieEsq11553 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq11553> fieEsqLista = fienumeroList.listarFieEsq11553(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55311/11553");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55311/13155")
	public ModelAndView listEsqLotofacil13155(FieEsq13155 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq13155> fieEsqLista = fienumeroList.listarFieEsq13155(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55311/13155");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55311/13515")
	public ModelAndView listEsqLotofacil13515(FieEsq13515 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq13515> fieEsqLista = fienumeroList.listarFieEsq13515(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55311/13515");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55311/13551")
	public ModelAndView listEsqLotofacil13551(FieEsq13551 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq13551> fieEsqLista = fienumeroList.listarFieEsq13551(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55311/13551");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55311/15135")
	public ModelAndView listEsqLotofacil15135(FieEsq15135 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq15135> fieEsqLista = fienumeroList.listarFieEsq15135(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55311/15135");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55311/15153")
	public ModelAndView listEsqLotofacil15153(FieEsq15153 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq15153> fieEsqLista = fienumeroList.listarFieEsq15153(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55311/15153");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55311/15315")
	public ModelAndView listEsqLotofacil15315(FieEsq15315 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq15315> fieEsqLista = fienumeroList.listarFieEsq15315(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55311/15315");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55311/15351")
	public ModelAndView listEsqLotofacil15351(FieEsq15351 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq15351> fieEsqLista = fienumeroList.listarFieEsq15351(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55311/15351");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55311/15513")
	public ModelAndView listEsqLotofacil15513(FieEsq15513 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq15513> fieEsqLista = fienumeroList.listarFieEsq15513(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55311/15513");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55311/15531")
	public ModelAndView listEsqLotofacil15531(FieEsq15531 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq15531> fieEsqLista = fienumeroList.listarFieEsq15531(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55311/15531");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
}
