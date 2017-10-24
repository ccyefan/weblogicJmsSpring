package org.tarena.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xp.MessageQueueSender;

public class TestSend {
	
	@Test
	public void TestS(){
		
		String conf = "applicationContext.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
		MessageQueueSender ms = ac.getBean("jmsSender", MessageQueueSender.class);
		ms.Simplesend();
		
	}
}
