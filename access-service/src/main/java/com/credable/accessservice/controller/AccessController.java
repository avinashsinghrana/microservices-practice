package com.credable.accessservice.controller;


import com.credable.accessservice.bean.PropertyDto;
import com.credable.accessservice.propertyaccess.PropertiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccessController {

    @Autowired
    PropertiesService propertiesService;

    @GetMapping(value = "/pros")
    public PropertyDto getProperties() {
        return propertiesService.getAllProperties();
    }
}
