package com.codesync.taskmanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codesync.taskmanager.entities.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}