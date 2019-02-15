package cn.footman.autoconfigure.bootstrap;

import cn.footman.autoconfigure.condition.ConditionalOnSystemProperty;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @author kokio
 * @create 2019-01-14 23:46
 */
public class SystemConditionBootstrap {

    @Bean
    @ConditionalOnSystemProperty(name = "user.name",value = "yaokaikai")
    public String helloWorld(){
        return "hello, kokio";
    }


    public static void main(String[] args) {

        ConfigurableApplicationContext context = new SpringApplicationBuilder(SystemConditionBootstrap.class)
                .web(WebApplicationType.NONE)
                .run();


        String helloWorld = context.getBean("helloWorld", String.class);

        System.out.println("helloWorld Bean:" + helloWorld);
        context.close();
    }
}
