package com.codesync.taskmanager.entities;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "UserOAuth")
public class UserOAuth {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userOAuthId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "provider_id", nullable = false)
    private OAuthProvider provider;

    @Column(nullable = false, length = 255)
    private String providerUserId;

    @Column(nullable = false, length = 255)
    private String accessToken;

    @Column(nullable = true, length = 255)
    private String refreshToken;

    @Column(nullable = true)
    private Timestamp tokenExpiry;

    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    private Timestamp createdAt;

    @Column(nullable = false)
    @UpdateTimestamp
    private Timestamp updatedAt;

}
