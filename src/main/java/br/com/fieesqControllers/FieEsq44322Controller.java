package br.com.fieesqControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fieesq.dao.FieEsqDao44322;
import br.com.fieesq.model44322.FieEsq22344;
import br.com.fieesq.model44322.FieEsq22434;
import br.com.fieesq.model44322.FieEsq22443;
import br.com.fieesq.model44322.FieEsq23244;
import br.com.fieesq.model44322.FieEsq23424;
import br.com.fieesq.model44322.FieEsq23442;
import br.com.fieesq.model44322.FieEsq24234;
import br.com.fieesq.model44322.FieEsq24243;
import br.com.fieesq.model44322.FieEsq24324;
import br.com.fieesq.model44322.FieEsq24342;
import br.com.fieesq.model44322.FieEsq24423;
import br.com.fieesq.model44322.FieEsq24432;
import br.com.fieesq.model44322.FieEsq32244;
import br.com.fieesq.model44322.FieEsq32424;
import br.com.fieesq.model44322.FieEsq32442;
import br.com.fieesq.model44322.FieEsq34224;
import br.com.fieesq.model44322.FieEsq34242;
import br.com.fieesq.model44322.FieEsq34422;
import br.com.fieesq.model44322.FieEsq42234;
import br.com.fieesq.model44322.FieEsq42243;
import br.com.fieesq.model44322.FieEsq42324;
import br.com.fieesq.model44322.FieEsq42342;
import br.com.fieesq.model44322.FieEsq42423;
import br.com.fieesq.model44322.FieEsq42432;
import br.com.fieesq.model44322.FieEsq43224;
import br.com.fieesq.model44322.FieEsq43242;
import br.com.fieesq.model44322.FieEsq43422;
import br.com.fieesq.model44322.FieEsq44223;
import br.com.fieesq.model44322.FieEsq44232;
import br.com.sistJCJ.regra.ResultRegra;

@Controller
public class FieEsq44322Controller {
	@Autowired
	FieEsqDao44322 fienumeroList;
	@Autowired
	ResultRegra regas;

	@RequestMapping("/listarlotofacil/filtrar")
	public String filtrar() {
		return "/listarlotofacil/filtrar";
	}

	@RequestMapping("/listarlotofacil/listar22344")
	public ModelAndView listEsqLotofacil22344(FieEsq22344 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq22344> fieEsqLista = fienumeroList.listarFieEsq22344(esqParam); // trazendo

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44322/22344");
		modelAndView.addObject("fieEsqLista", fieEsqLista); // levando para a

		return modelAndView; // retornando o caminho
	}
	@RequestMapping("/esquemas/esq44322/44232")
	public ModelAndView listEsqLotofacil44232(FieEsq44232 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq44232> fieEsqLista = fienumeroList.listarFieEsq44232(esqParam); // trazendo

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44322/44232");
		modelAndView.addObject("fieEsqLista", fieEsqLista); // levando para a

		return modelAndView; // retornando o caminho
	}
	@RequestMapping("/esquemas/esq44322/44223")
	public ModelAndView listEsqLotofacil44223(FieEsq44223 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq44223> fieEsqLista = fienumeroList.listarFieEsq44223(esqParam); // trazendo

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44322/44223");
		modelAndView.addObject("fieEsqLista", fieEsqLista); // levando para a

		return modelAndView; // retornando o caminho
	}
	@RequestMapping("/esquemas/esq44322/43422")
	public ModelAndView listEsqLotofacil43422(FieEsq43422 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq43422> fieEsqLista = fienumeroList.listarFieEsq43422(esqParam); // trazendo

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44322/43422");
		modelAndView.addObject("fieEsqLista", fieEsqLista); // levando para a

		return modelAndView; // retornando o caminho
	}
	@RequestMapping("/esquemas/esq44322/43242")
	public ModelAndView listEsqLotofacil43242(FieEsq43242 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq43242> fieEsqLista = fienumeroList.listarFieEsq43242(esqParam); // trazendo

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44322/43242");
		modelAndView.addObject("fieEsqLista", fieEsqLista); // levando para a

		return modelAndView; // retornando o caminho
	}
	@RequestMapping("/esquemas/esq44322/43224")
	public ModelAndView listEsqLotofacil43224(FieEsq43224 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq43224> fieEsqLista = fienumeroList.listarFieEsq43224(esqParam); // trazendo

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44322/43224");
		modelAndView.addObject("fieEsqLista", fieEsqLista); // levando para a

		return modelAndView; // retornando o caminho
	}
	@RequestMapping("/esquemas/esq44322/42432")
	public ModelAndView listEsqLotofacil42432(FieEsq42432 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq42432> fieEsqLista = fienumeroList.listarFieEsq42432(esqParam); // trazendo

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44322/42432");
		modelAndView.addObject("fieEsqLista", fieEsqLista); // levando para a

		return modelAndView; // retornando o caminho
	}
	@RequestMapping("/esquemas/esq44322/42423")
	public ModelAndView listEsqLotofacil42423(FieEsq42423 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq42423> fieEsqLista = fienumeroList.listarFieEsq42423(esqParam); // trazendo

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44322/42423");
		modelAndView.addObject("fieEsqLista", fieEsqLista); // levando para a

		return modelAndView; // retornando o caminho
	}
	@RequestMapping("/esquemas/esq44322/42342")
	public ModelAndView listEsqLotofacil42342(FieEsq42342 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq42342> fieEsqLista = fienumeroList.listarFieEsq42342(esqParam); // trazendo

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44322/42342");
		modelAndView.addObject("fieEsqLista", fieEsqLista); // levando para a

		return modelAndView; // retornando o caminho
	}
	@RequestMapping("/esquemas/esq44322/42324")
	public ModelAndView listEsqLotofacil42324(FieEsq42324 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq42324> fieEsqLista = fienumeroList.listarFieEsq42324(esqParam); // trazendo

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44322/42324");
		modelAndView.addObject("fieEsqLista", fieEsqLista); // levando para a

		return modelAndView; // retornando o caminho
	}
	@RequestMapping("/esquemas/esq44322/42243")
	public ModelAndView listEsqLotofacil42243(FieEsq42243 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq42243> fieEsqLista = fienumeroList.listarFieEsq42243(esqParam); // trazendo

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44322/42243");
		modelAndView.addObject("fieEsqLista", fieEsqLista); // levando para a

		return modelAndView; // retornando o caminho
	}
	@RequestMapping("/esquemas/esq44322/42234")
	public ModelAndView listEsqLotofacil42234(FieEsq42234 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq42234> fieEsqLista = fienumeroList.listarFieEsq42234(esqParam); // trazendo

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44322/42234");
		modelAndView.addObject("fieEsqLista", fieEsqLista); // levando para a

		return modelAndView; // retornando o caminho
	}
	@RequestMapping("/esquemas/esq44322/34422")
	public ModelAndView listEsqLotofacil34422(FieEsq34422 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq34422> fieEsqLista = fienumeroList.listarFieEsq34422(esqParam); // trazendo

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44322/34422");
		modelAndView.addObject("fieEsqLista", fieEsqLista); // levando para a

		return modelAndView; // retornando o caminho
	}
	@RequestMapping("/esquemas/esq44322/34242")
	public ModelAndView listEsqLotofacil34242(FieEsq34242 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq34242> fieEsqLista = fienumeroList.listarFieEsq34242(esqParam); // trazendo

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44322/34242");
		modelAndView.addObject("fieEsqLista", fieEsqLista); // levando para a

		return modelAndView; // retornando o caminho
	}
	@RequestMapping("/esquemas/esq44322/34224")
	public ModelAndView listEsqLotofacil34224(FieEsq34224 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq34224> fieEsqLista = fienumeroList.listarFieEsq34224(esqParam); // trazendo

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44322/34224");
		modelAndView.addObject("fieEsqLista", fieEsqLista); // levando para a

		return modelAndView; // retornando o caminho
	}
	@RequestMapping("/esquemas/esq44322/32244")
	public ModelAndView listEsqLotofacil32244(FieEsq32244 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq32244> fieEsqLista = fienumeroList.listarFieEsq32244(esqParam); // trazendo

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44322/32244");
		modelAndView.addObject("fieEsqLista", fieEsqLista); // levando para a

		return modelAndView; // retornando o caminho
	}
	@RequestMapping("/esquemas/esq44322/32424")
	public ModelAndView listEsqLotofacil32424(FieEsq32424 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq32424> fieEsqLista = fienumeroList.listarFieEsq32424(esqParam); // trazendo

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44322/32424");
		modelAndView.addObject("fieEsqLista", fieEsqLista); // levando para a

		return modelAndView; // retornando o caminho
	}
	@RequestMapping("/esquemas/esq44322/32442")
	public ModelAndView listEsqLotofacil32442(FieEsq32442 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq32442> fieEsqLista = fienumeroList.listarFieEsq32442(esqParam); // trazendo

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44322/32442");
		modelAndView.addObject("fieEsqLista", fieEsqLista); // levando para a

		return modelAndView; // retornando o caminho
	}
	@RequestMapping("/esquemas/esq44322/22434")
	public ModelAndView listEsqLotofacil22434(FieEsq22434 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq22434> fieEsqLista = fienumeroList.listarFieEsq22434(esqParam); // trazendo

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44322/22434");
		modelAndView.addObject("fieEsqLista", fieEsqLista); // levando para a

		return modelAndView; // retornando o caminho
	}
	@RequestMapping("/esquemas/esq44322/22443")
	public ModelAndView listEsqLotofacil22443(FieEsq22443 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq22443> fieEsqLista = fienumeroList.listarFieEsq22443(esqParam); // trazendo

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44322/22443");
		modelAndView.addObject("fieEsqLista", fieEsqLista); // levando para a

		return modelAndView; // retornando o caminho
	}
	@RequestMapping("/esquemas/esq44322/23244")
	public ModelAndView listEsqLotofacil23244(FieEsq23244 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq23244> fieEsqLista = fienumeroList.listarFieEsq23244(esqParam); // trazendo

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44322/23244");
		modelAndView.addObject("fieEsqLista", fieEsqLista); // levando para a

		return modelAndView; // retornando o caminho
	}
	@RequestMapping("/esquemas/esq44322/23424")
	public ModelAndView listEsqLotofacil23424(FieEsq23424 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq23424> fieEsqLista = fienumeroList.listarFieEsq23424(esqParam); // trazendo

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44322/23424");
		modelAndView.addObject("fieEsqLista", fieEsqLista); // levando para a

		return modelAndView; // retornando o caminho
	}
	@RequestMapping("/esquemas/esq44322/23442")
	public ModelAndView listEsqLotofacil23442(FieEsq23442 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq23442> fieEsqLista = fienumeroList.listarFieEsq23442(esqParam); // trazendo

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44322/23442");
		modelAndView.addObject("fieEsqLista", fieEsqLista); // levando para a

		return modelAndView; // retornando o caminho
	}
	@RequestMapping("/esquemas/esq44322/24234")
	public ModelAndView listEsqLotofacil24234(FieEsq24234 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq24234> fieEsqLista = fienumeroList.listarFieEsq24234(esqParam); // trazendo

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44322/24234");
		modelAndView.addObject("fieEsqLista", fieEsqLista); // levando para a

		return modelAndView; // retornando o caminho
	}
	@RequestMapping("/esquemas/esq44322/24243")
	public ModelAndView listEsqLotofacil24243(FieEsq24243 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq24243> fieEsqLista = fienumeroList.listarFieEsq24243(esqParam); // trazendo

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44322/24243");
		modelAndView.addObject("fieEsqLista", fieEsqLista); // levando para a

		return modelAndView; // retornando o caminho
	}
	@RequestMapping("/esquemas/esq44322/24324")
	public ModelAndView listEsqLotofacil24324(FieEsq24324 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq24324> fieEsqLista = fienumeroList.listarFieEsq24324(esqParam); // trazendo

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44322/24324");
		modelAndView.addObject("fieEsqLista", fieEsqLista); // levando para a

		return modelAndView; // retornando o caminho
	}
	@RequestMapping("/esquemas/esq44322/24342")
	public ModelAndView listEsqLotofacil24342(FieEsq24342 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq24342> fieEsqLista = fienumeroList.listarFieEsq24342(esqParam); // trazendo

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44322/24342");
		modelAndView.addObject("fieEsqLista", fieEsqLista); // levando para a

		return modelAndView; // retornando o caminho
	}
	@RequestMapping("/esquemas/esq44322/24423")
	public ModelAndView listEsqLotofacil24423(FieEsq24423 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq24423> fieEsqLista = fienumeroList.listarFieEsq24423(esqParam); // trazendo

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44322/24423");
		modelAndView.addObject("fieEsqLista", fieEsqLista); // levando para a

		return modelAndView; // retornando o caminho
	}
	@RequestMapping("/esquemas/esq44322/24432")
	public ModelAndView listEsqLotofacil24432(FieEsq24432 lista) {
		String esqParam = lista.getEsqParam(); // parâmetro que vem do form

		List<FieEsq24432> fieEsqLista = fienumeroList.listarFieEsq24432(esqParam); // trazendo

		ModelAndView modelAndView = new ModelAndView("/esquemas/esq44322/24432");
		modelAndView.addObject("fieEsqLista", fieEsqLista); // levando para a

		return modelAndView; // retornando o caminho
	}
	@RequestMapping("/listarlotofacil/comb5")
	public ModelAndView listar(FieEsq22344 lum1, FieEsq22344 ldois2, FieEsq22344 ltres3, FieEsq22344 lquatro4,
			FieEsq22344 lcinco5) {
		int linha1 = Integer.parseInt(lum1.getLinha1()); // parâmetro que vem do
															// form
		int linha2 = Integer.parseInt(ldois2.getLinha2()); // parâmetro que vem
															// do form
		int linha3 = Integer.parseInt(ltres3.getLinha3()); // parâmetro que vem
															// do form
		int linha4 = Integer.parseInt(lquatro4.getLinha4()); // parâmetro que
																// vem do form
		int linha5 = Integer.parseInt(lcinco5.getLinha5()); // parâmetro que vem
															// do form

		String[] quantJogos = new String[145]; // quantidade de cartões gerados
												// apos o filtro -1 = 144

		quantJogos = regas.tiraNumerosEsquema(linha1, linha2, linha3, linha4, linha5);

		ModelAndView modelAndView = new ModelAndView("/listarlotofacil/filtrar");
		modelAndView.addObject("numFilter", quantJogos); // levando para a
		modelAndView.addObject("linha1", linha1); // levando para a
		modelAndView.addObject("linha2", linha2); // levando para a
		modelAndView.addObject("linha3", linha3); // levando para a
		modelAndView.addObject("linha4", linha4); // levando para a
		modelAndView.addObject("linha5", linha5); // levando para a
		return modelAndView; // retornando a página
	}
	
}
