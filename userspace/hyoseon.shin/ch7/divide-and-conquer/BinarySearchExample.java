/**
 * @description Binary Search (Java)
 * @author 신효선(shs)
 */
public class BinarySearchExample {

	static int[] a = { 5, 8, 11, 13, 19, 21, 22, 24, 29, 34, 38 };
	static int step = 0;

	public static void main(String[] args) {
		int low = 0;
		int high = a.length - 1;

		int findNum = 21;

		System.out.println("a = { 5, 8, 11, 13, 19, 21, 22, 24, 29, 34, 38 }");
		System.out.println("Find idx of " + findNum);
		System.out.println("************************************************");

		int result = binarySearch(findNum, low, high);

		System.out.println("************************************************");
		System.out.println("Result: " + result);
	}

	public static int binarySearch(int findNum, int low, int high) {
		int mid = (low + high) / 2;
		System.out.println("[Step " + ++step + "] low: " + low + ", high: "
				+ high + ", mid: " + mid + ", a[mid]: " + a[mid]);

		if (low > high) {
			return -1; // Not found!!
		} else if (a[mid] == findNum) {
			return mid;
		} else if (a[mid] < findNum) {
			return binarySearch(findNum, mid + 1, high);
		} else {
			return binarySearch(findNum, low, mid - 1);
		}
	}
}
