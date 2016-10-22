import java.util.*;
public class Exe7 {
	//The pronic numbers are those that are the product
	//of two consecutive integers, so that they have the form  n(n+1)
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Give me a number:");
	int a = input.nextInt();
	String b = "";
	for (int i=1; i <= a; i++){
		int sm = i*(i+1);
		if (i==1){
			b = "" + sm;
		}else{
			b = b + " " + sm;}
	}
System.out.println(b);
}
}