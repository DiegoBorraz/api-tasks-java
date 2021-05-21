package com.tasks.api.repository;

import com.tasks.api.models.Task;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long>{

Task findById(long id);


    
}