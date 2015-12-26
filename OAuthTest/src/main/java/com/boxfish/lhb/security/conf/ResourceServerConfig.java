//package com.boxfish.lhb.security.conf;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
//import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
//import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
//
///**
// * Created by boxfish on 15/12/26.
// */
//
///**
// * 资源服务器配置
// */
//@Configuration
//@EnableResourceServer
//public class ResourceServerConfig extends ResourceServerConfigurerAdapter {
//    public static final String RESOURCE_ID = "test_resource";
//    private Logger logger = LoggerFactory.getLogger(getClass());
//
//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//        logger.debug("configure(HttpSecurity http)");
//        System.err.println("rrrrrrrrrrrrrrrr----------HttpSecurity:" + http);
//        http
//                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
//                .and()
//                .requestMatchers().antMatchers("/photos/**", "/oauth/users/**", "/oauth/clients/**", "/me")
//                .and()
//                .authorizeRequests()
//                .antMatchers("/me").access("#oauth2.hasScope('read')")
//                .antMatchers("/photos").access("#oauth2.hasScope('read') or (!#oauth2.isOAuth() and hasRole('ROLE_USER'))")
//                .antMatchers("/photos/trusted/**").access("#oauth2.hasScope('trust')")
//                .antMatchers("/photos/user/**").access("#oauth2.hasScope('trust')")
//                .antMatchers("/photos/**").access("#oauth2.hasScope('read') or (!#oauth2.isOAuth() and hasRole('ROLE_USER'))")
//        ;
//
////        http.requestMatchers().antMatchers("/res")
////                .and()
////                .authorizeRequests()
////                .anyRequest().access("#oauth2.hasScope('read')");
//
//    }
//
//    @Override
//    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
//        resources.resourceId(RESOURCE_ID);
//    }
//}
//
