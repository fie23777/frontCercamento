package br.com.fieesqControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fieesq.dao.FieEsqDao55320;
import br.com.fieesq.model55320.FieEsq02355;
import br.com.fieesq.model55320.FieEsq02535;
import br.com.fieesq.model55320.FieEsq02553;
import br.com.fieesq.model55320.FieEsq03255;
import br.com.fieesq.model55320.FieEsq03525;
import br.com.fieesq.model55320.FieEsq03552;
import br.com.fieesq.model55320.FieEsq05235;
import br.com.fieesq.model55320.FieEsq05253;
import br.com.fieesq.model55320.FieEsq05325;
import br.com.fieesq.model55320.FieEsq05352;
import br.com.fieesq.model55320.FieEsq05523;
import br.com.fieesq.model55320.FieEsq05532;
import br.com.fieesq.model55320.FieEsq20355;
import br.com.fieesq.model55320.FieEsq20535;
import br.com.fieesq.model55320.FieEsq20553;
import br.com.fieesq.model55320.FieEsq23055;
import br.com.fieesq.model55320.FieEsq23505;
import br.com.fieesq.model55320.FieEsq23550;
import br.com.fieesq.model55320.FieEsq25035;
import br.com.fieesq.model55320.FieEsq25053;
import br.com.fieesq.model55320.FieEsq25305;
import br.com.fieesq.model55320.FieEsq25350;
import br.com.fieesq.model55320.FieEsq25530;
import br.com.fieesq.model55320.FieEsq30255;
import br.com.fieesq.model55320.FieEsq30525;
import br.com.fieesq.model55320.FieEsq30552;
import br.com.fieesq.model55320.FieEsq32055;
import br.com.fieesq.model55320.FieEsq32505;
import br.com.fieesq.model55320.FieEsq32550;
import br.com.fieesq.model55320.FieEsq35025;
import br.com.fieesq.model55320.FieEsq35052;
import br.com.fieesq.model55320.FieEsq35205;
import br.com.fieesq.model55320.FieEsq35250;
import br.com.fieesq.model55320.FieEsq35502;
import br.com.fieesq.model55320.FieEsq35520;
import br.com.fieesq.model55320.FieEsq50235;
import br.com.fieesq.model55320.FieEsq50253;
import br.com.fieesq.model55320.FieEsq50325;
import br.com.fieesq.model55320.FieEsq50352;
import br.com.fieesq.model55320.FieEsq50523;
import br.com.fieesq.model55320.FieEsq50532;
import br.com.fieesq.model55320.FieEsq52035;
import br.com.fieesq.model55320.FieEsq52053;
import br.com.fieesq.model55320.FieEsq52305;
import br.com.fieesq.model55320.FieEsq52350;
import br.com.fieesq.model55320.FieEsq52503;
import br.com.fieesq.model55320.FieEsq52530;
import br.com.fieesq.model55320.FieEsq53025;
import br.com.fieesq.model55320.FieEsq53052;
import br.com.fieesq.model55320.FieEsq53205;
import br.com.fieesq.model55320.FieEsq53250;
import br.com.fieesq.model55320.FieEsq53502;
import br.com.fieesq.model55320.FieEsq53520;
import br.com.fieesq.model55320.FieEsq55023;
import br.com.fieesq.model55320.FieEsq55032;
import br.com.fieesq.model55320.FieEsq55203;
import br.com.fieesq.model55320.FieEsq55230;
import br.com.fieesq.model55320.FieEsq55302;
import br.com.fieesq.model55320.FieEsq55320;
import br.com.sistJCJ.regra.ResultRegra;

@Controller
public class FieEsq55320Controller {
	@Autowired
	FieEsqDao55320 fienumeroList;
	@Autowired
	ResultRegra regas;

	@RequestMapping("/esquemas/esq55320/55320")
	public ModelAndView listEsqLotofacil55320(FieEsq55320 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq55320> fieEsqLista = fienumeroList.listarFieEsq55320(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/55320");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq55320/55230")
	public ModelAndView listEsqLotofacil55230(FieEsq55230 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq55230> fieEsqLista = fienumeroList.listarFieEsq55230(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/55230");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/32550")
	public ModelAndView listEsqLotofacil32550(FieEsq32550 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq32550> fieEsqLista = fienumeroList.listarFieEsq32550(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/32550");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/32505")
	public ModelAndView listEsqLotofacil32505(FieEsq32505 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq32505> fieEsqLista = fienumeroList.listarFieEsq32505(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/32505");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/32055")
	public ModelAndView listEsqLotofacil32055(FieEsq32055 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq32055> fieEsqLista = fienumeroList.listarFieEsq32055(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/32055");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/35250")
	public ModelAndView listEsqLotofacil35250(FieEsq35250 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq35250> fieEsqLista = fienumeroList.listarFieEsq35250(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/35250");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/35205")
	public ModelAndView listEsqLotofacil35205(FieEsq35205 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq35205> fieEsqLista = fienumeroList.listarFieEsq35205(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/35205");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/35520")
	public ModelAndView listEsqLotofacil35520(FieEsq35520 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq35520> fieEsqLista = fienumeroList.listarFieEsq35520(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/35520");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/35502")
	public ModelAndView listEsqLotofacil35502(FieEsq35502 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq35502> fieEsqLista = fienumeroList.listarFieEsq35502(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/35502");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/30255")
	public ModelAndView listEsqLotofacil30255(FieEsq30255 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq30255> fieEsqLista = fienumeroList.listarFieEsq30255(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/30255");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/30525")
	public ModelAndView listEsqLotofacil30525(FieEsq30525 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq30525> fieEsqLista = fienumeroList.listarFieEsq30525(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/30525");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/30552")
	public ModelAndView listEsqLotofacil30552(FieEsq30552 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq30552> fieEsqLista = fienumeroList.listarFieEsq30552(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/30552");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/35025")
	public ModelAndView listEsqLotofacil35025(FieEsq35025 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq35025> fieEsqLista = fienumeroList.listarFieEsq35025(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/35025");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/35052")
	public ModelAndView listEsqLotofacil35052(FieEsq35052 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq35052> fieEsqLista = fienumeroList.listarFieEsq35052(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/35052");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/23550")
	public ModelAndView listEsqLotofacil23550(FieEsq23550 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq23550> fieEsqLista = fienumeroList.listarFieEsq23550(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/23550");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/23505")
	public ModelAndView listEsqLotofacil23505(FieEsq23505 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq23505> fieEsqLista = fienumeroList.listarFieEsq23505(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/23505");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/23055")
	public ModelAndView listEsqLotofacil23055(FieEsq23055 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq23055> fieEsqLista = fienumeroList.listarFieEsq23055(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/23055");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/25350")
	public ModelAndView listEsqLotofacil25350(FieEsq25350 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq25350> fieEsqLista = fienumeroList.listarFieEsq25350(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/25350");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/25305")
	public ModelAndView listEsqLotofacil25305(FieEsq25305 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq25305> fieEsqLista = fienumeroList.listarFieEsq25305(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/25305");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq55320/25530")
	public ModelAndView listEsqLotofacil25530(FieEsq25530 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq25530> fieEsqLista = fienumeroList.listarFieEsq25530(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/25530");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/25035")
	public ModelAndView listEsqLotofacil25035(FieEsq25035 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq25035> fieEsqLista = fienumeroList.listarFieEsq25035(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/25035");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	@RequestMapping("/esquemas/esq55320/25053")
	public ModelAndView listEsqLotofacil25053(FieEsq25053 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq25053> fieEsqLista = fienumeroList.listarFieEsq25053(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/25053");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/20355")
	public ModelAndView listEsqLotofacil20355(FieEsq20355 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq20355> fieEsqLista = fienumeroList.listarFieEsq20355(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/20355");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/20535")
	public ModelAndView listEsqLotofacil20535(FieEsq20535 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq20535> fieEsqLista = fienumeroList.listarFieEsq20535(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/20535");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/20553")
	public ModelAndView listEsqLotofacil20553(FieEsq20553 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq20553> fieEsqLista = fienumeroList.listarFieEsq20553(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/20553");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/53250")
	public ModelAndView listEsqLotofacil53250(FieEsq53250 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq53250> fieEsqLista = fienumeroList.listarFieEsq53250(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/53250");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/53205")
	public ModelAndView listEsqLotofacil53205(FieEsq53205 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq53205> fieEsqLista = fienumeroList.listarFieEsq53205(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/53205");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/53520")
	public ModelAndView listEsqLotofacil53520(FieEsq53520 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq53520> fieEsqLista = fienumeroList.listarFieEsq53520(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/53520");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/53502")
	public ModelAndView listEsqLotofacil53502(FieEsq53502 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq53502> fieEsqLista = fienumeroList.listarFieEsq53502(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/53502");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/53025")
	public ModelAndView listEsqLotofacil53025(FieEsq53025 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq53025> fieEsqLista = fienumeroList.listarFieEsq53025(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/53025");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/53052")
	public ModelAndView listEsqLotofacil53052(FieEsq53052 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq53052> fieEsqLista = fienumeroList.listarFieEsq53052(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/53052");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/52350")
	public ModelAndView listEsqLotofacil52350(FieEsq52350 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq52350> fieEsqLista = fienumeroList.listarFieEsq52350(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/52350");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/52305")
	public ModelAndView listEsqLotofacil52305(FieEsq52305 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq52305> fieEsqLista = fienumeroList.listarFieEsq52305(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/52305");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/52530")
	public ModelAndView listEsqLotofacil52530(FieEsq52530 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq52530> fieEsqLista = fienumeroList.listarFieEsq52530(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/52530");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/52503")
	public ModelAndView listEsqLotofacil52503(FieEsq52503 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq52503> fieEsqLista = fienumeroList.listarFieEsq52503(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/52503");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/52035")
	public ModelAndView listEsqLotofacil52035(FieEsq52035 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq52035> fieEsqLista = fienumeroList.listarFieEsq52035(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/52035");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/52053")
	public ModelAndView listEsqLotofacil52053(FieEsq52053 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq52053> fieEsqLista = fienumeroList.listarFieEsq52053(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/52053");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/55302")
	public ModelAndView listEsqLotofacil55302(FieEsq55302 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq55302> fieEsqLista = fienumeroList.listarFieEsq55302(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/55302");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/55203")
	public ModelAndView listEsqLotofacil55203(FieEsq55203 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq55203> fieEsqLista = fienumeroList.listarFieEsq55203(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/55203");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/55032")
	public ModelAndView listEsqLotofacil55032(FieEsq55032 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq55032> fieEsqLista = fienumeroList.listarFieEsq55032(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/55032");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/55023")
	public ModelAndView listEsqLotofacil55023(FieEsq55023 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq55023> fieEsqLista = fienumeroList.listarFieEsq55023(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/55023");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/50325")
	public ModelAndView listEsqLotofacil50325(FieEsq50325 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq50325> fieEsqLista = fienumeroList.listarFieEsq50325(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/50325");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/50352")
	public ModelAndView listEsqLotofacil50352(FieEsq50352 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq50352> fieEsqLista = fienumeroList.listarFieEsq50352(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/50352");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/50235")
	public ModelAndView listEsqLotofacil50235(FieEsq50235 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq50235> fieEsqLista = fienumeroList.listarFieEsq50235(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/50235");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/50253")
	public ModelAndView listEsqLotofacil50253(FieEsq50253 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq50253> fieEsqLista = fienumeroList.listarFieEsq50253(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/50253");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/50532")
	public ModelAndView listEsqLotofacil50532(FieEsq50532 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq50532> fieEsqLista = fienumeroList.listarFieEsq50532(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/50532");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/50523")
	public ModelAndView listEsqLotofacil50523(FieEsq50523 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq50523> fieEsqLista = fienumeroList.listarFieEsq50523(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/50523");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/03255")
	public ModelAndView listEsqLotofacil03255(FieEsq03255 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq03255> fieEsqLista = fienumeroList.listarFieEsq03255(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/03255");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/03525")
	public ModelAndView listEsqLotofacil03525(FieEsq03525 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq03525> fieEsqLista = fienumeroList.listarFieEsq03525(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/03525");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/03552")
	public ModelAndView listEsqLotofacil03552(FieEsq03552 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq03552> fieEsqLista = fienumeroList.listarFieEsq03552(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/03552");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/02355")
	public ModelAndView listEsqLotofacil02355(FieEsq02355 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq02355> fieEsqLista = fienumeroList.listarFieEsq02355(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/02355");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/02535")
	public ModelAndView listEsqLotofacil02535(FieEsq02535 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq02535> fieEsqLista = fienumeroList.listarFieEsq02535(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/02535");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/02553")
	public ModelAndView listEsqLotofacil02553(FieEsq02553 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq02553> fieEsqLista = fienumeroList.listarFieEsq02553(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/02553");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/05325")
	public ModelAndView listEsqLotofacil05325(FieEsq05325 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq05325> fieEsqLista = fienumeroList.listarFieEsq05325(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/05325");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/05352")
	public ModelAndView listEsqLotofacil05352(FieEsq05352 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq05352> fieEsqLista = fienumeroList.listarFieEsq05352(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/05352");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/05235")
	public ModelAndView listEsqLotofacil05235(FieEsq05235 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq05235> fieEsqLista = fienumeroList.listarFieEsq05235(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/05235");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/05253")
	public ModelAndView listEsqLotofacil05253(FieEsq05253 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq05253> fieEsqLista = fienumeroList.listarFieEsq05253(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/05253");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/05532")
	public ModelAndView listEsqLotofacil05532(FieEsq05532 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq05532> fieEsqLista = fienumeroList.listarFieEsq05532(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/05532");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	@RequestMapping("/esquemas/esq55320/05523")
	public ModelAndView listEsqLotofacil05523(FieEsq05523 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq05523> fieEsqLista = fienumeroList.listarFieEsq05523(esqParam);

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq55320/05523");
		modelAndView.addObject("fieEsqLista", fieEsqLista);

		return modelAndView; 
	}
	
	

	
	
	


	
}
