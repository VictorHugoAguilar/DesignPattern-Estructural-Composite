package patternComposite.products;

/**
 * Clase que representa al producto simple, este producto no podrá estar
 * compuesto por otros productos, por lo que representa a la forma más básica de
 * un producto.
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public class SimpleProduct extends AbstractProduct{

	protected String brand;
	
	public SimpleProduct(String name, double price, String brand) {
		super(name, price);
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}
