package com.baodao212.identity_service.mapper;


import com.baodao212.identity_service.dto.request.ProfileCreationRequest;
import com.baodao212.identity_service.dto.request.UserCreationRequest;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface ProfileMapper {
    ProfileCreationRequest toProfileCreationRequest(UserCreationRequest request);
}