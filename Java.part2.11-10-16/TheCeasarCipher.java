import java.util.*;
public class TheCeasarCipher{

	public static void main(String args[]){
		   Scanner input = new Scanner(System.in);
           System.out.println("Enter a word or a phrase (capital letters): ");
           String phrase = input.nextLine();
           //phrase encrypted with the Caesar cipher
           System.out.print("Which is the number of positions to shift each character: ");
           int shift = input.nextInt();
		   //the Caesar cipher works by substituting each character in a message with a character that 
           //occurs  x  places later on the alphabet, 
           //wrapping around from the beginning, if needed
		   if (shift>26) {shift = shift % 26;}
		   
		   char [] matrix = phrase.toCharArray();//Convert String phrase to char array

           for(char i: matrix){
        	   int a = i + shift;
        	   if(a<=90){
				 System.out.print((char)a);} // latin alphabet - capital letters in ASCII: 65-90
        	   else
        	   {int n= a-26;
				System.out.print((char)n);}
           }
	}
}