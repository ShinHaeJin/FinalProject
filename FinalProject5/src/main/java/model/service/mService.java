package model.service;

import model.domain.MemberDTO;

public interface mService {
	MemberDTO checkId(String email, String pw);
}
