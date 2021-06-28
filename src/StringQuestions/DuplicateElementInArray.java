package StringQuestions;

import java.util.HashSet;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		
		// 1st way
		
		String array[] = {"Java", "Python", "C", "Java", "C++", "Ruby"};
		int len = array.length;

		boolean flag=false;
		for(int i=0; i<len; i++) {

			for(int a=i+1; a<len; a++) {


				if(array[a]==array[i]) {
					System.out.println("Duplicate Element found = " +array[i]);
					flag=true;
				}
			}

		}

		if(flag==false) {
			System.out.println("Duplpiacte element not found");
		}
		
		
		// 2nd Way
		String array2[] = {"Java", "Python", "C", "Java", "C++", "Ruby"};
		HashSet <String> language= new HashSet<String> ();
		boolean flag1=false;
		for(String l:array2) {
			if(language.add(l)==false) {
				System.out.println("duplicate element = " + l);
				flag1=false;
			}
		}
		
		if(flag1==true) {
			System.out.println("duplicate not found");
		}
	}

}

