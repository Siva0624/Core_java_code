package com.sathya;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
      
		int n =7;
		for(int i=1;i<=n; i++) {
			for(int j =1;j<=n; j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=(n-1)+i;k++) {
				if(i==n|| k==(n-1)+i || k==(n+1)-i )   {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
  ///
		
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of rows: ");

        int rows = sc.nextInt();
         
        for (int i=1; i<= rows ; i++)
        {
            for (int j = i; j < rows ; j++) {
                System.out.print(" ");
            }   
            for (int k = 1; k <= (2*i -1) ;k++) {
                if( k==1 || i == rows || k==(2*i-1)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        sc.close();


		
	}

}


