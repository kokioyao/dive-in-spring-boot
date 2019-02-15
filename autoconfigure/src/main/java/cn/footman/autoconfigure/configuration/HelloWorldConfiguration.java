package cn.footman.autoconfigure.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author kokio
 * @create 2019-01-14 22:06
 */
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String helloWorld(){
        return "hello wold!!";
    }
}
