package org.springside.samples.quickservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springside.samples.quickservice.domain.Task;

public interface TaskDao extends CrudRepository<Task, Long> {
}
