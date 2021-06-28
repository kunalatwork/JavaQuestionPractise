package StringQuestions;

import java.util.Scanner;

public class SearchElementInAnArray {

	public static void main(String[] args) {
	
		String name[] = {"Kunal", "Rakhi", "Myra","Raavan", "Khumbhkaran", "Bakasur"};
		
		String n ="Kunal";
		boolean flag=false;
		int lang= name.length;
		for(int i=0; i<lang; i++) {
			if(n==name[i]) {
				System.out.println("Name searched ");
				flag=true;
				break;
			}
		}
		
		if(flag==false) {
			System.out.println("Name not found");
		}
	}

}
