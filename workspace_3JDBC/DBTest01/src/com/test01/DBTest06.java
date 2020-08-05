package com.test01;

import static common.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DBTest06 /*extends JDBCTemplate*/ {

	public void selectAll() {
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM MYTEST";
		
		try {
			con = getConnection();
			pstm = con.prepareStatement(sql);
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" : "
							+rs.getString(2)+" : "
							+rs.getString(3));
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstm);
			close(con);
		}
	}

	public void delete() {
		Connection con = null;
		PreparedStatement pstm = null;
		int res = 0;
		
		String sql = "DELETE FROM MYTEST WHERE MNO=?";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할번호: ");
		int no = sc.nextInt();
		
		try {
			con = getConnection();
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, no);
			
			res = pstm.executeUpdate();
			
			if(res>0) {
				System.out.println("delete 성공");
			}else {
				System.out.println("delete 실패");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstm);
			close(con);
		}
	}
	
	public void insert() {
		Connection con = null;
		PreparedStatement pstm = null;
		int res = 0;
		
		String sql = " INSERT INTO MYTEST VALUES(?, ?, ?) ";
	
		Scanner sc = new Scanner(System.in);
		System.out.print("no: ");
		int no = sc.nextInt();
		System.out.print("name: ");
		String name = sc.next();
		System.out.print("nickname: ");
		String nickName = sc.next();
		
		try {
			con = getConnection();
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, no);
			pstm.setString(2, name);
			pstm.setString(3, nickName);
			
			res = pstm.executeUpdate();
			if(res>0) {
				System.out.println("insert 성공");
//				selectAll();
			}else {
				System.out.println("insert 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstm);
			close(con);
		}
	}
	public void selectOne() {
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM MYTET WHERE MNO=?";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("mno: ");
		int mno = sc.nextInt();
		
		
		try {
			con = getConnection();
			pstm = con.prepareStatement(sql);
			pstm.setInt(1, mno);
			
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" : " 
						+ rs.getString(2) +" : "
						+ rs.getString(3));
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstm);
			close(con);
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
