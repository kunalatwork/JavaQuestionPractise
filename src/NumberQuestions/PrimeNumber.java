package NumberQuestions;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=11;
		int count = 0;
		if(num>1) {
			for(int i=1;i<=17; i++)
			{
				if(num%i==0)
					count++;
			}
			if(count==2) {
				System.out.println(num+" is a prime humber");
			}
			else {
				System.out.println("Number is not prime number");
			}
		}



	}

}
