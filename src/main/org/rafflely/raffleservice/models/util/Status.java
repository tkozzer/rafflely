package org.rafflely.raffleservice.models.util;

import org.rafflely.raffleservice.enums.StatusMessage;

public class Status {
    private StatusMessage statusMessage;
    private String code;

    public Status(StatusMessage statusMessage, String code) {
        this.statusMessage = statusMessage;
        this.code = code;
    }

    public StatusMessage getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(StatusMessage statusMessage) {
        this.statusMessage = statusMessage;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}


