package com.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SuppressWarnings("deprecation")
@Configuration
public class WebAppConfiguration extends WebMvcConfigurerAdapter {
//可以访问static文件夹
  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {   
	  registry.addResourceHandler("/static/**").addResourceLocations("file:/D:/static/");
      super.addResourceHandlers(registry);
  }
}  
