package com.security.demo.securityController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.security.demo.securityDto.TestSecurityDto;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

@RestController
public class TestSecurityController {

	List<TestSecurityDto> testSecurityDto = new ArrayList<>(
			List.of(new TestSecurityDto(0, "ram", "ganesh"), new TestSecurityDto(1, "prasad", "siva")));

	@GetMapping("/getsecuritylist")
	public List<TestSecurityDto> getlist() {
		return testSecurityDto;
	}
	
	@GetMapping("/csrf-token")  
	public CsrfToken gitToken(HttpServletRequest request) {
		return (CsrfToken) request.getAttribute("_csrf");
	}

	@PostMapping("/savesecurity")
	public TestSecurityDto save(@RequestBody TestSecurityDto securityDto) {
		testSecurityDto.add(securityDto);
		return securityDto;
	}
}
