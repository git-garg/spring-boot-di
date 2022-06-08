package ec.com.bolsadeideas.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import ec.com.bolsadeideas.springboot.di.app.models.domain.ItemFactura;
import ec.com.bolsadeideas.springboot.di.app.models.domain.Producto;
import ec.com.bolsadeideas.springboot.di.app.models.service.IServicio;
import ec.com.bolsadeideas.springboot.di.app.models.service.MiServicio;
import ec.com.bolsadeideas.springboot.di.app.models.service.MiServicioComplejo;

@Configuration
public class AppConfig {

	@Bean("miServicio")
	@Primary
	public IServicio registrarMiServicio() {
		return new MiServicio();
	}

	@Bean("miServicioSecundario")
	public IServicio registrarMiServicioComplejo() {
		return new MiServicioComplejo();
	}

	@Bean("itemsFactura")
	public List<ItemFactura> registraItemFactura() {

		Producto productoVaso = new Producto("Vaso", 1.50);
		Producto productoTenedor = new Producto("Tenedor", 2.10);
		Producto productoCuchillo = new Producto("Cuchillo", 1.89);

		ItemFactura itemVaso = new ItemFactura(productoVaso, 10l);
		ItemFactura itemTenedor = new ItemFactura(productoTenedor, 10l);
		ItemFactura itemCuchillo = new ItemFactura(productoCuchillo, 10l);

		return Arrays.asList(itemVaso, itemTenedor, itemCuchillo);
	}
	
	@Bean("itemsFacturaOficina")
	public List<ItemFactura> registraItemFacturaOficina() {

		Producto productoMonitor = new Producto("Monitor", 125.35);
		Producto productoCasePC = new Producto("Case PC", 30.25);
		Producto productoMouse = new Producto("Mouse ergonómico", 14.69);

		ItemFactura itemMonitor = new ItemFactura(productoMonitor, 10l);
		ItemFactura itemCasePC = new ItemFactura(productoCasePC, 10l);
		ItemFactura itemMouse = new ItemFactura(productoMouse, 10l);

		return Arrays.asList(itemMonitor, itemCasePC, itemMouse);
	}

}
