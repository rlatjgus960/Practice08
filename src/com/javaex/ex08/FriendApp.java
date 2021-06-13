package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean action = true;
		
		while(action) {
			System.out.println("친구를 3명 등록해 주세요");
			String friend1 = sc.nextLine();
			String friend2 = sc.nextLine();
			String friend3 = sc.nextLine();
			
			try {
				
				Friend f01 = new Friend(friend1);
				Friend f02 = new Friend(friend2);
				Friend f03 = new Friend(friend3);
				action = false;
				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
			
			
		
		
		
		
		
		

		sc.close();

	}

}
