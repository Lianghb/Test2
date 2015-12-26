package com.boxfish.lhb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * Created by boxfish on 15/12/14.
 */
@SpringBootApplication
@EnableAuthorizationServer
@EnableGlobalMethodSecurity
@EnableWebSecurity
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}