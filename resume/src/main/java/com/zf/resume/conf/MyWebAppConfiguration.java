package com.zf.resume.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MyWebAppConfiguration extends  WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //,"*.html","/js/**"
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**").excludePathPatterns("/**/login/","/**/sessionId/","/**.html","/js/**");
        super.addInterceptors(registry);
    }
}
