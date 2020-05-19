package com.mizan.tasklist.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mizan.tasklist.model.Task;
import com.mizan.tasklist.repository.TaskRepository;


@Service
public class TaskService {

@Autowired
TaskRepository taskRepository;

	public List<Task> getAllTasks() {
		
		List<Task> tasks = new ArrayList<Task>();
		taskRepository.findAll().forEach(task -> tasks.add(task));
		return tasks;
	}
	
	public Task getTaskById(int Id) {
		
		return taskRepository.findById(Id).get();
	}
	
	public void addTask(Task task) {
		
		taskRepository.save(task);
	}
	
	public void deleteTask(int Id) {
		taskRepository.deleteById(Id);
	}
	
	public void updateTask(Task task) {
		taskRepository.save(task);
	}
}
