package cn.footman.springapplication.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;

/**
 * @author kokio
 * @create 2019-01-15 15:24
 */
public class AfterHelloWorldApplicationContextInitializer
        implements ApplicationContextInitializer,Ordered {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("After ApplicationContext.id = " + applicationContext.getId());

    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}
