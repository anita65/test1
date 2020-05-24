package com.kishori;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//11
//22
//web
//w1
//b2
//k2
public class MyWebApp extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { AppConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}