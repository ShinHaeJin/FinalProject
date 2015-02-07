package controller;

import javax.annotation.Resource;

import model.domain.MemberDTO;
import model.service.mService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TimeController {
	@Resource(name="mService")
    private mService mService;
	
	@RequestMapping(value="/idCheck.do",  method=RequestMethod.POST)
	public String checkId(@RequestParam("email") String email, @RequestParam("pw") String pw){
		//System.out.println("Controller!" + email + pw);
		MemberDTO member = mService.checkId(email, pw);
		System.out.println("Controller!!!!! " + member);
		if(member == null){
			return "로그인실패";
		}else
			return "success";
	}
}
