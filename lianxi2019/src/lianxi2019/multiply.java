package lianxi2019;

import java.util.Scanner;

public class multiply {

	public static void main(String[] args) {
		double a;
		double b;
		double result;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一位数：");
		a = sc.nextDouble();
		System.out.println("请输入第二位数：");
		b = sc.nextInt();
		result = a / b;
		System.out.println(result);
	}

}
