import java.util.Scanner;
public class Parity {
//A  way to check binary data is the so-called parity bit.
   public static void main(String args[]){
       System.out.println("Give me a binary 8-bit number:");
       Scanner mitsos = new Scanner(System.in);
       String a = mitsos.next();
       int sum=0;
       String [] monPin = new String[7];
       String b = a.substring(7,8);
       for (int i=0; i<7; i++){
           monPin[i]=a.substring(i, i+1);
           System.out.println(monPin[i]);
           if (monPin[i].equals("1")){
               sum = sum+1;
           }
       }
       System.out.println("sum is:" + sum);
       if (((sum%2)==0 && b.equals("0"))||((sum%2)!=0 && b.equals("1"))){
               System.out.println("Parity OK");
       }else {
             System.out.println("Parity NOT ok");
       }


   }
}