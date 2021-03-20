package patternComposite.orders;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import patternComposite.products.AbstractProduct;

/**
 * Clase que intenta representar una orden de venta a muy alto nivel, con la finalidad de simular como es que la aplicación de punto de venta utilizará los productos simples y compuestos para vedérselos a nuestros clientes.
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public class SalesOrder {

	private long orderId;
	private String customer;
	private List<AbstractProduct> products  = new ArrayList<AbstractProduct>();
	
	public SalesOrder(long orderId, String customer) {
		super();
		this.orderId = orderId;
		this.customer = customer;
	}
	
	public double getPrice() {
		double price = 0d;
		for (AbstractProduct child : products) {
			price += child.getPrice();
		}
		return price;
	}
	
	public void addProduct(AbstractProduct product) {
		this.products.add(product);
	}
	
	public void printOrder() {
		NumberFormat formater = new DecimalFormat("###,##0.00");
		System.out.println("\n===============================" +
		"\nOrder: " + orderId + "\nCliente: " + customer + 
		"\nProductos:\n");
		for(AbstractProduct produc : products) {
			System.out.println(produc.getName() + "\t\t\t$ " + 
					formater.format(produc.getPrice()));
					}
		System.out.println("Total: " + formater.format(getPrice()));
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public List<AbstractProduct> getProducts() {
		return products;
	}

	public void setProducts(List<AbstractProduct> products) {
		this.products = products;
	}
	
	
	
}
