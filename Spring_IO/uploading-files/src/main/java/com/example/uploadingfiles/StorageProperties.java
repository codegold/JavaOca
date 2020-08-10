package com.example.uploadingfiles.storage;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("storage")
public class StorageProperties {

    private String location = "storage/uploadDir";

    public StorageProperties(String location) {
        this.location = location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
