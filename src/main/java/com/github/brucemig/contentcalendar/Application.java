package com.github.brucemig.contentcalendar;

import com.github.brucemig.contentcalendar.config.ContentCalendarProperties;
import com.github.brucemig.contentcalendar.model.Content;
import com.github.brucemig.contentcalendar.model.Status;
import com.github.brucemig.contentcalendar.model.Type;
import com.github.brucemig.contentcalendar.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.Arrays;

@EnableConfigurationProperties(ContentCalendarProperties.class)
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

}
