/**
 * 
 */
package com.infogalaxy.addressservice.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author InfoGalaxy
 *  07-Jan-2023
 */
@Configuration
public class AddressConfig {

	@Bean
	ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
