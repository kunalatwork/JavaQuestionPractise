package NumberQuestions;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomNumber {
	public static void main(String[]args) {
		
		// By create random object
		
		Random ran = new Random();
		int generate = ran.nextInt(3);
		System.out.println(generate);
		
		
		// By create random object

		Random ran1 = new Random();
		double generate1 = ran1.nextDouble();
		System.out.println(generate1);
		
		
		// By math class 

		double generate2=Math.random();
		System.out.println(generate2);
		String r =RandomStringUtils.random(9, "KFSKDJFHAS7654JAJHDSGMXCBVMZIURGIUERHGKERB3523452342534");
		System.out.println(r);
		
		
		String ra=RandomStringUtils.randomNumeric(5);
		System.out.println(ra);
		
		String rrr=RandomStringUtils.randomAlphanumeric(7);
		System.out.println(rrr);
		
		
	}

}
