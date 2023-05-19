package com.itheima.springboot_log;

import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootLogApplicationTests {

	public static final Logger LOGGER =LoggerFactory.getLogger(SpringbootLogApplicationTests.class);

	@Test
	void contextLoads() {
		// 日志输出
		LOGGER.error("error");
		LOGGER.warn("wring");
		LOGGER.info("info"); // 默认级别
		LOGGER.debug("debug");
		LOGGER.trace("trace");

		org.apache.logging.log4j.Logger logger = LogManager.getLogger(SpringbootLogApplicationTests.class);
		logger.info("log4j2 info");

	}

}
