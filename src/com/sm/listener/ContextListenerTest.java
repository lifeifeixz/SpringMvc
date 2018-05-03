package com.sm.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextListenerTest implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		System.out.println("**********destroy ContextListener*********");
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		System.out.println("初始化上下文容器");
		ServletContext servletContext = event.getServletContext();
		System.out.println("key:"+servletContext.getInitParameter("key"));
		System.out.println("contextConfigLocation:"+servletContext.getInitParameter("contextConfigLocation"));
	}

}
