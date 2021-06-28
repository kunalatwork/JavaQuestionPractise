package NumberQuestions;

import java.util.Arrays;

public class SortElementInArray {

	public static void main(String[] args) {

		int ar[] = {2,5,3,6,4,7,11,9};
		int len= ar.length;
		int temp=0;
		for(int a=0; a<len; a++) 
		{

			for(int b=a+1; b<len;b++) {

				if(ar[a]>ar[b]) { 
					temp=ar[a];
					ar[a]=ar[b];
					ar[b]=temp;

				}
			}
		}
		System.out.print(Arrays.toString(ar));

	}

}
