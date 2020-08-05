package com.test02.dto;

public class MyTest {
	private int mno;
	private String mname;
	private String nickname;
	//생성자(기본/매개변수)
	public MyTest() {
		super();
	}
	public MyTest(int mno, String mname, String nickname) {
		super();
		this.mno = mno;
		this.mname = mname;
		this.nickname = nickname;
	}
	//getter,setter
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	//toString
	@Override
	public String toString() {
		return "MyTest [mno=" + mno + ", mname=" + mname + ", nickname=" + nickname + "]";
	}
	
	
	
	
	
	
}
