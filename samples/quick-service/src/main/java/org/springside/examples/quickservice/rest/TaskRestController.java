package org.springside.examples.quickservice.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springside.examples.quickservice.domain.Task;
import org.springside.examples.quickservice.rest.support.MediaTypes;
import org.springside.examples.quickservice.service.TaskService;

@Controller
@RequestMapping(value = "/api/v1/task")
public class TaskRestController {
	private static Logger logger = LoggerFactory.getLogger(TaskRestController.class);

	@Autowired
	private TaskService taskService;

	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return "Hello World!!";
	}

	@RequestMapping(method = RequestMethod.GET, produces = MediaTypes.JSON_UTF_8)
	@ResponseBody
	public List<Task> list() {
		return taskService.getAllTask();
	}
}
