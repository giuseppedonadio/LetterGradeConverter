package gradeConverter;

import java.util.Scanner;

public class GradeApp {

	public static void main(String[] args) {
		
		String answer = "y";
		
		Scanner sc = new Scanner(System.in);		
		
		while(answer.equalsIgnoreCase("y")) {
			
			System.out.println("Enter numerical grade:");
			int number = Integer.parseInt(sc.nextLine());
			
			//grade object
			Grade grade = new Grade();
			grade.setNumber(number);
			
			String message = "Letter Grade: " + grade.letter();
			System.out.println(message);
			
			System.out.println("Do you want to continue? (y/n)");
			answer = sc.nextLine();
		}
		sc.close();
		System.out.println("Bye!");

	}

}
