
public class DAY {

	public static void main(String[] args) {
		String rev=reverseAWord("ISHIKA");
		System.out.println(rev);
	}
	
	
	
	 public static String reverseAWord(String input) {
	    	
	    	char[] charArray = input.toCharArray();
	    	
	    	int ep =input.length()-1;
			/*
			 * int sp=0; 
			 * int ep =input.length()-1;
			 * 
			 * while(sp <=ep) {
			 * 
			 * //swap char temp = charArray[sp]; charArray[sp] =charArray[ep];
			 * charArray[ep]=temp;
			 * 
			 * sp++; ep--;
			 * 
			 * }
			 */
	    	
	    	for (int i = 0; i < charArray.length/2; i++) {
	    		
				 //swap 
				 char temp = charArray[i];
				 charArray[i] =charArray[ep-i];
				 charArray[ep-i]=temp;
				
			}
	    	 
			
	    	 return  new String(charArray)
					;
		
	 }

}
