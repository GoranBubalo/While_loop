package whileLoop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//while loop = executes a block of code as long as it's 
		//condition remains true 
		
		Scanner scanner = new Scanner(System.in);
		String name ="";
		
		
		//while loop
		while(name.isBlank()) //if the name is blank
		{
			//Asking a question 
			System.out.println("Enter yor name: ");
			name = scanner.nextLine(); // User input required 
		}
		
		//output
		System.out.println("Hello " + name);

		
		
		scanner.close();
	}

}
