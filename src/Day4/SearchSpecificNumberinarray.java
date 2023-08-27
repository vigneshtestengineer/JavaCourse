package Day4;

public class SearchSpecificNumberinarray {

	public static void main(String[] args) {


		int array[] = {366,897,777,989,888,999,100,788};
		
		int search =777;
		
		for (int a : array) {
			if (a==search) {
				System.out.println(a);
			}
		}

	}

}
