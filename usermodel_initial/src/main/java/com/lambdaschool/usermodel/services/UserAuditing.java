package com.lambdaschool.usermodel.services;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

//Service for the model auditable that the fields currently save as a username
//Model field createdBy defaults to find the username so right now it says
// run auditoraware -> getCurrentAuditor -> Return "system"
//make it a component so spring knows it exists
@Component
public class UserAuditing implements AuditorAware<String>
{
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("System");
    }
//    System created or modified this row on this table is what we are referencing.
}
