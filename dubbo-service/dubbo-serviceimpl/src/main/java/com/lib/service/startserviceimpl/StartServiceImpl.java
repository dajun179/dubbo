package com.lib.service.startserviceimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @package com.lib.service.startserviceimpl.StartServiceImpl.java 启动
 * @author dj
 * @phone 18895737300
 * @date 2017年9月14日 下午3:01:48
 */
public class StartServiceImpl {

	@Autowired
	private static Logger log = LoggerFactory.getLogger(StartServiceImpl.class);

	public static void main(String[] args) {
		try {
			// spring-context.xml配置加入
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
					"classpath:spring/applicationContext-*.xml");
			/*
			 * <import resource="dubbo-provider.xml" />
			 */
			context.start();
		} catch (Exception e) {
			log.error("== DubboProvider context start error:", e);
		}
		synchronized (StartServiceImpl.class) {
			while (true) {
				try {
					StartServiceImpl.class.wait();
				} catch (InterruptedException e) {
					log.error("== synchronized error:", e);
				}
			}
		}
	}
}
