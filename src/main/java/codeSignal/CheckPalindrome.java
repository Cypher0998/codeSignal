package codeSignal;

public class CheckPalindrome {
    private static boolean checkPalindrome(String inputString) {
    	int i=0;
    	int j=inputString.length()-1;
    	boolean esIgual=true;    
    	    while (i<j && esIgual){
    	        if(inputString.charAt(i)==inputString.charAt(j)){
    	            i++;
    	            j--;
    	             esIgual=true;
    	        }else{
    	             esIgual=false;
    	        }
    	    }    
    	    return esIgual;
    	}

	public static void main(String[] args) {
    System.out.println(checkPalindrome("aabaa"));
	}

}
