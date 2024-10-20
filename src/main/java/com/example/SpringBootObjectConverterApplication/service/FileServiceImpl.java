package com.example.SpringBootObjectConverterApplication.service;


import org.springframework.stereotype.Service;
import java.io.IOException;

import com.example.SpringBootObjectConverterApplication.util.FileConverterUtil;


@Service
public class FileServiceImpl implements FileService {

    private final FileConverterUtil fileConverterUtil = new FileConverterUtil();

    @Override
    public void saveObjectAsJson(Object object, String jsonFilePath) throws IOException {
        fileConverterUtil.convertToJson(object, jsonFilePath);
    }

    @Override
    public void saveObjectAsXml(Object object, String xmlFilePath) throws IOException {
        fileConverterUtil.convertToXml(object, xmlFilePath);
    }
}
