package org.o7planning.sbmultids;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication

//Disable some Spring Boot auto config
@EnableAutoConfiguration(exclude = { //
     DataSourceAutoConfiguration.class, //
     DataSourceTransactionManagerAutoConfiguration.class, //
     HibernateJpaAutoConfiguration.class })


public class Laba27Application {

	public static void main(String[] args) {
		SpringApplication.run(Laba27Application.class, args);
	}

}