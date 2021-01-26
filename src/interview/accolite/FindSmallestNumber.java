package interview.accolite;

public class FindSmallestNumber {

	public static void main(String[] args) {
		String num = "322074";
		int arr[] = new int[9];
		int n;
		int counter;
		String smallestNum="";
		for (int i = 0; i < num.length(); i++) {
			n = Integer.valueOf(num.substring(i, i+1));
			arr[n] = arr[n] + 1; 
		}
		for (int i = 0; i < arr.length; i++) {
			counter = arr[i];
			while (counter>=1) {
				smallestNum+=String.valueOf(i);
				counter--;
			}
		}
		
		System.out.println(smallestNum);
	}
}
