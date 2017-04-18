package com.bingo;

public class InsertSortDemo {
	public static void main(String[] args) {
		int[] a={4,5,1,3,6,9,2};
		InsertSort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}

	private static void InsertSort(int[] a) {
		for(int i=1;i<a.length;i++){
			//设置temp为要插入的数
			int temp = a[i];
			//准备将该数与前一数字比较
			int index = i-1;
			while(index>=0 && temp<=a[index]){
				//将把arr[index]向后移动一位
				a[index+1] = a[index];
				//index向前移动一位
				index--;
			}
			a[index+1] = temp;
		}
		
	}
}
