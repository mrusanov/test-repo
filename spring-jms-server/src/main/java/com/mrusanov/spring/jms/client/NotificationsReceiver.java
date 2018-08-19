package com.mrusanov.spring.jms.client;

import com.mrusanov.spring.jms.notifications.Notification;

public interface NotificationsReceiver {
	void receiveNotification(Notification notification);
}
