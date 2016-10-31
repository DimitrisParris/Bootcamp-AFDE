import java.util.*; 
public class ArrayListExample
{
ArrayList<Double> data = new ArrayList<Double>();
Scanner input = new Scanner(System.in); 

public void askAndStoreData()
{
double d;
do
{
System.out.println("Give me a real number or 0 to finish.");
d = input.nextDouble();
data.add(d);
} while (d != 0); 

data.remove(0.0); 
} 
}
