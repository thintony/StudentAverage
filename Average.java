package cohort5;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numStud = 0;
		int grade = 0;
		int total = 0;
		double average = 0.0;
		System.out.println("Enter grade:");
		grade = scanner.nextInt();
		
		while(numStud <= 9) {
		
			
			if( grade < 0 || grade >= 100) 
				System.out.print("Value not real"); 
				
				else 
				{
					total = total + grade;
					numStud = numStud + 1;
			
			}
			
			average = (double)total /numStud ;
		}
		 System.out.printf("NumStud:%d%n%nTotal:%d%n%nAverage:%.2f",numStud,total,average);
		
	}

}
