package com.mizan.tasklist.repository;

import org.springframework.data.repository.CrudRepository;

import com.mizan.tasklist.model.Task;

public interface TaskRepository extends CrudRepository<Task, Integer> {

}
