package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 6
 *  returns their name and a
 *  modified string 
 *  
 *  @author Samantha Mann
 *  @version 1.2
 */
public class Person6 {
  /** Holds the persons real name */
  private String name;
  	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
  public Person6(String pname) {
    name = pname;
  }
  	/**
	 * This method should take the string
	 * input and return its characters rotated
	 * 2 positions.
	 * given "gtg123b" it should return
	 * "g123bgt".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	  //Person 6 put your implementation here
		if (input != null) {
			char[] temp = input.toCharArray();

	    	for (int i = 0; i < 2; i++) { //complete shift two times
	      		char first = temp[0]; //store first element to move to back of array

	      		for (int j = 0; j < temp.length - 1; j++) {
	        		temp[j] = temp[j + 1]; //shift array left by one
	      		}

	      		temp[temp.length - 1] = first; //put first element at back of the array
	    	}

	  		return String.valueOf(temp); //convert char array back to string
		}

		return null;
	}
	
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}

}
