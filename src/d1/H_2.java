package d1;

import java.util.Scanner;

public class H_2 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		
		System.out.println("��������Ʒ1������:");
		String name1 = sc.next();
		System.out.println("��������Ʒ1�ĵ���:");
		float price1 = sc.nextFloat();
		System.out.println("��������Ʒ1������:");
		int num1 = sc.nextInt();
	    float pay1 = price1*num1;
		
		System.out.println("��������Ʒ2������:");
		String name2 = sc.next();
		System.out.println("��������Ʒ2�ĵ���:");
		float price2 = sc.nextFloat();
		System.out.println("��������Ʒ2������:");
		int num2 = sc.nextInt();
		float pay2 = price2*num2;
		
		System.out.println("������֧�����:");
		int money = sc.nextInt();
		System.out.println("�������ۿ�:");
		float  discount= sc.nextFloat();
		discount/=10.0;
		
		
		
		System.out.println("***************�����嵥***************");
		System.out.println("��Ʒ����  \t ���� \t ���� \t С��");
		
		System.out.println(name1+  "\t"+ " " + price1 + "\t" + num1 + "\t" + pay1);
		System.out.println(name2+  "\t"+ " " + price2 + "\t" + num2 + "\t" + pay2);
		System.out.println("�ۿ�:" + discount);
		System.out.println("ԭ�ܼ�:" + (pay1+pay2));
		System.out.println("ʵ�ʸ���:" + (pay1+pay2)*discount);
		System.out.println("����:" + money);
		System.out.println("��Ǯ:" + (money-(pay1+pay2)*discount));
		

	}

}
