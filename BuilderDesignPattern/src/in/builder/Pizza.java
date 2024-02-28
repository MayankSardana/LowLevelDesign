package in.builder;

public class Pizza {
	private String pizzaName;
	private String mushroom;
    private String tomato;
    private String pizzaBase;
    private String cheeseBurst;
    private int size;
	

	
	@Override
	public String toString() {
		return "Pizza [pizzaName=" + pizzaName + ", mushroom=" + mushroom + ", tomato=" + tomato + ", pizzaBase="
				+ pizzaBase + ", cheeseBurst=" + cheeseBurst + ", size=" + size + "]";
	}



	public Pizza(String pizzaName , String mushroom, String tomato, String pizzaBase, String cheeseBurst, int size) {
//		super();
		this.pizzaName= pizzaName;
		this.mushroom = mushroom;
		this.tomato = tomato;
		this.pizzaBase = pizzaBase;
		this.cheeseBurst = cheeseBurst;
		this.size = size;
	}
    
    
}
