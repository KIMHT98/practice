package com.ssafy.ws;

import org.springframework.stereotype.Component;

@Component(value="Comic")
public class ComicBook implements Book{

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return "만화책";
	}

	
}