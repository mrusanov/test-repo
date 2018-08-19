package com.mrusanov.spring.jms.client;

import com.mrusanov.spring.jms.notifications.Notification;

public class NotificationsReceiverImpl implements NotificationsReceiver {

	public void receiveNotification(Notification notification) {
		System.out.println("Received notification: " + notification);
	}
}
