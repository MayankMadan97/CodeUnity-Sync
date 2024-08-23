package com.codesync.taskmanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codesync.taskmanager.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
