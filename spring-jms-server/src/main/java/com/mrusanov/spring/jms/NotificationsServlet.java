package com.mrusanov.spring.jms;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;

import com.mrusanov.spring.jms.notifications.Notification;
import com.mrusanov.spring.jms.server.NotificationsService;

public class NotificationsServlet extends HttpServlet {

	private static final long serialVersionUID = 1304309282709065524L;

	@Autowired
	private NotificationsService notificationsService;

	protected AutowireCapableBeanFactory ctx;

	@Override
	public void init() throws ServletException {
		super.init();
		ctx = ((ApplicationContext) getServletContext().getAttribute("applicationContext")).getAutowireCapableBeanFactory();
		ctx.autowireBean(this);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Pushing notification...");
		notificationsService.sendNotification(Notification.DATA_CHANGE);
	}
}
