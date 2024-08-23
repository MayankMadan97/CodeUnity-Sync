package com.codesync.taskmanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codesync.taskmanager.entities.OAuthProvider;

@Repository
public interface OAuthProviderRepository extends JpaRepository<OAuthProvider, Long> {

}
