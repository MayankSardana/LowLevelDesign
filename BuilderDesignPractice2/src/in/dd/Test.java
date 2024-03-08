package in.dd;

public class Test {

	public static void main(String[] args) {
        
		PhoneBuilder builder = new PhoneBuilder();
		Phone s = builder.setName("Iphone 12").setModelNumber(102).getPhone();
		System.out.println(s);
		
	}

}
