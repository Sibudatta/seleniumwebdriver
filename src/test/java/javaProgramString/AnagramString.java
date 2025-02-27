package javaProgramString;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String str1="ABC";
		String str2="BCAas";

		str1=str1.toLowerCase();
		str2=str2.toLowerCase();

		if(str1.length()!=str2.length()) {

			System.out.println("it is not an anagram");

		}
		else {
			char[] string1 =str1.toCharArray();
			char[]  string2 =str2.toCharArray();

			Arrays.sort(string1);
			Arrays.sort(string2);

			if(Arrays.equals(string1, string2)==true) {

				System.out.println("it is a anagram");
			}
			else {
				System.out.println("it is not a anagram");
			}
		}

	}}
