package com.mrusanov.spring.jms.server;

import org.springframework.jms.core.JmsOperations;

import com.mrusanov.spring.jms.notifications.Notification;

public class NotificationsServiceImpl implements NotificationsService {

	private JmsOperations jmsOperations;

	public NotificationsServiceImpl(JmsOperations jmsOperations) {
		this.jmsOperations = jmsOperations;
	}

	public void sendNotification(Notification notification) {
		jmsOperations.convertAndSend(notification);
	}
}
