package com.hauschildt.project.utilities;

import org.mindrot.jbcrypt.BCrypt;

public class PasswordUtility {
    public static void main(String[] args) {
        String password = "password";
        String hashed = BCrypt.hashpw(password, BCrypt.gensalt());

// gensalt's log_rounds parameter determines the complexity
// the work factor is 2**log_rounds, and the default is 10
        hashed = BCrypt.hashpw(password, BCrypt.gensalt(12));

// Check that an unencrypted password matches one that has
// previously been hashed
        if (BCrypt.checkpw("something else", hashed))
            System.out.println("It matches");
        else
            System.out.println("It does not match");
    }
}
