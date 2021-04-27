package com.in28minutes.jp.spring.basics.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalService {


    private String url;

    /* @Value()
       from property file "app.properties"
       external.service.url
    */
    public void setUrl(@Value("${external.service.url}") String url) {
        this.url = url;
    }

    public String returnServiceURL(){
        return url;
    }
}
