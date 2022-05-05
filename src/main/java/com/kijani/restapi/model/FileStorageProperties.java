package com.kijani.restapi.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Christopher
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "file")
public class FileStorageProperties {

    private String uploadDir;
}
