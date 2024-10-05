package com.TDDStrNumSum.ServiceImpl;

import org.springframework.stereotype.Service;

import com.TDDStrNumSum.Service.StringSumService;

@Service
public class StringNumSumImpl implements StringSumService {
	
	@Override
	public int add(String str) {
		if(str.length()==0) return 0;
		return Integer.parseInt(str);
	}

}
