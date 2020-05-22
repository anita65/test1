package com.kishori;
//praju11
//aaa web11
//kkk bbb
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//22 new
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
