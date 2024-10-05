package com.TDDStrNumSum.ServiceImpl;

import org.springframework.stereotype.Service;

import com.TDDStrNumSum.Service.StringSumService;

@Service
public class StringNumSumImpl implements StringSumService {
	
	@Override
	public int add(String str) {
		if(str.length()==0) return 0;
		String[] splitStr = str.split(",");
		int sum = 0;
		for(String num: splitStr) sum += Integer.parseInt(num);
		return sum;
	}

}
