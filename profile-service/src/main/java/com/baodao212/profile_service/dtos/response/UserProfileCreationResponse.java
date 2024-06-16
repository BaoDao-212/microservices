package com.baodao212.profile_service.dtos.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserProfileCreationResponse {
    String id;
    String firstName;
    String lastName;
    LocalDate dob;
    String city;
}
