package com.gary.webtemplate.config;

import com.gary.webtemplate.WebTemplateApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by kaenry on 2016/5/21.
 * for war, run server error if not
 * ServletInitializer
 */
public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(WebTemplateApplication.class);
    }
}
