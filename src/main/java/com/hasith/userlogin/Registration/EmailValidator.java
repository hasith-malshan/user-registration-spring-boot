package com.hasith.userlogin.Registration;

import org.springframework.stereotype.Service;

import java.util.function.Predicate;

@Service
public class EmailValidator implements Predicate<String> {
    @Override
    public boolean test(String s) {
        // TODO: 5/10/2024 Regex to validate Email
        return true;
    }
}
