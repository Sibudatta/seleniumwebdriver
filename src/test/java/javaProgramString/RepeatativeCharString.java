package javaProgramString;

public class RepeatativeCharString {

	public static void main(String[] args) {


		String string="od boy sibudattaaaaaaaaa hrm";


		char str[]=string.toCharArray();
		

		for (int i=0 ;i<str.length;i++) {
			int count=1; 

			for(int j=i+1 ; j<str.length;j++) {

				if(str[i]==str[j] && str[i]!=' ') {

					count++;
					str[j]='0';
				}}
			if (count>1  && str[i]!='0') {

				System.out.println(str[i] + " : repeated count is :" + count);

			}
		}
	}
}






