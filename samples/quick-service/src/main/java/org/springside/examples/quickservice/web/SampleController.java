package org.springside.examples.quickservice.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {
	Logger logger = LoggerFactory.getLogger(SampleController.class);

	@RequestMapping("/")
	@ResponseBody
	public String home() {
		logger.info("sb. wakeup");
		return "Hello World!!";
	}
}
