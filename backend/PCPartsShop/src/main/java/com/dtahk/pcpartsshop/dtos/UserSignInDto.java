package com.dtahk.pcpartsshop.dtos;

import com.dtahk.pcpartsshop.commons.UserRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserSignInDto {

    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String username;

    private String token;

    private Boolean enabled;

    private UserRole role;
}