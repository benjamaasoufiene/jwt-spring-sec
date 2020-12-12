package com.isetjb.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.isetjb.dao.TaskRepository;
import com.isetjb.entities.Task;

@RestController
public class TaskRestController {
	@Autowired
	private TaskRepository taskRepository;

	@GetMapping("/tasks")
	public List<Task> listTask() {
		return taskRepository.findAll();
	}
	@PostMapping("/tasks")
	public Task save(@RequestBody Task t) {
		return taskRepository.save(t);
	}
}
