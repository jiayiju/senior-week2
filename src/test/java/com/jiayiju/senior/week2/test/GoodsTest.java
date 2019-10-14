package com.jiayiju.senior.week2.test;

import java.io.File;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jiayiju.utils.StreamUtil;

/**
 * 
 * @ClassName: GoodsTest
 * @Description: 测试类
 * @author:jyj
 * @date: 2019年10月14日 上午8:58:50
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class GoodsTest {
	// 依赖注入
	@Autowired
	RedisTemplate redisTemplate;

	/**
	 * 
	 * @Title: reader
	 * @Description: 解析数据文件的方法
	 * @return: void
	 */
	@Test
	public void reader() {
		// 创建一个file对象 找到要解析的文件
		File file = new File("src/test/resources/test.txt");
		// 使用小一工具包中的StreamUtil解析该文件
		String readTextFile = StreamUtil.readTextFile(file);
		// 根据==分割数据
		String[] split = readTextFile.split("==");
		for (String string : split) {
			System.out.println(string);
		}
		
	}
}
