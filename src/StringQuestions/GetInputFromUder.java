package StringQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Pattern;

public class GetInputFromUder {

	public static void main(String[] args) throws IOException {
		Scanner data = new Scanner(System.in);
		
		System.out.println("Enter your name");
		
		String name = "";
		
		String get = data.next();
		name = name+get;
		
		System.out.println("Your name is : "+name);
		
		
		
		System.out.println( "Enter your age");
	    int num=data.nextInt();
	    System.out.println( "You age is :"+num);
	    
	    
	    BufferedReader f = new BufferedReader( new InputStreamReader(System.in));
	    System.out.print(""
	    		+ "Question : Language ?");
	    String n = f.readLine();
	    System.out.println("Your leaning language : "+n);
	    
	    int d= f.read();
	    System.out.println(d);
	    
	}

}
