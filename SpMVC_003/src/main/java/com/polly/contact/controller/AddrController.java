package com.polly.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.polly.contact.config.QualConfig;
import com.polly.contact.models.AddrVO;
import com.polly.contact.service.AddrService;
import com.polly.contact.service.impl.AddrServiceImplV2;

@Controller
@RequestMapping(value="/addr")
public class AddrController {
	
	
	// @Qualifier : 참조하고자 하는 class 를 지정
	// QualConfig class 를 사용하여 magic string 제거
	// magic string, magic number: 실행 시점에 오류를 발생시키는 하드코딩
	
	@Autowired
	@Qualifier(QualConfig.ADDR.SERVICE_V2)
	private AddrService adService;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String list(Model model) {
		/**
		 * interface 가 있고, 구현체가 있는 클래스를 사용하여
		 * 객체 선언과 생성하기 
		 * 아직 구현체 클래스가 완성이 되지 않았어도 
		 * 여기에서 생성된 객체를 사용하여 
		 * 다른 코드를 계속 작성해나갈 수 있다.
		 */
		AddrService adService = new AddrServiceImplV2();
		List<AddrVO> addrList = adService.selectAll();	
		model.addAttribute("ADLIST", addrList);
		return "addr/list";	
	}
}
