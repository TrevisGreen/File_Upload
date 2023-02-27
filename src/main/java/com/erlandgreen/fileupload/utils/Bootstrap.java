package com.erlandgreen.fileupload.utils;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private static final Logger log = LoggerFactory.getLogger(Bootstrap.class);

    @Override
    public void onApplicationEvent(ContextRefreshedEvent e) {
        log.info("Verifying application");
        log.info("fileUpload Application is up");
    }
}
