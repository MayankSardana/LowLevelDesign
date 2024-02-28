package in.builder;

public class Test {

	public static void main(String[] args) {
        
		PizzaBuilder dominoz = new PizzaBuilder();
		Pizza pizza = dominoz.setCheeseBurst("yes").setMushroom("yes").setPizzaName("framehouse").setSize(8).setTomato("no").setPizzaBase("soft and cheesy").getPizza();
		
		System.out.println(pizza);
		
		
        
	}

    

}
