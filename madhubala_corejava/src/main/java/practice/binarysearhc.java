package practice;

import java.util.Scanner;

public class binarysearhc {

	
	
	
	public static void main(String[] args) {
		
		
//		int x=12;
//		int[] a= {1,2,4,9,10,21,25,100};
//		int s=0,e=9;
//		for(;s<=e;) {
//			
//		
//		int m=(s+e)/2;
//		if(a[m]==x) {
//			
//			System.out.println("Found");
//			return;
//		}
//		else if(a[m]>x) {
//		e=m-1;
//
//		}else {
//			s=m+1;
//		}
//			
//		}
//		System.out.println("Not Found");
		
		
		
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println(";lkjhgf");
		
		int m=scan.nextInt();

		System.out.println("lkjhgf");
		
		int n=scan.nextInt();
		
		
		
		
		int [][]ar=new int[m][n];
		
		int [][]ar2=new int[m][n];
		
		
		
		for(int i=0;i<m;i++) {
			
			for(int j=0;j<n;j++) {
				ar[i][j]=scan.nextInt();
				
				ar2[i][j]=scan.nextInt();
			}
			

			
		}
		
		
		
for(int i=0;i<m;i++) {
			
			for(int j=0;j<n;j++) {
			
				
				System.out.print(ar[i][j]+" ");
				
				System.out.print(ar2[i][j]+" ");
	
				
			}
			System.out.println();
		}

		
		
for(int i=0;i<m;i++) {
	
	for(int j=0;j<n;j++) {
int ans[][]=new int[n][m];

 ans[i][j]=ar[i][j]+ar2[i][j];
		
		System.out.print(ans[i][j]+" ");
		

		
	}
System.out.println();
}
		
		
		
		
		
	}
	
	
	
}























import java.util.Scanner;

class Main {
	public static void main(String args[]) {

		Scanner num = new Scanner(System.in);
		int n = num.nextInt();
		int m = num.nextInt();
		int[][] arr = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = num.nextInt();
			}
		}

		int sum;
		int col;
	int max=0;
	
	int[][] res=new int[n][m];
	
		for (int i = 0; i < n; i++) {

			sum = 0;
			col = 0;
			for (int j = 0; j < m; j++) {

				sum += arr[i][j];
				
				res[i][j]=sum;

				col += arr[j][i];
				res[j][i]=sum;
				

			}
			System.out.print(sum + " ");

			System.out.print(col + " ");
			
		
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				
				System.out.println(res[i][j]);
				
			}
	
			
		}
		
		
		

	}
}