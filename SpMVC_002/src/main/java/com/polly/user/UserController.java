package com.polly.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.polly.user.models.UserVO;
import com.polly.user.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String join() {
		return "user/join";
	}
	
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String join(UserVO user, Model model) {
		/**
		 * UserVO 클래스를 작성할 때
		 * 모든 변수를 private 으로 선언하고
		 * getter(), setter() method 를 만들었다.
		 * java 코드에 변수 값을 읽을 때는 객체.getter() 형식으로
		 * 사용해야 한다.
		 */
		System.out.println(user.getUsername());
		// model 의 USER 속성과 UserVO(user) 데이터를 키-값 쌍으로 만들어 client 로 보낸다.
		model.addAttribute("USER",user);
		return "user/join_ok";
	}
	@RequestMapping(value="/detail", method=RequestMethod.GET)
	public String detail(Model model) {
		/**
		 * UserService 클래스에 선언된 getUser() method  를 호출하여
		 * 사용자 정보 받아오기(getter)
		 * 어떤 일을 수행하려면 클래스를 객체로 선언(인스턴스 생성)하고, 
		 * 초기화하는 과정을 먼저 수행해야 한다.
		 */
		// UserService.getUser() 처럼 사용 불가
		UserService userService = new UserService();
		UserVO user = userService.getUser();
		model.addAttribute("USER", user);
		return "user/join_ok";
	}
}
