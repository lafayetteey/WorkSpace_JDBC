package com.biz;

import java.sql.Connection;
import java.util.List;

import com.dao.MemberDaoImpl;
import com.dto.Member;

import static common.JDBCTemplate.*;

public class MemberBizImpl implements MemberBiz {
	MemberDaoImpl dao = new MemberDaoImpl();
	
	@Override
	public List<Member> selectAll() {
		Connection con = getConnection();
		List<Member> res = dao.selectAll(con);
		close(con);
		return res;
	}

	@Override
	public Member selectOne(int no) {
		Connection con = getConnection();
		Member m = dao.selectOne(con, no);
		close(con);
		return m;
	}

	@Override
	public int insert(Member m) {
		return 0;
	}

	@Override
	public int delete(int no) {
		return 0;
	}

	@Override
	public int update(Member m) {
		return 0;
	}

}
