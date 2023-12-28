package com.siva;

public class IntToChar {

	public static void main(String[] args) {
		String s="a2B3c4d2e5";
		for(int i=0;i<s.length();i=i+2)
		{
			char c1=s.charAt(i);
			char c2=s.charAt(i+1);
			int n=(char)(c2-48);
			for(int j=1;j<=n;j++)
			{
				System.out.print(c1);
			}
		}
	}

	
}
