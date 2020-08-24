package com.example.bootstrapSPRING;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class AppInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext container) throws ServletException {
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext();
        context.scan("com.example");
        container.addListener(new ContextLoaderListener((WebApplicationContext) context));

        ServletRegistration.Dynamic dispatcher =
                container.addServlet("mvc", new DispatcherServlet((WebApplicationContext) context));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");
    }
}
