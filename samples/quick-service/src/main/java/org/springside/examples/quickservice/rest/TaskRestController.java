package org.springside.examples.quickservice.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springside.examples.quickservice.service.TaskService;

@Controller
public class TaskRestController {
	private static Logger logger = LoggerFactory.getLogger(TaskRestController.class);

	@Autowired
	private TaskService taskService;

	@RequestMapping("/")
	@ResponseBody
	public String home() {
		logger.info("sb. wakeup");
		return "Hello World!!";
	}
}
