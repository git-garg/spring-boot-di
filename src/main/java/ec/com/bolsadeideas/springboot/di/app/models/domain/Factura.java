package ec.com.bolsadeideas.springboot.di.app.models.domain;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Factura {

	@Autowired
	private Cliente cliente;

	@Autowired
	@Qualifier("itemsFacturaOficina")
	private List<ItemFactura> items;

	@Value("${factura.descripcion}")
	private String descripcion;

	@PostConstruct
	public void ini() {
		cliente.setNombre(cliente.getNombre().concat(" ").concat(" Alejandro"));
		String cadena = descripcion.concat(" del cliente ").concat(cliente.getNombre()).concat(" ")
				.concat(cliente.getApellido());
		setDescripcion(cadena);

		System.out.println(" >>> ".concat(cadena));
	}

	@PreDestroy
	public void fin() {
		setDescripcion(descripcion.concat(" >> objeto destruido"));
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemFactura> getItems() {
		return items;
	}

	public void setItems(List<ItemFactura> items) {
		this.items = items;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
