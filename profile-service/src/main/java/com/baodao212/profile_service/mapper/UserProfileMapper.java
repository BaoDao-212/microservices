package com.baodao212.profile_service.mapper;

import com.baodao212.profile_service.dtos.request.UserProfileCreationRequest;
import com.baodao212.profile_service.dtos.response.UserProfileCreationResponse;
import com.baodao212.profile_service.entity.UserProfile;
import com.baodao212.profile_service.repository.UserProfileRepository;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserProfileMapper {
    UserProfile toUserProfile(UserProfileCreationRequest userProfile);
    UserProfileCreationResponse toUserProfileCreationResponse(UserProfile userProfile);
}
