/**
 * 
 */
package com.antwebapp.cmapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * @author Lawanu Borthakur
 *
 */
@Configuration
@ComponentScan(basePackages={"com.antwebapp"})
@EnableWebMvc
public class SpringWebConfig implements WebMvcConfigurer{
@Override
public void addResourceHandlers(ResourceHandlerRegistry registry) {
	// TODO Auto-generated method stub
	System.out.println("Inside Resource Handler");
	 registry.addResourceHandler("/static/**").addResourceLocations("/static/");
	
}
@Bean
public ViewResolver viewResolver()
{
InternalResourceViewResolver vr=new InternalResourceViewResolver();	
vr.setViewClass(JstlView.class);
vr.setPrefix("/WEB-INF/view/");
vr.setSuffix(".jsp");
return vr;
}
}
