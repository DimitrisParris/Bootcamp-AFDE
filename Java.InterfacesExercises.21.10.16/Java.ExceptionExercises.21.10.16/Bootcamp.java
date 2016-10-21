
public class Bootcamp 
{
	public static void welcome(double x) throws Exception
	{if (x>25){throw new DigitException();}//If method argument's value is greater than 25,
                                          //the method produces an exception called DigitException
	 else{throw new AnotherDigitException();}//Otherwise, the method produces an exception called AnotherDigitException.
	}
	
	public static int bye() throws Exception
	{ try {welcome(299.7); return 0;}
	  catch (DigitException e) {  return 605; }
	  catch (AnotherDigitException e) {  return 230; }
	}
	
	public static void main (String [] args) throws Exception
	{System.out.println(bye());}
}
