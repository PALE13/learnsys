package com.gqzdev.learnsys.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class FilePath implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//   registry.addResourceHandler("虚拟路径").addResourceLocations("file:本地资源路径");
        registry.addResourceHandler("/upload/learn/**").addResourceLocations("file:C:/upload/learn/");
    }
}

