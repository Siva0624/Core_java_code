package com.siva;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class StringBul {

	public static void main(String[] args) {
		
// Convert Int to String 		
int a= 10;
//String s = String.valueOf(a);
String s3 = Integer.toString(a);
System.out.println(s3);

// Convert char to String
char b='k';
char c = 'r';
String ss = String.valueOf(c);
System.out.println(ss);


// String Builder examples
		StringBuilder sb = new StringBuilder(); // create StringBuilder
		System.out.println(sb);
		sb.append("welcome siva");  // By using append added to the value in StringBuilder Variable
	//	sb.append("to java g ");
		sb.append(c);
		System.out.println(sb);
		System.out.println(sb.capacity());  //To check default value;
		System.out.println(sb.charAt(2));  // To Print Character 
		System.out.println(sb.insert(4, "bye")); // insert the value at a specific position
		System.out.println(sb.delete(4,7));  // delete 4 to 7 index have elements 
		System.out.println(sb.deleteCharAt(0)); // delete index based
		System.out.println(sb.reverse());
	
		StringBuilder sb1 = new StringBuilder("Welcome to java Work ");
		System.out.println(sb1.capacity());
		sb1.trimToSize();  // it is remove the default value (16)
		System.out.println(sb1.capacity());
		
	 // 	String Tokenizer 
		StringTokenizer st = new StringTokenizer("welcome to javafull stack programm ");
		System.out.println(st.countTokens()); // it will count the how many words are present in there sentence
		while(st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
		
        	// String Joiner 
		StringJoiner sj = new StringJoiner("","","");
		 sj.add("sachin");
		 sj.add("rahul");
		 sj.add("kapil");
		 sj.add("dhoni");
		 sj.add("kohil");
		 sj.add("virat");
		 System.out.println(sj);
		 StringJoiner sj1 = new StringJoiner("");
		 sj1.add("rohit");
		 sj1.add("sewag");
		    System.out.println(sj.merge(sj1));
		
		
	}

}
