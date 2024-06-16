package com.baodao212.profile_service.repository;

import com.baodao212.profile_service.entity.UserProfile;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface UserProfileRepository extends Neo4jRepository<UserProfile, String> {

}
