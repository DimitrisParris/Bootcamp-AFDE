public class Item<Key,Value>
{
private Key k; 
private Value v; 
public Item(Key a, Value b)
{
k = a;
v = b;
}
public void put(Key kk, Value vv)
{
k = kk;
v = vv;
}

public Value get()
{
return v;
}
public static void main(String [] args)
{ 
Item<String, Integer> phonebook = new Item<String, Integer>("Babis", 3456789);

Item<Integer, Double> product = new Item<Integer, Double>(1001, 449.99);
System.out.println(phonebook.get());
System.out.println(product.get());
}


}