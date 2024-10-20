package com.example.SpringBootObjectConverterApplication.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class FileConverterUtil {

    // Convert object to JSON and save to file
    public void convertToJson(Object object, String filePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File(filePath), object);
    }

    // Convert object to XML and save to file
    public void convertToXml(Object object, String filePath) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.writeValue(new File(filePath), object);
    }
}
