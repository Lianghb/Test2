
package com.boxfish.lhb.security.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;

/**
 * Created by boxfish on 15/12/19.
 */

/**
 * 认证服务器配置
 */
@Configuration
@EnableAuthorizationServer
public class OAuth2ServerConfiguration extends AuthorizationServerConfigurerAdapter {
    public static final String RESOURCE_ID = "test_resource";
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
                .withClient("client1") //客户端id
                .secret("123456") //客户端密码
                .resourceIds(RESOURCE_ID) //资源id
                .accessTokenValiditySeconds(60) //token有效时间1分钟
                .refreshTokenValiditySeconds(60) //重新获取token有效时间1分钟
                .authorities("ROLE_CLIENT", "ROLE_TRUSTED_CLIENT")
                .authorizedGrantTypes("password", "authorization_code", "refresh_token", "implicit")
                .autoApprove(true)
                .autoApprove("read")
                .scopes("read", "write", "trust")
                .redirectUris("http://localhost:8080");
    }

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints.tokenStore(new InMemoryTokenStore()); //token存储方式，内存
    }

    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        super.configure(security);
    }
}

