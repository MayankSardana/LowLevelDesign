package in.singleton;

public class Test {

	public static void main(String[] args) {
       
		  User u = User.getInstance();
		  
		  System.out.println(u.hashCode());
		  
		  User uu = User.getInstance();
		  System.out.println(uu.hashCode());
		  
		  User ww = User.getInstance();
		  System.out.println(ww.hashCode());
	}

}
