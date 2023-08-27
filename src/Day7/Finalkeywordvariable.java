package Day7;

public class Finalkeywordvariable {
	
	final int speed =40; // final variable, so we cannot change this value

	public static void main(String[] args) {
		
		Finalkeywordvariable fm=new Finalkeywordvariable();
		fm.speed=100; // Not able to assign this variable because for this variable there is final keyword 
		System.out.println(fm.speed);
		

	}

}
