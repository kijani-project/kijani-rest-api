package com.kijani.restapi.service;

import com.kijani.restapi.model.FileStorageProperties;
import org.springframework.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Objects;

import static java.nio.file.Path.of;

/**
 * @author Christopher
 */

@Service
public class FileService {
    private final Path fileStorageLocation;

    @Autowired
    public FileService(FileStorageProperties fileStorageProperties) {
        //get the path of the upload directory
        fileStorageLocation = of(fileStorageProperties.getUploadDir());
        try {
            //creates directory if directory already exist, it will not throw exception
            Files.createDirectories(fileStorageLocation);
        } catch (IOException e) {
            throw new RuntimeException("Could not create the directory where the uploaded files will be stored. " +  e);
        }
    }

    public String storeFile(MultipartFile multipartFile) {
        //get filename
        String filename = StringUtils.cleanPath(Objects.requireNonNull(multipartFile.getOriginalFilename()));
        try {
            // TODO: check if the filename contains invalid characters
            // remove dots(.) in filename
            filename = filename.substring(0, filename.lastIndexOf("."))
                    .replace(".", "") + "." + filename.substring(filename.lastIndexOf(".") + 1);
            // convert path string to Path
            Path targetLocation = fileStorageLocation.resolve(filename);
            // copy file to the target location and replace existing file with the same name if exists
            Files.copy(multipartFile.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);
            return targetLocation.toString();
        } catch (IOException e) {
            throw new RuntimeException("Could not store file " + filename, e);
        }
    }

    public Resource getFile(String filename) {
        try {
            Path file = fileStorageLocation.resolve(filename).normalize();
            Resource resource = new UrlResource(file.toUri());
            if (resource.exists() || resource.isReadable()) {
                return resource;
            } else {
                throw new RuntimeException("Could not read file: " + filename);
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException("Could not retrieve file " + filename, e);
        }
    }
}



