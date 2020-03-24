package project.JAProject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

public class WebMvcConfig implements WebMvcConfigurer{

	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("home");
		registry.addViewController("login").setViewName("login");
		registry.addViewController("/403").setViewName("403");
	}
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver resilver = new InternalResourceViewResolver();
		resilver.setPrefix("/jsp/");
		resilver.setSuffix(".jsp");
		return resilver;
	}
}
