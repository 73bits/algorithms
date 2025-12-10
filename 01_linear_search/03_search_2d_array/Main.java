import java.util.Arrays;

public class Main {
	public static void main(String ... args) {
		int[][] arr = new int[][] {
			{1, 78, -120},
			{10, 56, 733, 67, 92},
			{-1, -65, 245, 58},
			{18, 21}
		};

		System.out.println(search(arr, 245));
	}

	public static boolean search(int[][] arr, int target) {
		for (int[] array : arr) {
			for (int num : array) {
				if (num == target) {
					return true;
				}
			}
		}

		return false;
	}
}
