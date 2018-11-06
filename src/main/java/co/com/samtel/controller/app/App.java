package co.com.samtel.controller.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@SpringBootApplication
@ComponentScan("co.com.samtel.controller")
@EnableAutoConfiguration
@EnableJpaRepositories("co.com.samtel.controller.repos")
@EntityScan("co.com.samtel.controller.entity")
public class App extends SpringBootServletInitializer {
	
	private static Class<App> applicationClass = App.class;
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }
}
