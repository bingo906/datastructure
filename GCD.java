package data;

import java.util.Scanner;

public class GCD {
	public static int gcd(int m,int n){
		int gcd =1;
		if(m%n==0){
			return n;
		} 
		for(int k=n/2;k>=1;k--){
			if(m%k==0 && n%k==0){
				gcd = k;
				break;
			}
		}
		return gcd;
	}
	
	public static void main(String[] args) {
		while(true){
			Scanner input = new Scanner(System.in);
			System.out.println("输入第一个整数：");
			int m = input.nextInt();
			System.out.println("输入第二个整数：");
			int n = input.nextInt();
			System.out.println("最大公约数为："+gcd(m, n));
			
		}
		
	}
}
