package p_28_12_2021;

public class Zadatak1 {

	public static void main(String[] args) {
//		Napisati metodu koja stampa niz. Metoda kao parametar prima niz brojeva.
//		U glavnom programu kreirajte niz i pozovite metodu

		
		int brojevi [] = {1,2,3,4,5,6,7,8,9};
		niz (brojevi);
		
	}
		
	
	public static void niz (int array [])  {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}
}
		


