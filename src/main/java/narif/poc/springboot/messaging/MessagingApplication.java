package narif.poc.springboot.messaging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import java.util.Locale;

@SpringBootApplication
public class MessagingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessagingApplication.class, args);
	}

	@Bean
	public MessageSource messageSource(){
		ReloadableResourceBundleMessageSource messageSource
				= new ReloadableResourceBundleMessageSource();
		messageSource.setCacheSeconds(600);
		messageSource.setBasename("classpath:messages");
		messageSource.setDefaultEncoding("UTF-8");
		return messageSource;

	}

	@Bean
	public Locale locale(){
		return Locale.getDefault();
	}

}
