package data;

import java.util.Scanner;

public class ImprovedFibonacci {
	public static void main(String[] args) {
		while(true){
		Scanner in = new Scanner(System.in);
		System.out.println("«Î ‰»Î ˝Œª£∫ ");
		int index = in.nextInt();
		System.out.println("the result is:"+fib(index));
		}
	}
	private static long fib(int index) {
		long f0 = 0;
		long f1 = 1;
		long f2 = 1;
		if(index==0) return f0;
		if(index==1) return f1;
		if(index==2) return f2;
		
		for(int i=3;i<=index;i++){
			f0=f1;
			f1=f2;
			f2=f0+f1;
		}
		return f2;
	}
}
