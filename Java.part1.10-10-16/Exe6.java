import java.util.*;
public class Exe6 {
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Give me a:");
	int a = input.nextInt();
	String b = "";
	for (int i=1; i <= a; i++){
		int sm = i*(i+1)/2;
		if (i==1){
			b = "" + sm;
		}else{
			b = b + " " + (i*(i+1)/2);
	    }

	}
System.out.println(b);
}
}