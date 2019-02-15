package cn.footman.springapplication;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author kokio
 * @create 2019-01-22 11:35
 */
public class SpringApplicationEventBootstrap {
    public static void main(String[] args) {
        //创建上下文
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        //注册应用时间监听
        context.addApplicationListener(event -> {
            System.out.println("监听到事件 ： " + event);
        });

        context.refresh();

        context.publishEvent("hello world!!");

        //关闭
        context.close();
    }
}
