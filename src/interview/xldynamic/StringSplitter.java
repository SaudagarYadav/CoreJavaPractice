package interview.xldynamic;


public class StringSplitter {

	public static void stringSplitter() {
		final String input = "5.0,100,5.5,101,6.0,102:L10;5.0,99,5.5,100,6.0,101:L20;5.0,98,5.5,99,6.0,100:L30;";

		final String[] inputArray = input.split(";");

		final int noOfRows = (inputArray[0].split(":L")[0].split(",").length / 2) + 1;
		final int noOfColumns = inputArray.length + 1;

		final String[][] outputArray = new String[noOfRows][noOfColumns];
		outputArray[0][0] = "0";

		int lockPeriodIndex = 1;
		int rowIndex = 1;
		int columnIndex = 1;
		for (int i = 0; i < inputArray.length; i++) {
			rowIndex = 1;
			final String[] ratesAndLockPeriod = inputArray[i].split(":L");
			outputArray[0][lockPeriodIndex++] = ratesAndLockPeriod[1];
			final String[] rates = ratesAndLockPeriod[0].split(",");
			for (int j = 0; j < rates.length; j++) {
				printtwoDimensionalArray(outputArray);
				outputArray[rowIndex][columnIndex-1] = rates[j];
				if (j % 2 != 0) {
					rowIndex++;
					columnIndex = 1;
				} else {
					columnIndex = lockPeriodIndex;
				}
			}

		}
		printtwoDimensionalArray(outputArray);
	}

	public static void main(final String[] args) {
		stringSplitter();
	}

	public static void printtwoDimensionalArray(final String[][] array) {
		for (final String[] strings : array) {
			//System.out.println(Arrays.toString(strings));
		}
	}
}
