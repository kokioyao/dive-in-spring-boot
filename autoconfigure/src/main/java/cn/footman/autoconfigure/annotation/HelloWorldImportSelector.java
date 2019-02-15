package cn.footman.autoconfigure.annotation;

import cn.footman.autoconfigure.configuration.HelloWorldConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author kokio
 * @create 2019-01-14 22:05
 */
public class HelloWorldImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[] {HelloWorldConfiguration.class.getName()};
    }
}
