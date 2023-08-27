package Day7;

//Rewrite the methods in child class

// Method definition should be same

// Body should be changed


class Bank   
{
	double rateofintrest()
	{
		return 0;  
	}
}

class SBI extends Bank
{
	
	double rateofintrest()
	{
		return 10.5;  // Extends and all methods are same but return values is differ it will overriding the method
	}
	
}

class ICICI extends Bank
{
	double rateofintrest()
	{
		return 9.7;
	}
}

class Axis extends Bank
{
	double rateofintrest()
	{
		return 8.5;
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		
		SBI sbi =new SBI();
		System.out.println(sbi.rateofintrest());
		
		ICICI icici =new ICICI();
		System.out.println(icici.rateofintrest());
		
		Axis axis =new Axis();
		System.out.println(axis.rateofintrest());

	}

}
