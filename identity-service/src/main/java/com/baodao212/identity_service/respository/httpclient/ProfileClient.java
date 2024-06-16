package com.baodao212.identity_service.respository.httpclient;
import com.baodao212.identity_service.configuration.AuthenticationRequestInterceptor;
import com.baodao212.identity_service.dto.request.ProfileCreationRequest;
import com.baodao212.identity_service.dto.response.UserProfileResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient(name = "profile-service", url = "${app.services.profile}",configuration = AuthenticationRequestInterceptor.class)
public interface ProfileClient {
    @PostMapping(value = "/internal", produces = MediaType.APPLICATION_JSON_VALUE)
    UserProfileResponse createProfile(@RequestBody ProfileCreationRequest request);
}