package com.eLibrary.moduleBusiness.contract;

import org.springframework.stereotype.Service;

@Service
public interface PasswordEncoder {
    String hashPassword(String password_plaintext);
    boolean checkPassword(String pPasswordPlainText, String pHashingPassword);
}
