package NumberQuestions;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int num[] = {1,2,4,5};
		int temp = 0;
		int temp2= 0;
		int l = num.length;
		for(int i=0; i<=l-1; i++) {
			temp = temp+num[i];
		}
		System.out.println(temp);
		for(int a=1; a<=5; a++) {
			temp2=temp2+a;
		
		}
		System.out.println(temp2);
		int ans = temp2-temp;
		System.out.println(ans);

	}

}
