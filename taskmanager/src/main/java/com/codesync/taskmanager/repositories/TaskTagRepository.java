package com.codesync.taskmanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codesync.taskmanager.entities.TaskTag;

@Repository
public interface TaskTagRepository extends JpaRepository<TaskTag, Long> {

}
