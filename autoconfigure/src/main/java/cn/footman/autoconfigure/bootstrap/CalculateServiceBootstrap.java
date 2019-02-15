package cn.footman.autoconfigure.bootstrap;

import cn.footman.autoconfigure.service.CalculateService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author kokio
 * @create 2019-01-14 23:18
 */
@SpringBootApplication(scanBasePackages = "cn.footman.autoconfigure.service")
public class CalculateServiceBootstrap {
    public static void main(String[] args) {


        ConfigurableApplicationContext context = new SpringApplicationBuilder(CalculateServiceBootstrap.class)
                .web(WebApplicationType.NONE)
                .profiles("Java8")
                .run();

        CalculateService calculateService = context.getBean(CalculateService.class);
        System.out.println(calculateService.sum(1,2,3,4,5,6,7,8,9));

        context.close();

    }
}
