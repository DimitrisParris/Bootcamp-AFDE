public class Employee {
	private String firstname; private String lastname; private int datebirth=2016; int age;

	Employee(String firstname, String lastname, int datebirth){
		this.firstname=firstname;
		this.lastname=lastname;
		this.datebirth=datebirth;
		}

	public void setName (String firstname1){this.firstname = firstname1;}
	public String getName() { return this.firstname; }
	public void setLName (String lastname){this.lastname = lastname;}
	public String getLName() { return this.lastname; }
	public String toString() {return "Employee's name is " + this.firstname + " " + this.lastname + " and his age is " + (2016 - this.datebirth) + ".";}



}