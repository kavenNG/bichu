package com.bichu.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by kaven on 2018/10/21.
 */
public interface FileService {
    String upload(MultipartFile file, String path);
    String download(String filename, String localPath);
}
