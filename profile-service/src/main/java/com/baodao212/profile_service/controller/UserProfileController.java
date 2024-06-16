package com.baodao212.profile_service.controller;

import com.baodao212.profile_service.dtos.request.UserProfileCreationRequest;
import com.baodao212.profile_service.dtos.response.UserProfileCreationResponse;
import com.baodao212.profile_service.service.UserProfileService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Slf4j
public class UserProfileController {
    UserProfileService userProfileService;
    @PostMapping
    UserProfileCreationResponse createUserProfile(@RequestBody UserProfileCreationRequest userProfileCreationRequest) {
        return userProfileService.createUserProfile(userProfileCreationRequest);
    }
    @GetMapping("/{id}")
    UserProfileCreationResponse getUserProfile(@PathVariable String id) {
        return userProfileService.getUserProfileById(id);
    }
}
