package model.service;

import javax.annotation.Resource;

import model.dao.MemberDAO;
import model.domain.MemberDTO;

import org.springframework.stereotype.Service;


@Service("mService")
public class mServiceImpl implements mService {

	@Resource(name="mDao")
	private MemberDAO mDao;
	
	@Override
	public MemberDTO checkId(String email, String pw) {
		System.out.println("mServiceImpl!");
		return mDao.checkId(email, pw);
	}
}