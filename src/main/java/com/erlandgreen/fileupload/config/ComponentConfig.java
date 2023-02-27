package com.erlandgreen.fileupload.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {
        "com.erlandgreen.fileupload.model",
        "com.erlandgreen.fileupload.dao",
        "com.erlandgreen.fileupload.utils"})
@PropertySource("classpath:fileUpload.properties")
public class ComponentConfig {

}
