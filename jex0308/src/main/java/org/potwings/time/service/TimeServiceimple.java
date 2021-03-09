package org.potwings.time.service;

import org.potwings.time.mapper.TimeMapper;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
@RequiredArgsConstructor
public class TimeServiceimple implements TimeService {

	private final TimeMapper timeMapper;
	
	@Override
	public String getTime() {
		
		log.info("time......");
		return timeMapper.getNow();
		
	}

}
