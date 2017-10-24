package com.xp;

import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.management.Query;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.JmsTemplate102;
import org.springframework.jms.core.MessageCreator;

public class MessageQueueSender {
	
	private JmsTemplate jmsTemplate;
	
	private Query query;

	
	public void Simplesend(){
		this.jmsTemplate.send(new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				
				return session.createTextMessage("hello");
			}
		});
		
	}
	
	public JmsTemplate getJmsTemplate() {
		return jmsTemplate;
	}

	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}



	public Query getQuery() {
		return query;
	}



	public void setQuery(Query query) {
		this.query = query;
	}



}
