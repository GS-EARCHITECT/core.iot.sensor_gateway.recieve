package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = { "kafka_message_mgmt"})
@EnableJpaRepositories(basePackages = { "kafka_message_mgmt" })
@ComponentScan({ "kafka_message_mgmt"})
public class IOTGatewayRecieve_Main extends SpringBootServletInitializer 
{
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) 
	{
		return application.sources(IOTGatewayRecieve_Main.class);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SpringApplication.run(IOTGatewayRecieve_Main.class, args);
	}
}