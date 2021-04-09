package d1;

import java.util.Scanner;

public class H_2 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		
		System.out.println("请输入商品1的名称:");
		String name1 = sc.next();
		System.out.println("请输入商品1的单价:");
		float price1 = sc.nextFloat();
		System.out.println("请输入商品1的数量:");
		int num1 = sc.nextInt();
	    float pay1 = price1*num1;
		
		System.out.println("请输入商品2的名称:");
		String name2 = sc.next();
		System.out.println("请输入商品2的单价:");
		float price2 = sc.nextFloat();
		System.out.println("请输入商品2的数量:");
		int num2 = sc.nextInt();
		float pay2 = price2*num2;
		
		System.out.println("请输入支付金额:");
		int money = sc.nextInt();
		System.out.println("请输入折扣:");
		float  discount= sc.nextFloat();
		discount/=10.0;
		
		
		
		System.out.println("***************消费清单***************");
		System.out.println("物品名称  \t 单价 \t 个数 \t 小计");
		
		System.out.println(name1+  "\t"+ " " + price1 + "\t" + num1 + "\t" + pay1);
		System.out.println(name2+  "\t"+ " " + price2 + "\t" + num2 + "\t" + pay2);
		System.out.println("折扣:" + discount);
		System.out.println("原总价:" + (pay1+pay2));
		System.out.println("实际付款:" + (pay1+pay2)*discount);
		System.out.println("付款:" + money);
		System.out.println("找钱:" + (money-(pay1+pay2)*discount));
		

	}

}
