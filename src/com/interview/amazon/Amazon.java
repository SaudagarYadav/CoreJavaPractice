package interview.amazon;

public class Amazon {
	public static void main(String[] args) {
		/* Given an array of distinct elements and a number x, 
		find if there is a pair with product equal to x. */
		int arr[] = {11, 21, 9, 40};
		int x = 400;
		System.out.println(FirstProductOutPut(arr, x));
		
		String str = "74586348";
		int n = 3;
		SecondRemoveAndFindSmallestNumber(str,n);
		
		
	}

	private static String SecondRemoveAndFindSmallestNumber(String str, int n) {
		
		return null;
	}

	private static boolean FirstProductOutPut(int[] arr, int x) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i]*arr[j] == x) {
					return true;
				}
			}
		}
		return false;
	}
}
