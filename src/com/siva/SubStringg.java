package com.siva;

public class SubStringg {
	
	public static void main(String[] args) {
		int arr[] = {2,3,4,5,6,5,4,3,2,3};
		int k = 15;
		findSubsequenceswithSum(arr, k);	
	}
		static void findSubsequenceswithSum(int[] arr, int k) {
		int n=arr.length;
		int maxSubsequences= (int) Math.pow(2, n);
		for (int i=1; i < maxSubsequences; i++) {
				
		int currentSum =0;

		StringBuilder subsequence= new StringBuilder();

		for (int j=0; j<n; j++) {

		if (((i/ (int) Math.pow(2, j))% 2)==1) {

		subsequence.append(arr[j]).append(" "); 
		currentSum+=arr[j];
		}
		}
		if (currentSum==k) {

		System.out.println("Subsequence with sum "+k+": "+ subsequence.toString());
		}
		}
		}

}
