package com.credable.accessservice.propertyaccess;

import com.credable.accessservice.bean.PropertyAccessBean;
import com.credable.accessservice.bean.PropertyDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropertiesService {

    @Autowired
    private PropertyAccessBean bean;

    public PropertyDto getAllProperties() {
        return new PropertyDto(bean.getName(), bean.getPath(), bean.getMinimum(), bean.getMaximum());
    }
}
