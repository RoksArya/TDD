package com.TDDStrNumSum.ServiceImpl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import com.TDDStrNumSum.Service.StringSumService;

@Service
public class StringNumSumImpl implements StringSumService {
	
	@Override
	public int add(String str) {
		if(str.length()==0) return 0;
		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = pattern.matcher(str);
		int sum = 0;
		while(matcher.find()) sum += Integer.parseInt(matcher.group());
		return sum;
	}

}
