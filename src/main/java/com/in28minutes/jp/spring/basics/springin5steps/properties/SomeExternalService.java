package com.in28minutes.jp.spring.basics.springin5steps.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalService {

    @Value("${external.service.url}")
    private String url;

    /* @Value()
       from property file "app.properties"
       external.service.url
    */
    public void setUrl(String url) {
        this.url = url;
    }

    public String returnServiceURL(){
        return url;
    }
}
