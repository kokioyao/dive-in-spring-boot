package cn.footman.autoconfigure.configuration;

import cn.footman.autoconfigure.annotation.EnableHelloWorld;
import cn.footman.autoconfigure.condition.ConditionalOnSystemProperty;
import org.springframework.context.annotation.Configuration;

/**
 * helloworld自动装配
 * @author kokio
 * @create 2019-01-15 0:21
 */
@Configuration  //spring 模式注解
@EnableHelloWorld   //spring模块装配
@ConditionalOnSystemProperty(name = "user.name",value = "yaokaikai")    //条件装配
public class HelloWorldAutoConfiguration {
}
