package Excaption;

public class propogetion {
	public static void main(String[] args) {
		dad();
	}
	public static void dad() {
		try {
			mom();
		} catch (abhinihogi e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	public static void mom() throws abhinihogi {
		son();
	}
	public static void son() throws abhinihogi {
		throw new abhinihogi();
		
	}
	

}
