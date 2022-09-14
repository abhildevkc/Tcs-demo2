package com.tcs.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("docker")
public class DockerController {
	
	@GetMapping("show")
	public String method1() {
		
		return "Docker Welcome";
	}

}
