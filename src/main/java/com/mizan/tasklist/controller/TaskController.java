package com.mizan.tasklist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mizan.tasklist.model.Task;
import com.mizan.tasklist.service.TaskService;

@RestController
public class TaskController {

@Autowired
TaskService taskService;

@GetMapping("/task")
private List<Task> getTasks() {
	
	return taskService.getAllTasks();
	
}

@GetMapping("/task/{id}")
private Task getTask(@PathVariable("id") int taskId){
	return taskService.getTaskById(taskId);
}
	
@PutMapping("/task")
private void updateTask(@RequestBody Task task){
	taskService.updateTask(task);
}

@DeleteMapping("/task/{id}")
private void deleteTask(@PathVariable("id") int taskId) {
	taskService.deleteTask(taskId);
}

@PostMapping("/task")
private void addTask(@RequestBody Task task) {
	taskService.addTask(task);
}

}
