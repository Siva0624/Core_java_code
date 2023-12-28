package com.siva;

public class MaxLengthReapting {
	
	
	public static void main(String[] args) {
		String input = "madam arora teachesess Malayalam and teachesess I like Malayalam language ";
        String[] words = input.split("\\s+"); // Split the input into words
        String longestRepeatingWord = "";
        int maxLength = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j]) && words[i].length() > maxLength)
                {
                    // Found a repeating word with a longer length
                    maxLength = words[i].length();
                    longestRepeatingWord = words[i];
                }
            }
        }
System.out.println(" longest reapting word... "+ longestRepeatingWord );
	}

}
