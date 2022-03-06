package com.gqzdev.learnsys;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
/**
 * description:
 * @Author：+QQ 2027776292
 * @Date： 2020/4/11 19:35
 */
public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(LearnsysApplication.class);
    }

}
