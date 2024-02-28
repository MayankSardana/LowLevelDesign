package in.builder;

public class PizzaBuilder {
	private String pizzaName;
    private String mushroom;
    private String tomato;
    private String pizzaBase;
    private String cheeseBurst;
    private int size;
    
	public PizzaBuilder setMushroom(String mushroom) {
		this.mushroom = mushroom;
		return this;
	}
	
	



	public PizzaBuilder setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
		return this;
	}



	public PizzaBuilder setTomato(String tomato) {
		this.tomato = tomato;
		return this;
	}
	public PizzaBuilder setPizzaBase(String pizzaBase) {
		this.pizzaBase = pizzaBase;
		return this;
	}

	public PizzaBuilder setCheeseBurst(String cheeseBurst) {
		this.cheeseBurst = cheeseBurst;
		return this;
	}

	public PizzaBuilder setSize(int size) {
		this.size = size;
		return this;
	}
	
	public Pizza getPizza() {
		return new Pizza( this.pizzaName , this.mushroom , this.tomato , this.pizzaBase , this.cheeseBurst , this.size);
	}
		
    
}
