package ec.com.bolsadeideas.springboot.di.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ec.com.bolsadeideas.springboot.di.app.models.service.IServicio;

@Controller
public class IndexController {

	@Autowired
	@Qualifier("miServicioSecundario")
	public IServicio iServicio;

	@GetMapping({ "", "/", "index" })
	public String index(Model model) {
		model.addAttribute("objeto", iServicio.operacion());
		return "index";
	}
// Por controlador
//	@Autowired
//	public IndexController(IServicio iServicio) {
//		this.iServicio = iServicio;
//	}

	// Con méodo set y la anotación en el set
//	@Autowired
//	public void setiServicio(IServicio iServicio) {
//		this.iServicio = iServicio;
//	}

}
