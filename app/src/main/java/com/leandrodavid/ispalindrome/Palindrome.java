package com.leandrodavid.ispalindrome;

public class Palindrome {
	public static boolean isPalindromo(String word){
		if(word==null){
			throw new NullPointerException();
		}
		if(word.length()==0){
			return false;
		}
		int start = 0;  
		int end = word.length() - 1;  
		while(start < end ) {   
	      if(word.charAt(start) != word.charAt(end)){  
	        return false;
	      }
	      start++;  
	      end--;  
		}   
		return true;
	}
}
