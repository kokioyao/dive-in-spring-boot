package cn.footman.autoconfigure.repository;

import cn.footman.autoconfigure.annotation.SecondLevelRepository;

/**
 * @author kokio
 * @create 2019-01-14 20:04
 */
//@FirstLevelRepository(value = "myFirstLevelRepository")//bean的名称
//@Component(value = "myFirstLevelRepository")

@SecondLevelRepository(value = "myFirstLevelRepository")
public class MyFirstLevelRepository {
}
