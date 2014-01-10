package org.springside.examples.quickservice.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TaskRestController {
	private static Logger logger = LoggerFactory.getLogger(TaskRestController.class);

	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return "Hello World!!";
	}
}
