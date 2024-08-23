package com.codesync.taskmanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codesync.taskmanager.entities.Directory;

@Repository
public interface DirectoryRepository extends JpaRepository<Directory, Long> {

}
