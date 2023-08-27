package Day7;

class Bike
{
	final void run()
	{
		System.out.println("Running");
	}
}

class Honda extends Bike
{
	void run()  // Not able to overwrite the method in child class because parent class is final
	{
		System.out.println("Started");
	}

}

public class FinalUsedinMethod {

	public static void main(String[] args) {
		

	}

}
