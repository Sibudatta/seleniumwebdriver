package javaProgramString;

public class CountNumberofChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Sibudatta";
		int count=0;


		for(int i=0;i<name.length();i++) {


			if(name.charAt(i)!= ' ')

				count++;


		}
		System.out.println(count);

	}}
