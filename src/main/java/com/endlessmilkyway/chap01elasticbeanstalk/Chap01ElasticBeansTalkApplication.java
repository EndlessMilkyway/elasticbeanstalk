package com.endlessmilkyway.chap01elasticbeanstalk;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Chap01ElasticBeansTalkApplication {

    public static void main(String[] args) {
        SpringApplication.run(Chap01ElasticBeansTalkApplication.class, args);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
