package org.rafflely.raffleservice.models.requests;

import org.rafflely.raffleservice.enums.SRPState;
import org.rafflely.raffleservice.enums.UserType;

public class SRPRequest {
    private SRPState state;
    private UserType userType;
    private String email;
    private String pubKey;
    private String message;

    public SRPState getState() {
        return state;
    }

    public UserType getUserType() {
        return userType;
    }

    public String getEmail() {
        return email;
    }

    public String getPubKey() {
        return pubKey;
    }

    public String getMessage() {
        return message;
    }
}
