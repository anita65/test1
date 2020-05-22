package com.kishori;
//kkk
//aaa
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//22
public class MyWebApp extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {

    	//config22

        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        //kishori
        return new Class<?>[] { AppConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}
