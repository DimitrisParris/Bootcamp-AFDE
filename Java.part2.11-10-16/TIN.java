import java.util.*;
public class TIN {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Give me your nine-digit TIN:");
		//The Greek Tax Identification Number (TIN) consists of 9 digits.
		String tin = input.next();
		if (tin.length()!=9){
			System.out.println("You have to give me a 9-digit TIN");
			tin = input.next();
			}
		int sum=0;
		String [] matrix = new String[8];
		String lastDigit = tin.substring(8,9);
		//The last digit is a check digit.
		//We remove the check digit, so that we are left with an 8-digit number.
		for (int i=0; i<8; i++){
			matrix[i]=tin.substring(i,i+1);
			int c = Integer.parseInt(matrix[i]);
			sum += (int)c * (Math.pow(2.0, 8.0 - (double)i));
			}
		int upol = sum % 11;
		int testnumber = upol%10;
		if(testnumber==Integer.parseInt(lastDigit))
		{
			System.out.println("Tax Identification Number valid.");
		}
		else{System.out.println("Tax Identification Number not valid.");}
		}
		
		
}
