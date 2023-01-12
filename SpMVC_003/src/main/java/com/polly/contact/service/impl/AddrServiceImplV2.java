package com.polly.contact.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.polly.contact.config.QualConfig;
import com.polly.contact.models.AddrVO;
import com.polly.contact.service.AddrService;

@Service(QualConfig.ADDR.SERVICE_V2)
public class AddrServiceImplV2 implements AddrService{

	@Override
	public List<AddrVO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AddrVO findById(String num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(AddrVO addrVO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(AddrVO addrVO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String num) {
		// TODO Auto-generated method stub
		return 0;
	}

}
