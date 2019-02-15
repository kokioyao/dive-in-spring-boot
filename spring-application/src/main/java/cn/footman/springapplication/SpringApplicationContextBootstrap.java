package cn.footman.springapplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author kokio
 * @create 2019-01-29 11:22
 */
@SpringBootApplication
public class SpringApplicationContextBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(SpringApplicationContextBootstrap.class)
                .run(args);

        System.out.println("ConfigurableApplicationContext类型" + context.getClass().getName());
        System.out.println("Environment" + context.getEnvironment().getClass().getName());

        context.close();
    }
}
