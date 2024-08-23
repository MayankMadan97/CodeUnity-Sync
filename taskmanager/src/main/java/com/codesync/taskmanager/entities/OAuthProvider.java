package com.codesync.taskmanager.entities;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "OAuthProviders")
public class OAuthProvider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long providerId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ProviderName providerName;

    @Column(nullable = false, length = 255)
    private String clientId;

    @Column(nullable = false, length = 255)
    private String clientSecret;

    @Column(nullable = false, length = 255)
    private String redirectUri;

    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    private Timestamp createdAt;

    @Column(nullable = false)
    @UpdateTimestamp
    private Timestamp updatedAt;

    // Enum for provider names
    public enum ProviderName {
        GITHUB, GOOGLE, JIRA
    }

}
