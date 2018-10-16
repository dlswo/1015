package org.zerock.sample;

import lombok.extern.log4j.Log4j;

@Log4j
public class KoreanCook implements Cook{
	
	public void init() {
		log.info("KoreanCook init...");
	}
	
	public void destroy() {
		log.info("destroy...........");
	}
}
