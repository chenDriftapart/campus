package com.example.campus.Functions;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

@Component
public class InterceptorConfig implements WebMvcConfigurer {

    @Resource
    private  Interceptor interceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //registry.addInterceptor(interceptor).addPathPatterns("/**").excludePathPatterns("/checkLogin","/login_1",
               //"/js/**", "/css/**", "/images/**","/","/register","/api/**");
        registry.addInterceptor(interceptor).addPathPatterns("/");

    }

}
