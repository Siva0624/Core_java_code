package com.siva;

public class Repeating {

	public static void main(String[] args) {
         String str = " Madam arora teaches malayalam and i teaches like malayalam";
         
         String  s[] = str.split(" ");
         System.out.println(str);
         String s1="";
         String longest = "";
         int maxcount=0, count=0;
         
         
         for(int i=0; i<s.length;i++) {
        //	 System.out.println(s[i]);
        	 s1=s[i];
        	  count=0;
        	 for(int j=0;j<s1.length();j++) {
        		 count++;
        		// System.out.println(count++);     		 
        	 }
        	 if(count>maxcount) {
        		 maxcount = count;
        	//	 System.out.println(maxcount);
        		 longest = s[i];
        	 }
         }
        // System.out.println(count);
         count=0;
        //	 System.out.println(longest);
		for(int i =0; i<s.length; i++) {
			if(s[i] == longest) {
				count++;
				System.out.println(count);
			}
		}
		if(count>=2) {
			System.out.println(longest+" ");
		}
		
	}

}
