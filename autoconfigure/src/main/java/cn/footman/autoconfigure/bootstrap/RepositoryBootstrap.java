package cn.footman.autoconfigure.bootstrap;

import cn.footman.autoconfigure.repository.MyFirstLevelRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author kokio
 * @create 2019-01-14 20:06
 */
@ComponentScan(basePackages = "cn.footman.autoconfigure.repository")
public class RepositoryBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(RepositoryBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        //bean是否存在
        MyFirstLevelRepository myFirstLevelRepository
                = context.getBean("myFirstLevelRepository", MyFirstLevelRepository.class);

        System.out.println("myFirstLevelRepository:" + myFirstLevelRepository);


        context.close();//关闭上下文
    }
}
