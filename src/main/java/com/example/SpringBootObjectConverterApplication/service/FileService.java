package com.example.SpringBootObjectConverterApplication.service;


import java.io.IOException;

public interface FileService {
    void saveObjectAsJson(Object object, String jsonFilePath) throws IOException;
    void saveObjectAsXml(Object object, String xmlFilePath) throws IOException;
}
