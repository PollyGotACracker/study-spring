package com.polly.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Annotation 이 무엇이냐에 따라 class 내부 코드 동작이 달라지게 된다.
 */
@Controller
@RequestMapping(value="/user")
public class HomeController {
	/**
	 * http://localhost:8080/hello/user/login 으로 요청이 오면
	 *  /WEB-INF/views/user/login.jsp 를 Rendering 하여 응답하라
	 */
	@RequestMapping(value="/login", method=RequestMethod.GET) 
	public String login() {
		return "user/login";
	}
	
	/**
	 * overloading... 함수 이름은 같지만 매개변수가 다름
	 * username과 password 변수는 login.jsp 에서 name 속성의 값이다.
	 * 아래 코드는 form 을 submit 하면 동작
	 */
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(String username, String password, Model model) {
		model.addAttribute("USERNAME", username);
		model.addAttribute("PASSWORD", password);
		return "user/login";
	}
}
