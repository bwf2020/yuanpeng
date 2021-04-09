package d1;

import java.util.Scanner;

public class H_1 {

	public static void main(String[] args) {
		int[] arry= {1,9,11,18,22,25};
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要找的数");
		int num = sc.nextInt();
		System.out.println("");
		
		int j=binarySearch(arry,num);
		
		if(j == -1) {
			System.out.println("找不到");
		}else {
			System.out.println("找到了,位置:" + j);
		}
		
		
	}
		public static int binarySearch(int[] arry,int num) {
			
			int start=0;
			int end=arry.length-1;
			
			while(end>=start)
			{
				int mid=(start+end)/2;
				if(num<arry[mid])
				{
					end=mid-1;
				}
				else if(num==arry[mid])
				{
					return mid;
				}
				else
				{
					start=mid+1;
				}
			}

			return -1;
			
		}

}
