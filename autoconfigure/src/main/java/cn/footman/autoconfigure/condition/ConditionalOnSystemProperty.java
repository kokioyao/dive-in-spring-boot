package cn.footman.autoconfigure.condition;


import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * 系统属性条件判断
 * @author kokio
 * @create 2019-01-14 23:34
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD })
@Documented
@Conditional(OnSystemPropertyCondition.class)
public @interface ConditionalOnSystemProperty {

    /**
     * java系统属性名称
     * @return
     */
    String name();

    /**
     * java系统属性值
     * @return
     */
    String value();
}
