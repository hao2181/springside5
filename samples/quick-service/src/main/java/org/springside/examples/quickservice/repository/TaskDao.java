package org.springside.examples.quickservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springside.examples.quickservice.domain.Task;

public interface TaskDao extends CrudRepository<Task, Long> {
}
