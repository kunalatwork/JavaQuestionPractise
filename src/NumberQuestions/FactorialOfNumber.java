package NumberQuestions;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int a=sc.nextInt();
		int temp=1;
			for(int i=1; i<=a;i++) {
				temp=temp*i;
		}
		System.out.println("Factorial of your number is = "+temp);
	}

}
