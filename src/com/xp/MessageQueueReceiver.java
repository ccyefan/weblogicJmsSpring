package com.xp;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class MessageQueueReceiver implements MessageListener{

	public void onMessage(Message message) {
		if(message instanceof TextMessage){
			System.out.println("----"+message);
		}
	}
}
