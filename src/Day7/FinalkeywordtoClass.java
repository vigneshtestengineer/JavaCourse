package Day7;

final class Bike1
{
    int speed =100;
    
    void run()
    {
    	System.out.println(speed);
    }

}

class Honda1 extends Bike1  // Here is compile error because class is assigned with "final" keyword so parent class not able to extends with other child class
{
    int speed =300;
    
    void run()
    {
    	System.out.println(speed);
    }

}

public class FinalkeywordtoClass {

	public static void main(String[] args) {
		
		Bike1 d=new Bike1();
		
		d.run();

	}

}
