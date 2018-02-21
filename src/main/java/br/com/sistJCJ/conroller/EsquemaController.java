package br.com.sistJCJ.conroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.sistJCJ.dao.CadResultDao;
import br.com.sistJCJ.model.CadEsquema;
import br.com.sistJCJ.model.CadResult;
import br.com.sistJCJ.regra.ResultRegra;

@Controller
public class EsquemaController {
	@Autowired
	CadResultDao cadResultDao;
	@Autowired
	ResultRegra regas;

	@RequestMapping("listarlotofacil/resultado")
	public ModelAndView listarResult() {
		List<CadResult> resultado = cadResultDao.listResult();
		ModelAndView modelAndView = new ModelAndView("listarlotofacil/resultado");
		modelAndView.addObject("resultados", resultado); // levando para a
		return modelAndView;
	}
	
	@RequestMapping("esquemas/esquemas")
	public String esquemas() {
      return "esquemas/esquemas";
	}
	
	@RequestMapping("esquemas/esq33333/esq33333")
	public String esq33333() {
      return "esquemas/esq33333/esq33333";
	}
	@RequestMapping("esquemas/esq43332/esq43332")
	public String esq43332() {
      return "esquemas/esq43332/esq43332";
	}
	@RequestMapping("esquemas/esq44322/esq44322")
	public String esq44322() {
      return "esquemas/esq44322/esq44322";
	}
	@RequestMapping("esquemas/esq44331/esq44331")
	public String esq44331() {
      return "esquemas/esq44331/esq44331";
	}
	@RequestMapping("esquemas/esq44421/esq44421")
	public String esq44421() {
      return "esquemas/esq44421/esq44421";
	}
	@RequestMapping("esquemas/esq44430/esq44430")
	public String esq44430() {
      return "esquemas/esq44430/esq44430";
	}
	@RequestMapping("esquemas/esq53322/esq53322")
	public String esq53322() {
      return "esquemas/esq53322/esq53322";
	}
	@RequestMapping("esquemas/esq53331/esq53331")
	public String esq53331() {
      return "esquemas/esq53331/esq53331";
	}
	@RequestMapping("esquemas/esq54222/esq54222")
	public String esq54222() {
      return "esquemas/esq54222/esq54222";
	}
	@RequestMapping("esquemas/esq54321/esq54321")
	public String esq54321() {
      return "esquemas/esq54321/esq54321";
	}
	@RequestMapping("esquemas/esq54330/esq54330")
	public String esq54330() {
      return "esquemas/esq54330/esq54330";
	}
	@RequestMapping("esquemas/esq55221/esq55221")
	public String esq55221() {
      return "esquemas/esq55221/esq55221";
	}
	@RequestMapping("esquemas/esq55311/esq55311")
	public String esq55311() {
      return "esquemas/esq55311/esq55311";
	}
	@RequestMapping("esquemas/esq55320/esq55320")
	public String esq55320() {
      return "esquemas/esq55320/esq55320";
	}
	@RequestMapping("esquemas/esq55410/esq55410")
	public String esq55410() {
      return "esquemas/esq55410/esq55410";
	}
	@RequestMapping("esquemas/esq55500/esq55500")
	public String esq55500() {
      return "esquemas/esq55500/esq55500";
	}
	

	
}
