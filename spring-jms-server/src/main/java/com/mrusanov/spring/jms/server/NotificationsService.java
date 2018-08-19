package com.mrusanov.spring.jms.server;

import com.mrusanov.spring.jms.notifications.Notification;

public interface NotificationsService {
	void sendNotification(Notification notification);
}
