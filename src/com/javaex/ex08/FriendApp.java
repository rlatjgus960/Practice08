package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("친구를 3명 등록해 주세요");
		String friend1 = sc.nextLine();
		String friend2 = sc.nextLine();
		String friend3 = sc.nextLine();

		String sArray1[] = friend1.split(" ");
		String sArray2[] = friend2.split(" ");
		String sArray3[] = friend3.split(" ");

		System.out.println("이름:" + sArray1[0] + " 핸드폰:" + sArray1[1] + " 학교:" + sArray1[2]);
		System.out.println("이름:" + sArray2[0] + " 핸드폰:" + sArray2[1] + " 학교:" + sArray2[2]);
		System.out.println("이름:" + sArray3[0] + " 핸드폰:" + sArray3[1] + " 학교:" + sArray3[2]);

		sc.close();

	}

}
