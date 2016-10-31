
public class BootCampCandidates {

	private String name;// Create three private fields a name a surname and age
	private String surname;
	private int age;

	BootCampCandidates(String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}// Create a constructor that receives three arguments and initializes the
		// variables

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}// getters and setters for all your variables (six in total methods)

	public String toString(){
    	return "His name is " + this.name + "and his surname is " + this.surname + ". His age is " + this.age+ " years old.";
    }																										
}
