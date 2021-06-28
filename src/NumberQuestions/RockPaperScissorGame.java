package NumberQuestions;

import java.util.Random;
import java.util.Scanner;

import org.apache.commons.lang3.RandomStringUtils;

public class RockPaperScissorGame {

	public static void main(String[] args) {
		
		// 1 = Rock , 2= Paper, 3=Scissor
		
		int computerwin = 0;
		int humanwin = 0;
		int tie = 0;
		
		Random compnum = new Random();	
		Scanner userinput = new Scanner(System.in);
		 System.out.println("Choose anyone from Rock,Paper,Scissor");
		//System.out.println( computer);
	
		
		
		for(int i=1; i<=5; i++) {
		
		 int computer = compnum.nextInt(3);
	
			int User=userinput.nextInt();

			
			if(computer==0 && User==0) {// 1 = Rock , 2= Paper, 3=Scissor
			    System.out.println("Match Tied");
				tie++;
			}
			else if(computer==0 && User==1) {// 1 = Rock , 2= Paper, 3=Scissor
			    System.out.println("You Win");
				humanwin++;
			}
			else if(computer==0 && User==2) {// 1 = Rock , 2= Paper, 3=Scissor
				System.out.println("You Loose");
				computerwin++;
			}
			else if(computer==1 && User==0) {// 1 = Rock , 2= Paper, 3=Scissor
				System.out.println("You Loose");
				computerwin++;
			}
			else if(computer==1 && User==1) {// 1 = Rock , 2= Paper, 3=Scissor
			    System.out.println("Match Tied");
				tie++;
			}
			else if(computer==1 && User==2) {// 1 = Rock , 2= Paper, 3=Scissor
				System.out.println("You Win");
				humanwin++;
			}
			else if(computer==2 && User==0) {// 1 = Rock , 2= Paper, 3=Scissor
				System.out.println("You Win");
				humanwin++;
			}
			else if(computer==2 && User==1) {// 1 = Rock , 2= Paper, 3=Scissor
				System.out.println("You Loose");
				computerwin++;
			}
			else if(computer==2 && User==2) {// 1 = Rock , 2= Paper, 3=Scissor
			    System.out.println("Match Tied");
				tie++;
			}
			
			else if(User>2) {
				System.out.println("Please choose valid number");
			}
			
		}
		
		if(computerwin>humanwin) {
			
			System.out.println("computer score - "+computerwin+":"+humanwin+":"+tie);
			System.out.println("Sorry ! You Lose");
		}
		else if(humanwin>computerwin) {
			System.out.println("you score - "+humanwin+":"+computerwin+":"+tie);
			System.out.println("Congratulations! You Win");
		}
	
		
	}

}
