package com.siva;

public class ReplaceValues {

	public static void main(String[] args) {
		 String s = "yahoo!mail spamguard helps keep junk email out of your life";
	        String pattern = "mail";
	        String replacement = "xyz";
	        
	        char[] arr1 = s.toCharArray();
	        char[] arr2 = new char[arr1.length * 2]; // Assuming the output won't be longer than twice the input

	        int index = 0;
	        for (int i = 0; i < arr1.length; i++) {
	            if (i <= arr1.length - pattern.length()) {
	                String substring = new String(arr1, i, pattern.length());
	                if (substring.equals(pattern)) {
	                    for (char replacementChar : replacement.toCharArray()) {
	                    	arr2[index++] = replacementChar;
	                    }
	                    i += pattern.length() - 1; // skip the characters replaced
	                    continue;
	                }
	            }
	            arr2[index++] = arr1[i];
	        }

	        String output = new String(arr2, 0, index);
	        System.out.println("Output: " + output);
	}


	
}
