package model.dao;

import model.domain.MemberDTO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import util.DBUtil;

@Repository("mDao")
public class MemberDAOImpl implements MemberDAO{
	@Override
	public MemberDTO checkId(String email, String pw) {
		System.out.println("MemeberDAOImple! " + email + " " + pw);
		SqlSession session = null;
		MemberDTO member = new MemberDTO(email, pw);
		try {
			session = DBUtil.getSqlSession();
			System.out.println("Member는 " + member);
			member = session.selectOne("member.checkId", member);
		} finally {
			DBUtil.closeSqlSession(session);
		}
		return member;
	}

}
