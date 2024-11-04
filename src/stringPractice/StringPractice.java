package stringPractice;


public class StringPractice {

	public static void main(String[] args) {
		System.out.print("Hello Worlddddddd.");
		System.out.println("Hello Worlddddddd.");
		System.out.println("Hello Worlddddddd.");
		
		//String Practice
		// I did Hello World again above this- on line 6
		
		String firstName = "Kara"; 
		char middleInitial = 'N';
		String lastName = "Ho";
		
		System.out.println("This student is " + firstName +' '+ middleInitial + ' '+ lastName);
		
		//we can also start adding age (as an int) 
		//practice making a form for first, middle, and last name and then age, DOB, and address :)
		//city, state, and zip
		
		int myAge = 18;
		System.out.println("And they are " + myAge + " years old");
		
		String myCity = "City City, USA";
		int myZip = 55678;

		
		String myAddress = "1234 Steak St";
		System.out.println("Her address is " + myAddress + ", " + myCity + ", " + myZip + ".");
		
		int myBirthday = 7;
		int myBirthmonth = 9;
		int myBirthyear = 2005;
		
		String myBirthday1 = "09/07/2005";
		System.out.println("She was born on " + myBirthday1);
		//method 1 is just printing my entire birthday as a string
		
		System.out.println("She was born on " + myBirthmonth + "/" + myBirthday + "/" + myBirthyear);
		//method 2 is printing each piece individually as ints
		
		//you can make something a varibale like "full name = firstname and last name"
		
		int fullNameLength = firstName.length();
		System.out.println(fullNameLength);
		//.length will give you the length of a string, but you have to remember length() with the parentheses
		//you can look through the dot options to find some cool things to use, and 
		//I might google those later. 
		
		System.out.println(firstName.charAt(2));
		//will print out the letter at place 0 
		
		System.out.print(firstName.toUpperCase());
		//will change the whole string to upper case, obviously.
		
		//String Escape Sequences
		/*
		 	\n = new line
		 	\t = new tab
		 	\b = backspace
		 
		 */
		

	}

}

