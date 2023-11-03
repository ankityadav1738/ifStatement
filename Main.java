import java.util.Scanner;   // import the scanner library 

public class Main {

	public static void main(String[] args) {
		// declare the variable
		int a;
		int b;
		
		Scanner input = new Scanner(System.in);  // creates an object(input) from class 
		
		System.out.println("Enter a");
		a = input.nextInt();   // user Input
		
		System.out.println("Enter b");
		b = input.nextInt();
		
		int check_ans = a + b;    // add a + b and save answer in variable(check_ans)
		
		System.out.println("Add " + a + " + " + b + " = " );
		int ans = input.nextInt();
		
		if (ans != check_ans) { // if condition check if your answer is correct
			System.out.println("Your answer is wrong, the correct answer is " + check_ans);  // wrong answer print correct answer
		}
		else {  // else condition which returns the answer is correct
			System.out.println("Well done, You are right");
		}

	}

}
