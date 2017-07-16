package com.tt.office_game_manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 */

@SpringBootApplication
@EntityScan( basePackages = {"com.tt.office_game_manager"})
@EnableAutoConfiguration
@EnableConfigurationProperties
@ComponentScan( basePackages = {"com.tt.office_game_manager"})
public class App {
    public static void main(String[] args) {
        //TODO: Repository i serwisy do kazdej encji
        SpringApplication.run(App.class, args);
    }
}
