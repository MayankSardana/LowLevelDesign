package in.strategy;

public class Test {

	public static void main(String[] args) {
        Technology mobile = new Technology();
        mobile.setQuality(new HighVedioQuality());
       String str =  mobile.getQuality().quality();
       System.out.println(str);
	}

}
