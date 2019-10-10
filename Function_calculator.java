package com.basic;
import java.util.Scanner;

public class Function_calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int res = Function_calculator.add(num1, num2);
		System.out.println(res);

		res = Function_calculator.mul(num1, num2);
		System.out.println(res);

		res = Function_calculator.sub(num1, num2);
		System.out.println(res);

		res = Function_calculator.div(num1, num2);
		System.out.println(res);

		res = Function_calculator.mod(num1, num2);
		System.out.println(res);

		sc.close();

	}

	public static int add(int num1, int num2) {
		return num1 + num2;
	}

	public static int sub(int num1, int num2) {
		return num1 - num2;
	}

	public static int mul(int num1, int num2) {
		return num1 * num2;
	}

	public static int div(int num1, int num2) {
		return num1 / num2;
	}

	public static int mod(int num1, int num2) {
		return num1 % num2;
	}

}
