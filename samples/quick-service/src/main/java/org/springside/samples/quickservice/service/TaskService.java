package org.springside.samples.quickservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springside.samples.quickservice.domain.Task;
import org.springside.samples.quickservice.repository.TaskDao;

//Spring Bean的标识.
@Component
// 默认将类中的所有public函数纳入事务管理.
@Transactional
public class TaskService {

	@Autowired
	private TaskDao taskDao;

	public List<Task> getAllTask() {
		return (List<Task>) taskDao.findAll();
	}
}
