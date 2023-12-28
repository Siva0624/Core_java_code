package com.siva;

public class OccurenceCount {
	
	public static void main(String[] args) {
		String s="aaabbbbAAAccdddd$$$$";
		int[] arr=new int[256];
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			int x=ch;
			arr[x]++;
		}
		for(int i=0;i<256;i++)
		{
			if(arr[i]!=0)
			{
				System.out.println((char)i+":"+arr[i]);
			}
		}
	}


}
