package com.javaex.ex08;

public class Friend {

	private String friend;

	public Friend() {
		super();
	}

	public Friend(String friend) {
		
		String sArray[] = friend.split(" ");
		System.out.println("이름:" + sArray[0] + " 핸드폰:" + sArray[1] + " 학교:" + sArray[2] );

	}

	public String getFriend() {
		return friend;
	}

	public void setFriend(String friend) {
		this.friend = friend;
	}

}
