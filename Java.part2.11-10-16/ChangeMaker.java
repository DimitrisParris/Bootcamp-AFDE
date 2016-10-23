import java.util.*;
public class ChangeMaker{

	public static void main(String [] args){

		int poso, originalPoso, coin50, coin20, coin10, coin5, coin2, coin1;
		System.out.println("Enter a whole number from 1 to 99");
		Scanner kati = new Scanner (System.in);
		poso = kati.nextInt();
		originalPoso = poso;
		coin50= poso/50;
		poso=poso%50;
		coin20=poso/20;
		poso=poso%20;
		coin10=poso/10;
		poso=poso%10;
		coin5=poso/5;
		poso=poso%5;
		coin2=poso%2;
		coin1=poso;

		System.out.println(originalPoso + "cents in coins can be given as:");
		System.out.println(coin50 + " 50 cns");
		System.out.println(coin20 + " 20 cns");
		System.out.println(coin10 + " 10 cns");
		System.out.println(coin5 + " 5 cns");
		System.out.println(coin2 + " 2 cns");
		System.out.println(coin1 + " 1 cns");
	}
}



