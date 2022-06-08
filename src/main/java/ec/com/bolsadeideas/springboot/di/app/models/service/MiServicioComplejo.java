package ec.com.bolsadeideas.springboot.di.app.models.service;

//@Service Se puede usar este que es igual que componet, pero mas por semantica para
// distiguir

//@Primary
//@Component("miServicioSecundario")
public class MiServicioComplejo implements IServicio {

	@Override
	public String operacion() {
		return "ejecuta una operacion importante con inyección de interface, complejo";
	}
}
