package lianxi2019;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入第一个加数");
		a=new Integer(scanner.nextLine());
		System.out.println("请输入第二3个加数");
		b=new Integer(scanner.nextLine());
		int c=a+b;
		System.out.println("a+b="+c);
	}

}
