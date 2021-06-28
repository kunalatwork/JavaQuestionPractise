package NumberQuestions;

import java.util.Arrays;

public class SortByBuild_In_method {

	public static void main(String[] args) {
		
		int ar[] = {2,5,3,6,4,7,11,9};
		String a[] = {"kunal","rakhi","myrah","meghnaad"};
		
		Arrays.parallelSort(ar);
		System.out.println(Arrays.toString(ar));
		Arrays.sort(ar);
	    System.out.println(Arrays.toString(ar));
	    Arrays.parallelSort(a);
	    System.out.println(Arrays.toString(a));
	    
	}

}
