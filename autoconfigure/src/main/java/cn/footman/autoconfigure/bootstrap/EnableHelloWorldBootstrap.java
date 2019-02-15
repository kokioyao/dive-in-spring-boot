package cn.footman.autoconfigure.bootstrap;

import cn.footman.autoconfigure.annotation.EnableHelloWorld;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author kokio
 * @create 2019-01-14 22:12
 */
@EnableHelloWorld
public class EnableHelloWorldBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableHelloWorldBootstrap.class)
                .web(WebApplicationType.NONE)
                .run();

        String helloWorld = context.getBean("helloWorld", String.class);
        System.out.println("helloWorld:" + helloWorld);

        //关闭上下文
        context.close();
    }
}
