package com.siva;

public class Permutations {
	
	public static void main(String[] args) {
		 String s = "abc";
	        permute(s.toCharArray(), 0, s.length() - 1);
	    }

	    static void permute(char[] str, int l, int r) {
	        if (l == r) {
	            System.out.println(String.valueOf(str));
	        } else {
	            for (int i = l; i <= r; i++) {
	                swap(str, l, i);
	                permute(str, l + 1, r);
	                swap(str, l, i);
	            }
	        }
	    }

	    static void swap(char[] str, int i, int j) {
	        char temp = str[i];
	        str[i] = str[j];
	        str[j] = temp;
	}


}
