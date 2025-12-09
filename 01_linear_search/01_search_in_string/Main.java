public class Main {
	public static void main(String ... args) {
		String name = "prashant";
		System.out.println(searchString(name, 's')); // true
		System.out.println(searchString(name, 'i')); // false
	}

	public static boolean searchString(String str, char target) {
		if (str.length() == 0) {
			return false;
		}

		for (char ch : str.toCharArray()) {
			if (ch == target) {
				return true;
			}
		}
		return false;
	}
}
