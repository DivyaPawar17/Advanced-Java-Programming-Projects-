package example.spring.mvc.config;


import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

public class SpringWebApplicationInitializer implements WebApplicationInitializer {
	
	private WebApplicationContext getContext() //interface
	{ 
		AnnotationConfigWebApplicationContext webCtx = new AnnotationConfigWebApplicationContext();
		webCtx.setConfigLocations("example");
		//the above code is equivalent to: @componentScan(basePackages = "Controller
		return webCtx;
		
	}
	
	@Override
	public void onStartup(ServletContext servletContextRef) throws ServletException {
		
		// This Method gets called when the application is getting  loaded
		
		System.out.println("Application is being loaded");
		WebApplicationContext webCtxRef = getContext();
		DispatcherServlet frontControllerRef = new DispatcherServlet(webCtxRef);
		
		// this code is equivalent servlet
		ServletRegistration.Dynamic registration = servletContextRef.addServlet("frontController", frontControllerRef);
		registration.addMapping("/");
		
	}

}
