
import java.util.ArrayList;

public class BootCampAdministration {

	private ArrayList<BootCampCandidates> anArrayListOfBootCamps;
	// a private ArrayList with object of BootCampCandidates with name
	// anArrayListOfBootCamps

	BootCampAdministration(BootCampCandidates[] arrayOfB) {
		this.anArrayListOfBootCamps = new ArrayList<>();// a constructor
														// which receives an
														// array with
														// BootCampCandidate
														// objects and

		for (int i = 0; i < arrayOfB.length; ++i) {
			this.anArrayListOfBootCamps.add(arrayOfB[i]);
		} // initializes the anArrayListOfBootCamps ArrayList by adding all
			// BootCampCandidate array's elements in the the
			// anArrayListOfBootCamps

	}

	// setters and getters for BootCampAdministration
	public ArrayList<BootCampCandidates> getAnArrayListOfBootCamps() {
		return this.anArrayListOfBootCamps;
	}

	public void setAnArrayListOfBootCamps(ArrayList<BootCampCandidates> newArrayListBootCamp) {
		this.anArrayListOfBootCamps = newArrayListBootCamp;
	}

	// create an int method that returns the size of anArrayListOfBootCamps
	public int methodSize(ArrayList<BootCampCandidates> n) {
		return n.size();
	}

	// a method that adds a new BootCampCandidate inside the ArrayList
	public void addBootCamp(BootCampCandidates B) {
		this.anArrayListOfBootCamps.add(B);

	}

	// method that removes a candidate by name and returns true if found or
	// false if not
	public boolean removeCandidate(String name) {
		for (int i = 0; i < anArrayListOfBootCamps.size(); i++) {
			if (anArrayListOfBootCamps.get(i).getName().equals(name)) {
				this.anArrayListOfBootCamps.remove(i);
				return true;
			}
		}
		return false;
	}

	// method to search for a boot camp member by surname and returns a string
	// with its information
	// if it's found and null if it's not found
	public String findMenber(String surname) {
		for (int i = 0; i < anArrayListOfBootCamps.size(); i++) {
			if (anArrayListOfBootCamps.get(i).getSurname().equals(surname)) {
				return anArrayListOfBootCamps.get(i).getSurname().toString();
			}
		}
		return null;
	}

	// a method that can change a bootcampers age by having as input its name
	// and surname
	public void changeAge(String name, String surname, int age) {
		for (int i = 0; i < anArrayListOfBootCamps.size(); i++) {
			if ((anArrayListOfBootCamps.get(i).getSurname().equals(surname))
					&& (anArrayListOfBootCamps.get(i).getName().equals(name))) {
				anArrayListOfBootCamps.get(i).setAge(age);
			}
		}
	}

}
