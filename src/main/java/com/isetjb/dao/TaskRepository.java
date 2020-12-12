package com.isetjb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isetjb.entities.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{

}
