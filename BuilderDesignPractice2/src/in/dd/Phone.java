package in.dd;

public class Phone 
{
   private  String name;
   private  int modelNumber;
   private  int ram;
    
	@Override
	public String toString() {
		return "Phone [name=" + name + ", modelNumber=" + modelNumber + ", ram=" + ram + "]";
	}

	public Phone(String name, int modelNumber, int ram) {
		super();
		this.name = name;
		this.modelNumber = modelNumber;
		this.ram = ram;
	}
	
	
    
    
    
}
