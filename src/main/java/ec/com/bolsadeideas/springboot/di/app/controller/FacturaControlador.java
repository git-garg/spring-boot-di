package ec.com.bolsadeideas.springboot.di.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ec.com.bolsadeideas.springboot.di.app.models.domain.Factura;

@Controller
@RequestMapping("/factura")
public class FacturaControlador {

	@Autowired
	private Factura factura;

	@GetMapping("/ver")
	public String verFactura(Model modelo) {
		modelo.addAttribute("factura", factura);
		modelo.addAttribute("titulo", "Ejemplo de factura con inyección de dependencia");

		return "factura/ver";
	}

}
