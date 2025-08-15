import java.util.Scanner;


public class DAY2 {

	public static void main(String[] args) {
//		reverseString("java goed jjjj");
		
		String ans = reverse("java");
		System.out.println(ans);
		
		
		reverseAWord("ISHIKA");
		
		String result = reverseWholeString("Hello I am Ishika");
		System.out.println(result);
	}
    
	
	
	
	
    
    static String reverse(String input) {
    	String g="";
    	System.out.println("DAY2.reverse()");
    	for(int i=0;i<input.length();i++) {
    		char ch=input.charAt(i);
    		g=ch+g;
    	}
//    	System.out.println(g);
    	return g;
    	
    }
    
    public static String reverseAWord(String input) {
    	
    	char[] charArray = input.toCharArray();
    	
    	 int sp=0;
    	 int ep =input.length()-1;
    	 
    	 while(sp <=ep) {
    		 
    		 //swap
    		 char temp = charArray[sp];
    		 charArray[sp] =charArray[ep];
    		 charArray[ep]=temp;
    		 
    		 sp++;
    		 ep--;
    		 
    	 }
    	 
    	
    	String sb = new String(charArray);
     return sb;
    	 
    	
    	
    }
    
    public static String reverseWholeString(String str) {
    	
    	String[] strArr = str.split(" ");
    	StringBuilder sb = new StringBuilder(); //outut
    	
    	for (int i = 0; i < strArr.length; i++) {
    		String rs = reverseAWord(strArr[i]);
    		sb.append(rs).append(" ");
			
		}
    	System.out.println(sb.toString());
    	
    	return sb.toString().trim();
    	
    }
    


}

	



