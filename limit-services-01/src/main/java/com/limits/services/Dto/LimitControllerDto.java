package com.limits.services.Dto;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ConfigurationProperties("limit-services-01")
public class LimitControllerDto {
	
	public	LimitControllerDto(){
	}
	
	public LimitControllerDto(int minimum2, int maximum2) {
		// TODO Auto-generated constructor stub
	}

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	private int minimum;
	
	private int maximum;
}
