package com.jianymc.bungeeguititle.manager;

import java.util.logging.Logger;

import net.md_5.bungee.api.ProxyServer;

public class LoggingManager {
	static ProxyServer proxy = ProxyServer.getInstance();
	static Logger log = proxy.getLogger();
	
	public static void log(String message) {
		log.info(message);
	}
}
