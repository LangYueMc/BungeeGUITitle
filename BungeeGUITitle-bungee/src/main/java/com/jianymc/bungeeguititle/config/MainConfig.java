package com.jianymc.bungeeguititle.config;

import java.io.File;

import com.jianymc.bungeeguititle.configlibrary.Config;

public class MainConfig {
	
	public static String configpath = File.separator + "plugins" + File.separator + "BungeeGUITitle" + File.separator + "config.yml";
	public static Config config = new Config(configpath);
	
	/* MySQL Information */
	public static String Uri = config.getString("Database.Uri", "mysql://localhost:3306/minecraft?characterEncoding=utf-8");
	public static String username = config.getString("Database.Username", "username");
	public static String password = config.getString("Database.Password", "password");
	public static int threads = config.getInt("Database.Threads", 5);
	
	public static void reloadConfig() {
		// 数据库配置修改需重启
		config = null;
		config = new Config(configpath);
		// other config
	}
}
