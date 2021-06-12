package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean action = true;

		while (action) {
			System.out.print(">> ");
			String cal = sc.nextLine();

			if (cal.equals("/q")) {
				action = false;
				System.out.println("종료합니다.");
			} else {
				try {
					String[] sArray = cal.split(" ");

					int a = Integer.parseInt(sArray[0]);
					int b = Integer.parseInt(sArray[2]);

					if (sArray[1].equals("+")) {
						Add a01 = new Add();
						a01.setValue(a, b);
						System.out.println(a01.calculate());

					} else if (sArray[1].equals("-")) {
						Sub s01 = new Sub();
						s01.setValue(a, b);
						System.out.println(s01.calculate());

					} else if (sArray[1].equals("/")) {
						Div d01 = new Div();
						d01.setValue(a, b);
						System.out.println(d01.calculate());

					} else if (sArray[1].equals("*")) {
						Mul m01 = new Mul();
						m01.setValue(a, b);
						System.out.println(m01.calculate());

					} else {
						System.out.println("알 수 없는 연산입니다.");
					}

				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("알 수 없는 연산입니다.");
				} catch (ArithmeticException e) {
					System.out.println("알 수 없는 연산입니다.");
				} catch (NumberFormatException e) {
					System.out.println("알 수 없는 연산입니다.");
				}
			}

		}

		sc.close();
	}
}
