package cn.footman.autoconfigure.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * 使用for循环实现
 * @author kokio
 * @create 2019-01-14 23:12
 */
@Profile("Java7")
@Service
public class Java7CalculateService implements CalculateService {
    @Override
    public Integer sum(Integer... values) {
        Integer sum = 0;
        System.out.println("这是JAVA7");
        for(int i = 0; i < values.length; i++){

            sum += values[i];
        }
        return sum;

    }
}
