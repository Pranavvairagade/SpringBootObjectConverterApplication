package com.example.SpringBootObjectConverterApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

import com.example.SpringBootObjectConverterApplication.model.Person;
import com.example.SpringBootObjectConverterApplication.service.FileService;




@RestController
public class FileController {

    @Autowired
    private FileService fileService;

    @GetMapping("/convert")
    public String convertObjectToFiles() {
        Person person = new Person("John Doe", 30);

        String jsonFilePath = "D:\\programs/person.json";
        String xmlFilePath = "D:\\programs/person.xml";

        try {
            fileService.saveObjectAsJson(person, jsonFilePath);
            fileService.saveObjectAsXml(person, xmlFilePath);
        } catch (IOException e) {
            e.printStackTrace();
            return "Error occurred during file conversion";
        }

        return "Files saved successfully!";
    }
}
