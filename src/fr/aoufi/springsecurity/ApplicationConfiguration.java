package fr.aoufi.springsecurity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


/**
 * Spring Web MVC Security Java-based Config Demo Project.
 * Configures Spring MVC stuffs.
 * 
 * @author AOUFI
 *
 */
@Configuration
@ComponentScan("fr.aoufi.springsecurity")
public class ApplicationConfiguration {
	
    @Bean(name = "viewResolver")
    public InternalResourceViewResolver getViewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
}
