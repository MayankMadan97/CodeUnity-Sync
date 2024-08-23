package com.codesync.taskmanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codesync.taskmanager.entities.CodeSnippet;

@Repository
public interface CodeSnippetRepository extends JpaRepository<CodeSnippet, Long> {
    
}
