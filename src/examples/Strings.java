package examples;

public class Strings {

	public static void main(String[] args) {

// 1. contains, trim, replace, immutability
//		System.out.println("supercalifragilistic".replace("a", "4").replace("i","1"));
//		String food = "food";
//		food = food.replace("o", "0");
//		System.out.println(food);

// 2. Printf
//		int day = 9;
//		String month = "March";
//		int year = 1993;
//		char grade = 'A';
//		int marks = 99;
//		System.out.printf("Born on %dth %s, %d\n", day, month, year);
//		System.out.format("Secured %d%% and %c grade\n", marks, grade);

//		String where = "the beach";
//		String who = "my friends";
//		System.out.printf("This weekend I went to %S with %s.", where, who);

// 3. Equals Vs ==
//		String string1 = "Joonspoon";
//		String string2 = "joonspoon";
//		System.out.println(string1.equalsIgnoreCase(string2));

// 4. compareTo
//		System.out.println("x".compareTo("x"));
//		Collections.sort(new ArrayList<String>(Arrays.asList("a", "b")));

// 5. Searching: substring, charAt, indexof
		// System.out.println(isPlural("bananas"));
//		System.out.println(numberOfAs("bananas"));

//		 System.out.println("joonspoon".indexOf('o', 5));
		
		String[] separatedName = "Ada Lovelace".split(" ");
		System.out.println(separatedName[0]);
		System.out.println(separatedName[1]);

	}

	private static int numberOfAs(String string) {
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == 'a')
				count++;
		}
		return count;
	}

	private static boolean isPlural(String string) {
		String lastLetter = string.substring(string.length() - 1, string.length());
		if (lastLetter.equalsIgnoreCase("s"))
			return true;
		return false;
	}
}
