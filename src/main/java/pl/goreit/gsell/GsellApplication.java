package pl.goreit.gsell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableJpaAuditing
public class GsellApplication {

	public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(GsellApplication.class, args);
        for( String name : context.getBeanDefinitionNames() )
        {
            System.out.println(name);
        }
    }
}
