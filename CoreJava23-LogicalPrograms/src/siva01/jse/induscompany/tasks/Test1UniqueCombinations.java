package siva01.jse.induscompany.tasks;

public class Test1UniqueCombinations {

	// Function for swapping the characters at position-I with character at
	// position-J
	public static String swapString(String swapString, int swapStart, int swapEnd) {
		char[] swapCharArray = swapString.toCharArray();
		char swapChar;
		swapChar = swapCharArray[swapStart];
		swapCharArray[swapStart] = swapCharArray[swapEnd];
		swapCharArray[swapEnd] = swapChar;
		return String.valueOf(swapCharArray);
	}

	// Function for generating different permutations of the string
	public static void generatePermutation(String permuString, int permuStart, int permuEnd) {
		if (permuStart == permuEnd - 1) {
			System.out.println(permuString);

		} else {
			for (int i = permuStart; i < permuEnd; i++) {
				permuString = swapString(permuString, permuStart, i);
				generatePermutation(permuString, permuStart + 1, permuEnd);
				permuString = swapString(permuString, permuStart, i);
			}
		}
	}

	public static void main(String[] args) {
		String mainString = "cat";
		int mainLength = mainString.length();
		System.out.println("All the permutations of the string are: ");
		generatePermutation(mainString, 0, mainLength);
	}
}
