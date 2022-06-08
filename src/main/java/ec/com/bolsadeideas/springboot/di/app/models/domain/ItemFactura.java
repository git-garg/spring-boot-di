package ec.com.bolsadeideas.springboot.di.app.models.domain;

public class ItemFactura {

	private Producto producto;
	private Long cantidad;

	public ItemFactura(Producto producto, Long candtidad) {
		this.producto = producto;
		this.cantidad = candtidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Long getCantidad() {
		return cantidad;
	}

	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}

	public Double obtenerSubTotal() {
		return this.cantidad * producto.getPrecio();
	}

}
