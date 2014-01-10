package org.springside.samples.advancedservice.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskRestController {

	@RequestMapping("/")
	public String home() {
		return "Hello World!!!";
	}
}
