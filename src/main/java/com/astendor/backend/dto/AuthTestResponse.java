package com.astendor.backend.dto;

public class AuthTestResponse {

    private String status;
    private String message;
    private String loginUri;

    public AuthTestResponse() {
    }

    public AuthTestResponse(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public AuthTestResponse(String status, String message, String loginUri) {
        this.status = status;
        this.message = message;
        this.loginUri = loginUri;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getLoginUri() {
        return loginUri;
    }

    public void setLoginUri(String loginUri) {
        this.loginUri = loginUri;
    }
}
