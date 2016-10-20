public class Document1 {
//Create a static function, with the name "bootCamp", that receives as an input two int arguments,
//i.e., number1 and number2, and returns an int result in the end. If "number1" is smaller that "number2" then returns the square root
//(use Math.sqrt method) of the absolute value (use Math.abs) of the difference among "number1" and "number2".
//Else return the sum of the two numbers.
	public static int bootcamp(int num1, int num2){
      if (num1<num2){
		  int b = Math.abs(num1-num2);
		  return ((int)Math.sqrt(b));
      }else{
		  return(num1+num2);
      }
    }
    public static void main(String[]args){
		System.out.print("First " + bootcamp(25,91));
	    System.out.println("  Second " + bootcamp(91,25));
	}


}
