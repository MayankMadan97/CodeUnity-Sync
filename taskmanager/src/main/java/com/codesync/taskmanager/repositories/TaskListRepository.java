package com.codesync.taskmanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codesync.taskmanager.entities.TaskList;

@Repository
public interface TaskListRepository extends JpaRepository<TaskList, Long> {

}
