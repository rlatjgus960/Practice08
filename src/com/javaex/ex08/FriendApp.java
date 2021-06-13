
package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Friend[] fArray = new Friend[3];

		System.out.println("친구를 3명 등록해 주세요");

		boolean action = true;
		while (action) {

			try {
				for (int i = 0; i < fArray.length; i++) {
					String info = sc.nextLine();
					String[] iArray = info.split(" ");

					Friend f = new Friend();
					f.setName(iArray[0]);
					f.setHp(iArray[1]);
					f.setSchool(iArray[2]);
					fArray[i] = f;

				}
				for (int i = 0; i < fArray.length; i++) {
					fArray[i].showInfo();
				}
				action = false;

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("다시 입력해주세요.");
			}
		}

		sc.close();

	}

}
