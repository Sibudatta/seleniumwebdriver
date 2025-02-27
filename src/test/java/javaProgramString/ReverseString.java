package javaProgramString;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string="sibudatta";
		     
		      
		    String  reverse=" ";
		      
		      for(int i=string.length()-1 ;i>=0;i--) {
		    	  
		    	  reverse=reverse+ string.charAt(i);
		    	  
		    	  
		      }
		      System.out.println(reverse);

	}

}
