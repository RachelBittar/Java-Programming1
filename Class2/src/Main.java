import java.util.Scanner;

//package bittar.rachel.class2;


public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Account myacount = new Account();
			
		System.out.println("Inicial Name is: " + myacount.getName()); // white space multiplataform 
		System.out.println("Please enter the name: ");
		//String theName = input.nextLine();

		myacount.setName(input.nextLine());
		
		System.out.println("Name in object myAccount is: " + myacount.getName());
		

	}

}

//%s%n%n