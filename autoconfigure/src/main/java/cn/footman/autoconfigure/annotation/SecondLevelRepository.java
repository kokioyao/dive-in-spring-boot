package cn.footman.autoconfigure.annotation;

import java.lang.annotation.*;

/**
 * @author kokio
 * @create 2019-01-14 20:17
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@FirstLevelRepository
public @interface SecondLevelRepository {

    String value() default "";
}
