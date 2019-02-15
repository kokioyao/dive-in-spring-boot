package cn.footman.autoconfigure.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

/**
 * @author kokio
 * @create 2019-01-14 23:15
 */
@Profile("Java8")
@Service
public class Java8CalculateService implements CalculateService {


    @Override
    public Integer sum(Integer... values) {
        System.out.println("这是JAVA8");
        Integer sum = Stream.of(values).reduce(0, Integer::sum);
        return sum;
    }
}
