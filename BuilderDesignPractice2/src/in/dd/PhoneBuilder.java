package in.dd;

public class PhoneBuilder 
{
	   private  String name;
	   private  int modelNumber;
	   private  int ram;
	   
	public PhoneBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public PhoneBuilder setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
		return this;
	}
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	
	public Phone getPhone() {
		return new Phone(name, modelNumber , ram);
	}
	   
	   
}
