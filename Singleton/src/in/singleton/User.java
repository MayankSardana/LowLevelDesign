package in.singleton;

public class User 
{
     private static User user = new User();
     
     public static User getInstance() {
//    	   if(user==null) {
//    		    user = new User();
//    	   }
    	   return user;
     }
}
