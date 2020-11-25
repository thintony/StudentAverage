package cohort5;
import java.util.Scanner;
public class Welcome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1;
		int num2;
		int sum;
		System.out.println("enter num1");
		num1 = input.nextInt();
		System.out.println("enter num2");
		num2 = input.nextInt();
		
		sum = num1 + num2;
		int account =sum + num1;
		
	System.out.printf("Sum is:%d%nAccount is:%d", sum, account);

	}
	

}
