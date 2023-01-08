package program;

public class CountZero {

	public static void main(String[] args) {

		int arr[] = { 0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1 };

		int n = arr.length;

		System.out.println(getMaxLength(arr, n));
	}

	static int getMaxLength(int arr[], int n) {

		int count = 0; // initialize count
		int result = 0; // initialize max

		for (int i = 0; i < n; i++) {

			// Reset count when 0 is found
			if (arr[i] == 0)
				count = 0;

			// If 1 is found, increment count
			// and update result if count becomes
			// more.
			else {
				count++;// increase count
				result = Math.max(result, count);
			}
		}

		return result;
	}

}
