package cohort5;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Account obj = new Account();
		
		System.out.println("Enter name");
		String name = input.next();
		obj.setName(name);
		
		System.out .printf("My name is %s",obj.getName());
	

	}

}
