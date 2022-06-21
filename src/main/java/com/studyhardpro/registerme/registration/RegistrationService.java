package com.studyhardpro.registerme.registration;

import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    public String register(RegistrationRequest request) {
        return "registered as intended";
    }
}
