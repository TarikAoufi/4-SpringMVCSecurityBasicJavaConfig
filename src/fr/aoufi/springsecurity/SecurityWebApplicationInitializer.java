package fr.aoufi.springsecurity;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;


/**
 * Spring Web MVC Security Java-based Config Demo Project.
 * 
 * @author AOUFI
 *
 */
public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {

	public SecurityWebApplicationInitializer() {
		super(SecurityConfiguration.class);
	}

}
