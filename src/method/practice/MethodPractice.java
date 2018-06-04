package method.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodPractice {
	public static void main(String[] args) {

		System.out.println("Q1 = " + getText("zarin"));
		System.out.println("Q2 = " + getUpperText("zarin"));
		System.out.println("Q3 = " + getOddNumber(21));
		System.out.println("Q4 = " + getEvenNumber(20));
		System.out.println("Q5 = " + getOoddNumber(21));
		System.out.println("Q6 = " + getMile(5));
		System.out.println("Q7 = " + getIndexOfNAME("khan"));
		System.out.println("Q8 = " + getIndex("khan"));
		System.out.println("Q9 = " + getSum(3));
		System.out.println("Q10 = " + getSquare(3));
		System.out.println("Q11 = " + Arrays.toString(getArrayList(10)));
		System.out.println("Q12 = " + Arrays.toString(getArrayListTwo(10)));
		System.out.println("Q13 = " + getList(3));
		System.out.println("Q14 = " + getFizzBuzz(30));

		int[] numberArray = { 3, 8, 9, 10 };
		System.out.println("Q15 = " + getArrayNumber(numberArray));

		int[] numberMax = { 3, 8, 9, 10 };
		System.out.println("Q16 = " + getArrayMaximum(numberMax));
		System.out.println("Q17 = " + getValue(3));
		System.out.println("Q18 = " + getValueOfINT("20"));
		System.out.println("Q19 = " + getTextofTrue("khan"));
		System.out.println("Q20 = " + getSumOfIndex("borson"));
		System.out.println("Q21 = " + getFiveText("i m qa engineer"));
		System.out.println("Q22 = " + getFirstFive("borsonkhan"));
		System.out.println("Q23 = " + getName("idonotloveyou"));
		System.out.println("Q24 = " + getWord("my name is king"));
		System.out.println("Q25 = " + getFirstWord("my name is what"));
		System.out.println("Q26 = " + getCountWord("who are you", "Who"));
		System.out.println("Q27 = " + getCountChar("borson", 'o'));
		System.out.println("Q28 = " + getGivenWord("my name is what", "What"));
		System.out.println("Q29 = " + getConsonent("borson"));
		System.out.println("Q30 = " + getVowel("borson"));
		System.out.println("Q31 = " + getCountOfuppertext("BorsonKhan"));
		System.out.println("Q32 = " + getSubject(("My name Is What")));
		System.out.println("Q33 = " + getCharacterWithoutSpace("My namei Is What"));
		System.out.println("Q34 = " + getUniqeText("Borson Khan"));

		int[] numberOne = { 4, 8, 9, 3 };
		System.out.println("Q35 = " + getNumberArray(numberOne));

		ArrayList<Integer> numberList = new ArrayList<Integer>();
		numberList.add(2);
		numberList.add(3);
		numberList.add(4);
		numberList.add(5);
		System.out.println("Q36 = " + getSumOFList(numberList));
		System.out.println("Q37 = " + getReverseValue("kingKhan"));

		ArrayList<Integer> numberListOne = new ArrayList<Integer>();
		numberListOne.add(2);
		numberListOne.add(3);
		numberListOne.add(4);
		numberListOne.add(5);
		System.out.println("Q38 = " + Arrays.toString(getConvertArray(numberListOne)));

		int[] numArray = { 4, 8, 9, 3 };
		System.out.println("Q39 = " + getNumberArray(numArray));
		int[] numTwo = { 4, 8, 9, 3, 2 };
		System.out.println("Q40 = " + Arrays.toString(getSortedArray((numTwo))));

	}

	/*
	 * Q1 = write a method take one name input and return your name; input =
	 * String name; return = String; serving bucket = variable
	 */
	public static String getText(String name) {
		String text = " ";

		text = name;

		return text;
	}

	/*
	 * Q2 = write a method that take one name input and return same String in
	 * upper case; input = String name; return = String; serving bucket =
	 * variable;
	 */
	public static String getUpperText(String name) {
		String upperText = " ";

		upperText = name.toUpperCase();

		return upperText;
	}

	/*
	 * Q3 = write a method a number/int return the list of all odd number from 0
	 * to that given number; input = int number; return = ArrayList<Integer>
	 * numberlist; serving bucket = array;
	 */
	public static ArrayList<Integer> getOddNumber(int number) {
		ArrayList<Integer> oddNumber = new ArrayList<Integer>();

		for (int i = 0; i <= number; i++) {

			if (i % 2 == 1) {

				oddNumber.add(i);
			}

		}

		return oddNumber;
	}

	/*
	 * 
	 * Q4 = write a method that take one number input and return the list of all
	 * even number from o to that given number
	 * 
	 * input = int number;
	 * 
	 * return type = ArrayList<Integer>;
	 * 
	 * serving bucket = list;
	 * 
	 */

	public static ArrayList<Integer> getEvenNumber(int number) {
		ArrayList<Integer> evenNumber = new ArrayList<Integer>();

		for (int i = 0; i < number; i++) {

			if (i % 2 == 0) {
				evenNumber.add(i);
			}
		}

		return evenNumber;
	}

	/*
	 * 
	 * Q5= write a method a number input and return the list of all odd number
	 * from 0 to that given number;
	 * 
	 * input = int number;
	 * 
	 * return type = ArrayList<Integer>;
	 * 
	 * serving bucket =list;
	 */
	public static ArrayList<Integer> getOoddNumber(int number) {
		ArrayList<Integer> ooddNumber = new ArrayList<Integer>();

		for (int i = 0; i <= number; i++) {

			if (i % 2 == 1) {

				ooddNumber.add(i);
			}

		}

		return ooddNumber;
	}

	/*
	 * 
	 * Q6 = write a method that take input as mile and return as a kilometer;
	 * 
	 * input = int number;
	 * 
	 * return = int;
	 * 
	 * serving = variable;
	 */

	public static int getMile(int number) {
		int mile = 0;
		mile = 106 * number;
		return mile;

	}

	/**
	 * 
	 * Q7 = write a method that take one string input and return a list of all
	 * index;
	 * 
	 * input = String input ;
	 * 
	 * return type = ArrayList<Integer>;
	 * 
	 * serving bucket = list;
	 * 
	 */
	public static ArrayList<Integer> getIndex(String name) {

		ArrayList<Integer> index = new ArrayList<Integer>();

		for (int i = 0; i < name.length(); i++) {

			index.add(i);

		}

		return index;
	}

	/*
	 * 
	 * Q8 = write a method that take one string and return list of all
	 * character;
	 * 
	 * input = String name;
	 * 
	 * return type = ArrayList<Character>;
	 * 
	 * serving bucket = list;
	 * 
	 */
	public static ArrayList<Character> getIndexOfNAME(String name) {
		ArrayList<Character> indexOfName = new ArrayList<Character>();

		for (int i = 0; i < name.length(); i++) {
			indexOfName.add(name.charAt(i));

		}

		return indexOfName;
	}

	/*
	 * 
	 * Q9 = write a method take one number input and return the sum of 1 to that
	 * given number;
	 * 
	 * input = int number;
	 * 
	 * return type = int ;
	 * 
	 * serving bucket = variable;
	 * 
	 */
	public static int getSum(int number) {
		int sum = 0;

		for (int i = 1; i <= number; i++) {
			sum = sum + i;
		}

		return sum;
	}

	/*
	 * 
	 * Q10 = write a method that take one number and return square of the that
	 * number;
	 * 
	 * input = int number;
	 * 
	 * return type = int;
	 * 
	 * serving bucket = variable;
	 * 
	 */
	public static int getSquare(int number) {
		int square = 0;
		square = number * number;
		return square;
	}

	/*
	 * 
	 * Q11 = write a method that take one number input and return an array that
	 * contain 0 to given number;
	 * 
	 * input = int number;
	 * 
	 * return type = int[] ;
	 * 
	 * serving bucket = Array;
	 * 
	 */
	public static int[] getArrayList(int number) {
		int[] arrayList = new int[number + 1];
		for (int i = 0; i <= number; i++) {
			arrayList[i] = i;
		}

		return arrayList;
	}

	/*
	 * 
	 * Q12 = write a method take one number input and return an array that
	 * contain 1 to that given number;
	 * 
	 * input = int number;
	 * 
	 * return type = int [];
	 * 
	 * serving bucket = Array;
	 * 
	 */
	public static int[] getArrayListTwo(int number) {
		int[] arrayListTwo = new int[number];

		for (int i = 1; i <= number; i++) {

			arrayListTwo[i - 1] = i;
		}

		return arrayListTwo;
	}

	/*
	 * 
	 * Q13 = write a method that take one number input and return number list 0
	 * to given number;
	 * 
	 * input = int number;
	 * 
	 * return type = ArrayList<Integer>;
	 * 
	 * servingbucket = list;
	 * 
	 */
	public static ArrayList<Integer> getList(int number) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i <= number; i++) {

			list.add(i);
		}

		return list;
	}

	/*
	 * 
	 * Q14 = write a method that take one number input and return a number
	 * "fizz" if
	 * 
	 * the given number divided by 5 and return "buzz" if the given number
	 * divided
	 * 
	 * by 5&&3 otherwise return "fizzbuzz";
	 * 
	 * input = int number;
	 * 
	 * return type = String;
	 * 
	 * serving bucket = variable;
	 * 
	 */

	public static String getFizzBuzz(int number) {

		String text = " ";

		if (number % 5 == 0 && number % 3 == 0) {

			text = "buz";
		} else if (number % 3 == 0) {
			text = "fizz";
		} else {
			text = "fizbuzz";
		}

		return text;
	}

	/*
	 * 
	 * Q15 = write a method that take one number array input and return the
	 * minimum number ;
	 * 
	 * input = int[] numberlist;
	 * 
	 * return type = int;
	 * 
	 * serving bucket = variable;
	 * 
	 */
	public static int getArrayNumber(int[] numberArray) {
		int arrayNumber = numberArray[0];

		for (int i = 0; i < numberArray.length; i++) {

			if (arrayNumber > numberArray[i]) {
				arrayNumber = numberArray[i];
			}
		}

		return arrayNumber;
	}

	/*
	 * 
	 * Q16 = write a method that take one number array and return the maximum
	 * number;
	 * 
	 * input = int[] numlist;
	 * 
	 * return type = int;
	 * 
	 * serving bucket = variable;
	 * 
	 */
	public static int getArrayMaximum(int[] numberMax) {
		int arrayMaximum = numberMax[0];

		for (int i = 0; i < numberMax.length; i++) {

			if (arrayMaximum < numberMax[i]) {

				arrayMaximum = numberMax[i];
			}
		}

		return arrayMaximum;
	}

	/*
	 * 
	 * Q17 = write a method that take a number input and return the same value
	 * as string;
	 * 
	 * input = int number;
	 * 
	 * return type = String;
	 * 
	 * serving bucket = variable;
	 * 
	 */
	public static String getValue(int number) {
		String value = " ";

		value = String.valueOf(number);

		return value;
	}

	/*
	 * 
	 * Q18 = write a method that take a string representation of number input
	 * and return the same value as a int;
	 * 
	 * input = String name;
	 * 
	 * return type = int ;
	 * 
	 * serving bucket = variable;
	 * 
	 */
	public static int getValueOfINT(String name) {
		int value = 0;

		value = Integer.valueOf(name);

		return value;
	}

	/*
	 * 
	 * Q19 = write a method take string input and return true if it contain char
	 * 'o'
	 * 
	 * otherwise false;
	 * 
	 * input = String name;
	 * 
	 * return type = boolean;
	 * 
	 * serving bucket = variable;
	 * 
	 */
	public static boolean getTextofTrue(String name) {
		boolean text = true;

		if (name.contains("o")) {

			text = true;
		} else {
			text = false;
		}

		return text;
	}

	/*
	 * 
	 * Q20 = write a method that take one string input and return the sum of all
	 * 
	 * index;
	 * 
	 * input = String name;
	 * 
	 * return type = int;
	 * 
	 * serving bucket = variable;
	 * 
	 */

	public static int getSumOfIndex(String name) {
		int sum = 0;

		for (int i = 0; i < name.length(); i++) {

			sum = sum + i;
		}

		return sum;
	}

	/*
	 * 
	 * Q21 = write a method that take one string and return a list of last five
	 * 
	 * character;
	 * 
	 * input = String name;
	 * 
	 * return type = ArrayList<Character>;
	 * 
	 * serving bucket = list;
	 * 
	 */
	public static ArrayList<Character> getFiveText(String name) {
		ArrayList<Character> text = new ArrayList<Character>();

		for (int i = name.length() - 5; i < name.length(); i = i + 1) {

			text.add(name.charAt(i));

		}

		return text;
	}

	/*
	 * 
	 * Q22 = write a method that take one string and return a list of first five
	 * 
	 * character;
	 * 
	 * input = String name;
	 * 
	 * return type = ArrayList<Character>;
	 * 
	 * serving bucket = list;
	 * 
	 */

	// public static ArrayList<Character> getFirsFiveText(String name) {
	// ArrayList<Character> text = new ArrayList<Character>();
	//
	// for (int i = 0; i <= name.length() - 6; i++) {
	//
	// text.add(name.charAt(i));
	// }
	//
	// return text;
	// }
	public static String getFirstFive(String name) {
		String text = " ";

		text = name.substring(0, 5);

		return text;
	}

	/*
	 * 
	 * Q23 = write a method that take a string input and return 5 to 10
	 * character as a string;
	 * 
	 * input = String name;
	 * 
	 * return type = String;
	 * 
	 * serving bucket =variable;
	 * 
	 */
	public static String getName(String name) {
		String nameString = " ";

		nameString = name.substring(4, 10);

		return nameString;
	}

	/*
	 * 
	 * Q24 = write a method that take one String input and return all word;
	 * 
	 * input =String name;
	 * 
	 * return type = ArrayList<string> ;
	 * 
	 * serving bucket = list;
	 * 
	 */
	public static ArrayList<String> getWord(String name) {

		ArrayList<String> word = new ArrayList<String>();
		String wordArray[] = name.split(" ");
		for (int i = 0; i < wordArray.length; i++) {
			word.add(wordArray[i]);
		}

		return word;

	}

	/*
	 * 
	 * Q25 = write a method take one string input and return first word;
	 * 
	 * input = oneString name;
	 * 
	 * return type = String;
	 * 
	 * serving bucket = variable;
	 * 
	 */

	public static String getFirstWord(String name) {
		String text = null;

		String[] wordArray = name.split(" ");

		for (int i = 0; i < wordArray.length; i++) {

			text = wordArray[0];
		}

		return text;
	}
	/*
	 * 
	 * Q26 = write a method take one string and one word input and return the
	 * count of that given word;
	 * 
	 * input = String name ,
	 * 
	 * String word; return type = int ;
	 * 
	 * serving bucket = variable;
	 * 
	 */

	public static int getCountWord(String name, String word) {
		int count = 0;

		String[] wordAray = name.split(" ");

		for (int i = 0; i < wordAray.length; i++) {

			if (wordAray[i].equalsIgnoreCase(word)) {

				count = count + 1;
			}
		}
		return count;
	}

	/*
	 * 
	 * Q27 = write a method that take one string and one character input and
	 * return the count of given character;
	 * 
	 * input = String name ,
	 * 
	 * char num; return type = int ;
	 * 
	 * serving bucket = variable;
	 * 
	 */
	public static int getCountChar(String name, char nam) {
		int countChar = 0;

		name = name.toLowerCase();
		nam = Character.toLowerCase(nam);

		for (int i = 0; i < name.length(); i++) {

			if (name.charAt(i) == nam) {
				countChar = countChar + 1;
			}

		}

		return countChar;
	}

	/*
	 * 
	 * Q28 = write a method one string and one word input and return ture if
	 * that sentence contain given word otherwise false;
	 * 
	 * input = string name,
	 * 
	 * String word;
	 * 
	 * return type = boolean;
	 * 
	 * serving bucket = variable;
	 * 
	 */
	public static boolean getGivenWord(String name, String text) {
		boolean word = false;
		text = text.toLowerCase();
		String[] wordArray = name.split(" ");

		for (int i = 0; i < wordArray.length; i++) {
			if (wordArray[i].equalsIgnoreCase(text)) {

				word = true;
			}

		}

		return word;
	}

	/*
	 * 
	 * Q29 = write a method that take one string and return the count of all
	 * consonant;
	 * 
	 * input = string name;
	 * 
	 * return type = int;
	 * 
	 * serving bucket = variable;
	 * 
	 */

	public static int getConsonent(String name) {
		int count = 0;
		String consonent = "bcdfghjklmnpqrstvwxYZ";

		name.toLowerCase();
		for (int i = 0; i < name.length(); i++) {

			String character = String.valueOf(name.charAt(i));

			if (consonent.contains(character)) {

				count = count + 1;
			}
		}
		return count;
	}

	/*
	 * 
	 * Q30 = write a method that take one String input and return the count of
	 * all vowels;
	 * 
	 * input = String name;
	 * 
	 * return type = int;
	 * 
	 * serving bucket = variable;
	 * 
	 */

	public static int getVowel(String name) {
		int vowel = 0;

		String vowelOne = "aeiou";
		name.toLowerCase();

		for (int i = 0; i < name.length(); i++) {

			String character = String.valueOf(name.charAt(i));
			if (vowelOne.contains(character)) {
				vowel = vowel + 1;
			}

		}

		return vowel;
	}

	/*
	 * 
	 * Q31 = write a method that take one string input and return the count of
	 * all upper case character;
	 * 
	 * input = String name;
	 * 
	 * return type = int ;
	 * 
	 * serving bucket= variable;
	 * 
	 */
	public static int getCountOfuppertext(String name) {
		int text = 0;

		for (int i = 0; i < name.length(); i++) {

			Character character = Character.valueOf(name.charAt(i));
			if (Character.isUpperCase(character)) {
				text = text + 1;
			}
		}

		return text;
	}

	/*
	 * 
	 * Q32 = write a method that take one string and return count of character
	 * without whispace;
	 * 
	 * input = String name;
	 * 
	 * return type = int ;
	 * 
	 * serving bucket = variable;
	 * 
	 */

	public static int getSubject(String nameOne) {
		int count = 0;
		nameOne = nameOne.replaceAll(" ", "");
		nameOne.toLowerCase();
		count = nameOne.length();

		return count;
	}

	/*
	 * 
	 * Q33 = write a method that take one string input and return all repeated
	 * characters without whitespace
	 * 
	 * input = string name;
	 * 
	 * return type = String;
	 * 
	 * serving bucket = variable;
	 * 
	 */
	public static String getCharacterWithoutSpace(String name) {
		String text = " ";

		name = name.replaceAll(" ", "");

		name = name.toLowerCase();

		for (int i = 0; i < name.length(); i = i + 1) {

			for (int j = i + 1; j < name.length(); j++) {
				if (name.charAt(i) == name.charAt(j)) {

					String character = String.valueOf((name.charAt(i)));

					if (!text.contains(character)) {
						text = text + name.charAt(j);
					}
					break;
				}

			}
		}

		return text;
	}

	/**
	 * 
	 * Q34 = Write a method that take one string input and return all the unique
	 * characters without whitespace
	 * 
	 * input = String name;
	 * 
	 * return type = String;
	 * 
	 * serving bucket = variable;
	 * 
	 */
	public static String getUniqeText(String name) {
		String text = " ";

		name = name.replaceAll(" ", "");

		name = name.toLowerCase();

		text = name;

		for (int i = 0; i < name.length(); i++) {
			for (int j = i + 1; j < name.length(); j++) {
				String character = String.valueOf(name.charAt(i));
				if (name.charAt(i) == name.charAt(j)) {
					text = text.replaceAll(character, "");

				}
			}
		}
		return text;
	}

	/*
	 * 
	 * Q35 = write a method that take one int array and return sum of all value;
	 * 
	 * input = int [] numberArray;
	 * 
	 * return type = int;
	 * 
	 * serving bucket = variable;
	 * 
	 */
	public static int getNumberArray(int[] number) {
		int arrayNumber = 0;

		for (int i = 0; i < number.length; i++) {
			arrayNumber = arrayNumber + number[i];
		}

		return arrayNumber;
	}

	/*
	 * 
	 * Q36 = write a method that take one int List input and return sum of all
	 * value
	 * 
	 * input = ArrayList<Integer> numlist
	 * 
	 * return = int;
	 * 
	 * serving bucket = variable;
	 * 
	 */
	public static int getSumOFList(ArrayList<Integer> numberList) {
		int sumOfList = 0;

		for (int i = 0; i < numberList.size(); i++) {
			sumOfList = sumOfList + numberList.get(i);
		}

		return sumOfList;
	}

	/*
	 * 
	 * Q37 = write method that take one string input and return same string in
	 * reverse order'
	 * 
	 * input = string name;
	 * 
	 * return type = String;
	 * 
	 * serving bucket = variable
	 * 
	 */
	public static String getReverseValue(String name) {
		String value = " ";

		for (int i = name.length() - 1; i >= 0; i--) {
			value = value + (name.charAt(i));
		}

		return value;
	}

	/*
	 * 
	 * Q38 = write a method take one int list input then convert that to an
	 * array and return that array;
	 * 
	 * input = ArrayList<Integer> number
	 * 
	 * return type = list
	 * 
	 * serving bucket = object list
	 * 
	 */
	public static Object[] getConvertArray(ArrayList<Integer> numListOne) {
		Object[] array = new Object[numListOne.size()];
		array = numListOne.toArray();
		return array;
	}

	/*
	 * 
	 * Q39 = write a method that take a int array input then convert that to a
	 * list and return list;
	 * 
	 * input = int[] numberTwo
	 * 
	 * return type = list;
	 * 
	 * serving bucket = list;
	 * 
	 */
	public static ArrayList<Integer> getConvertList(int[] numArray) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < numArray.length; i++) {
			list.add(numArray[i]);
		}

		return list;
	}

	/*
	 * 
	 * Q40 = write a method take one number array input and return the sorted
	 * array;
	 * 
	 * input = int[] numberThird;
	 * 
	 * return = int[];
	 * 
	 * serving bucket = array;
	 * 
	 */
	public static int[] getSortedArray(int[] numTwo) {
		int[] sortArray = new int[numTwo.length];

		Arrays.sort(numTwo);

		sortArray = numTwo;
		return sortArray;
	}

	/*
	 * 
	 * Q41 = write a method that take one number list input and return the
	 * sorted list;
	 * 
	 * input = ArrayList<Integer> numberFour;
	 * 
	 * return type = list;
	 * 
	 * serving bucket = list;
	 * 
	 */

	/*
	 * 
	 * Q42 = write a method that take a int [] input and return the bubble
	 * sorted array;
	 * 
	 * input = int[] numberArray;
	 * 
	 * return type = int[];
	 * 
	 * serving bucket = Array;
	 * 
	 */

	/*
	 * 
	 * Q43 = write a method that take one string inout which contain (a) number
	 * and return that as a int;
	 * 
	 * input = String name;
	 * 
	 * return type = int;
	 * 
	 * serving bucket = variable;
	 * 
	 */

	/*
	 * 
	 * Q44 = write a method that take one string input Which contain some
	 * numnbers then collect all of those numbers and rerurn in a list;
	 * 
	 * input = string name;
	 * 
	 * return type = ArrayList<Integer> ;
	 * 
	 * serving bucket = list;
	 * 
	 */

	/*
	 * 
	 * Q45 = write a method that take one string input which contain an email
	 * adress then collect and return that email;
	 * 
	 * input = String text;
	 * 
	 * returntype = email;
	 * 
	 * serving bucket = variable;
	 * 
	 */

	/**
	 * 
	 * Q46 = write a method that take string input and return alternative
	 * character as a string ;
	 * 
	 * input = String name.
	 * 
	 * return type = String.
	 * 
	 * serving bucket = variable;
	 * 
	 */

	/*
	 * 
	 * Q47 = write a method that take one string input and return the same
	 * String by making upperCase of all alternative character and rest of the
	 * character lower case;
	 * 
	 * input = String name;
	 * 
	 * return type = String ;
	 * 
	 * serving bucket = variable;
	 * 
	 */

}
