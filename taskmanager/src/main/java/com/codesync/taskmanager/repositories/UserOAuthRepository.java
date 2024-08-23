package com.codesync.taskmanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codesync.taskmanager.entities.UserOAuth;

@Repository
public interface UserOAuthRepository extends JpaRepository<UserOAuth, Long> {

}
