package com.baodao212.profile_service.service;

import com.baodao212.profile_service.dtos.request.UserProfileCreationRequest;
import com.baodao212.profile_service.dtos.response.UserProfileCreationResponse;
import com.baodao212.profile_service.entity.UserProfile;
import com.baodao212.profile_service.mapper.UserProfileMapper;
import com.baodao212.profile_service.repository.UserProfileRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
public class UserProfileService {
    UserProfileRepository userProfileRepository;
    UserProfileMapper userProfileMapper;
    public UserProfileCreationResponse createUserProfile(UserProfileCreationRequest userProfileCreationRequest) {
        UserProfile userProfile = userProfileMapper.toUserProfile(userProfileCreationRequest);
        userProfile.setUserId(userProfileCreationRequest.getUserId());
        userProfile= userProfileRepository.save(userProfile);
        return userProfileMapper.toUserProfileCreationResponse(userProfile);
    }
    @PreAuthorize("hasRole('ADMIN')")
    public UserProfileCreationResponse getUserProfileById(String id) {
        UserProfile userProfile= userProfileRepository.findByUserId(id);
        return userProfileMapper.toUserProfileCreationResponse(userProfile);
    }
}
