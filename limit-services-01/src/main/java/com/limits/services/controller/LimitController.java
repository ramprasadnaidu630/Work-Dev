package com.limits.services.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.limits.services.Dto.LimitControllerDto;

@RestController
public class LimitController {

	@Autowired
	private LimitControllerDto controllerDto;

	@GetMapping("/limits")
	public LimitControllerDto limitController() {
//		LimitControllerDto controllerDto = new LimitControllerDto();
		LimitControllerDto limitControllerDto =new LimitControllerDto();
		limitControllerDto.setMaximum(controllerDto.getMaximum());
		limitControllerDto.setMinimum(controllerDto.getMinimum());
		return limitControllerDto;
	}
}
