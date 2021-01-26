import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {

	// Complete the gameOfThrones function below.
	static boolean flag = false;
	static String str = "";

	static String gameOfThrones(final String s) {

		boolean isLengthEven = false;
		if (s.length() % 2 == 0) {
			isLengthEven = true;
		}

		final Set<String> set = Arrays.stream(s.split("")).collect(Collectors.toSet());

		set.forEach((a) -> {
			int counter = 0;
			for (int i = 0; i < s.length(); i++) {
				if (a.equals(s.subSequence(i, i + 1))) {
					counter++;
				}
			}
			flag = counter % 2 == 0;
		});
		if (flag) {
			set.forEach((a) -> {
				str += a;
			});
		}

		System.out.println(str);
		return "";

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(final String[] args) throws IOException {
		gameOfThrones("aabbcc");
	}
}
