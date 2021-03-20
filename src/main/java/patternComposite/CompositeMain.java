package patternComposite;

import java.util.Random;

import patternComposite.orders.SalesOrder;
import patternComposite.products.CompositeProduct;
import patternComposite.products.SimpleProduct;

/**
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public class CompositeMain {

	private final Random random = new Random();

	private SimpleProduct ram4gb;
	private SimpleProduct ram8gb;
	private SimpleProduct disk500gb;
	private SimpleProduct disk1tb;
	private SimpleProduct disk2tg;
	private SimpleProduct cpuAMD;
	private SimpleProduct cpuIntel;
	private SimpleProduct smallGabinete;
	private SimpleProduct mediumGabinete;
	private SimpleProduct bigGabinete;
	private SimpleProduct monitor20inch;
	private SimpleProduct monitor30inch;
	private SimpleProduct simpleMouse;
	private SimpleProduct gammerMouse;

	private CompositeProduct gammerPC;
	private CompositeProduct homePC;
	private CompositeProduct pc2x1;

	private void buildProducts() {
		// Construccion de productos simples
		ram4gb = new SimpleProduct("Memoria Ram 4gb", 750, "KingStone");
		ram8gb = new SimpleProduct("Memoria Ram 8gb", 1150, "KingStone");
		disk500gb = new SimpleProduct("Disco Duro 500GB", 750, "ACME");
		disk1tb = new SimpleProduct("Disco Duro 1000GB", 1050, "ACME");
		disk2tg = new SimpleProduct("Disco Duro 2000GB", 1750, "KingStone");
		cpuAMD = new SimpleProduct("CPU AMD", 350, "AMD");
		cpuIntel = new SimpleProduct("CPU INTEL", 740, "INTEL");
		smallGabinete = new SimpleProduct("Gabinete pequeño", 750, "KingStone");
		mediumGabinete = new SimpleProduct("Gabinete mediano", 750, "KingStone");
		bigGabinete = new SimpleProduct("Gabinete grande", 750, "KingStone");
		monitor20inch = new SimpleProduct("Monitor 20 pulgadas", 750, "LG");
		monitor30inch = new SimpleProduct("Monitor 30 pulgadas", 750, "LG");
		simpleMouse = new SimpleProduct("Raton simple", 10, "KingStone");
		gammerMouse = new SimpleProduct("Raton gamming", 75, "Asus");

		// Construccion de productos compuestos 
		gammerPC = new CompositeProduct("Gammer PC");
		gammerPC.addProduct(ram8gb);
		gammerPC.addProduct(disk1tb);
		gammerPC.addProduct(cpuIntel);
		gammerPC.addProduct(bigGabinete);
		gammerPC.addProduct(monitor30inch);
		gammerPC.addProduct(gammerMouse);
		
		homePC = new CompositeProduct("Casa PC");
		homePC.addProduct(ram4gb);
		homePC.addProduct(disk500gb);
		homePC.addProduct(smallGabinete);
		homePC.addProduct(monitor20inch);
		homePC.addProduct(simpleMouse);
		
		pc2x1= new CompositeProduct("Paquete PC gammer + casa");
		pc2x1.addProduct(gammerPC);
		pc2x1.addProduct(homePC);
	}
	
	private void orderSimpleProducts() {
		SalesOrder simpleProductOrder = new SalesOrder(Math.abs(random.nextInt()), "Victor Aguilar");
		simpleProductOrder.addProduct(ram4gb);
		simpleProductOrder.addProduct(disk1tb);
		simpleProductOrder.addProduct(simpleMouse);
		simpleProductOrder.addProduct(cpuAMD);
		simpleProductOrder.addProduct(mediumGabinete);
		simpleProductOrder.printOrder();
	}
	
	private void orderGammerPc() {
		SalesOrder gammerOrder = new SalesOrder(Math.abs(random.nextInt()), "Paula Rodriguez");
		gammerOrder.addProduct(gammerPC);
		gammerOrder.printOrder();
	}
	
	private void  orderHomePc () {
		SalesOrder homeOrder = new SalesOrder(Math.abs(random.nextInt()), "Coquis Loca");
		homeOrder.addProduct(homePC);
		homeOrder.printOrder();
	}
	
	private void orderCombo() {
		SalesOrder comboOrder = new SalesOrder(Math.abs(random.nextInt()), "Paquete 2x1 en PC");
		comboOrder.addProduct(pc2x1);
		comboOrder.printOrder();
	}
	
	private void bigOrder() {
		SalesOrder bigOrder = new SalesOrder(Math.abs(random.nextInt()), "Manolo el del bombo");
		bigOrder.addProduct(homePC);
		bigOrder.addProduct(ram4gb);
		bigOrder.addProduct(ram8gb);
		bigOrder.addProduct(monitor30inch);
		bigOrder.addProduct(gammerMouse);
		bigOrder.addProduct(disk2tg);
		bigOrder.printOrder();
	}

	public static void main(String[] args) {
		CompositeMain main = new CompositeMain();
		
		main.buildProducts();
		
		main.orderSimpleProducts();
		main.orderHomePc();
		main.orderGammerPc();
		main.orderCombo();
		main.bigOrder();
	}
}
