package co.com.samtel.controller.conf;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigAplication {
	
	@Bean("modelMapper")
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
