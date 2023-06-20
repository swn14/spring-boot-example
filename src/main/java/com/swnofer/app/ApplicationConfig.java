package com.swnofer.app;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "app")
public class ApplicationConfig {

    private String sabrePseudoCityCode;
    private String sabreUsername;
    private String sabrePassword;

    public String getSabrePseudoCityCode() {
        return sabrePseudoCityCode;
    }

    public void setSabrePseudoCityCode(String sabrePseudoCityCode) {
        this.sabrePseudoCityCode = sabrePseudoCityCode;
    }

    public String getSabreUsername() {
        return sabreUsername;
    }

    public void setSabreUsername(String sabreUsername) {
        this.sabreUsername = sabreUsername;
    }

    public String getSabrePassword() {
        return sabrePassword;
    }

    public void setSabrePassword(String sabrePassword) {
        this.sabrePassword = sabrePassword;
    }
}