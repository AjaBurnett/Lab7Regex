import java.util.regex.Matcher;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexLab{
	
	
	
	
	public static void main (String[] args) {
	
		
		{System.out.println("Please a valid name");
		Scanner in = new Scanner(System.in);
		
		
		String userName = in.nextLine();
		boolean test1= Pattern.matches("(^[A-Z]+[a-z]\\w{0,29})", userName);
		
		if (test1 == false) {
			System.out.println("Sorry. Name is not valid");
		}
		else {System.out.println("Name is valid!");}
		
		
		}
	
		{System.out.println("Please a valid email");
		Scanner in = new Scanner(System.in);
		
		
		String userEmail = in.nextLine();
		boolean test1= Pattern.matches("^\\w{5,30}[\\w-\\.]*\\@\\w{5,10}((-\\w+)|(\\w*))\\.[a-z]{2,3}$", userEmail);
		
		if (test1 == false) {
			System.out.println("Sorry. Email is not valid");
		}
		else {System.out.println("Email is valid!");}
		
		
		}
		

			{System.out.println("Please a valid phone number (555-555-5555)");
	Scanner in = new Scanner(System.in);
		
	String phoneNumber = in.nextLine();
	boolean test= Pattern.matches("\\d{3}-\\d{3}-\\d{4}", phoneNumber);
	
	if (test == false) {
		System.out.println("Sorry. Phone number is not valid");
	}
	else {System.out.println("Phone number is valid!");}
	}
	
			
			{System.out.println("Please enter date dd/mm/yyyy");
			Scanner in = new Scanner(System.in);
				
			String userDate = in.nextLine();
			boolean test= Pattern.matches("^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$", userDate);
			
			if (test == false) {
				System.out.println("Sorry. Date is not valid");
			}
			else {System.out.println("Date is valid!");}
			}
	
	
	
	
	}
	
	

	
		
	
	
	

	
		 
		
		
		
			


//public class Validator {
	public  String getString(Scanner sc, String prompt) {
		System.out.print(prompt);
		String s = sc.next(); // read user entry
		sc.nextLine(); // discard any other data entered on the line. do not use for 
		 			//more than one word
		return s;
		
		//asking for a string, assigning it to s and clearing out the garbage		}
	}
	public  int getInt(Scanner sc, String prompt) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Error! Invalid integer value. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
			//checking to see if the input is a whole number
		}
		return i;
	}

	public int getInt(Scanner sc, String prompt, int min, int max) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			i = getInt(sc, prompt);
			if (i < min)
				System.out.println("Error! Number must be " + min + " or greater.");
			else if (i > max)
				System.out.println("Error! Number must be " + max + " or less.");
			else
				isValid = true;
		}
		return i;
	}

	public  double getDouble(Scanner sc, String prompt) {
		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				isValid = true;
			} else {
				System.out.println("Error! Invalid decimal value. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return d;
	}

	public  double getDouble(Scanner sc, String prompt, double min, double max) {
		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			d = getDouble(sc, prompt);
			if (d < min)
				System.out.println("Error! Number must be " + min + " or greater.");
			else if (d > max)
				System.out.println("Error! Number must be " + max + " or less.");
			else
				isValid = true;
		}
		return d;
	}

}
