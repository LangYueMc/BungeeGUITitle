package com.jianymc.bungeeguititle;

import com.jianymc.bungeeguititle.manager.LoggingManager;
import com.jianymc.bungeeguititle.manager.SQLManager;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;

public class BGIBungeePlugin extends Plugin {
	public static BGIBungeePlugin instance;
	public static ProxyServer proxy;

	public void onEnable() {
		instance = this;
		LoggingManager.log(ChatColor.GREEN + "Starting BungeeGUITitle");
		proxy = ProxyServer.getInstance();
		LoggingManager.log(ChatColor.GREEN + "Initialising Managers");
		initialiseManagers();
		registerListeners();
		registerCommands();
		reloadServersPlugins();
	}

	private void registerCommands() {
		// proxy.getPluginManager().registerCommand( this, new WhoIsCommand() );
	}

	private void initialiseManagers() {
	}

	void registerListeners() {
		// this.getProxy().registerChannel("in");
		// this.getProxy().registerChannel("out");
		// proxy.getPluginManager().registerListener(this, new PlayerListener());
	}

	private void reloadServersPlugins() {
	}

	public void onDisable() {
		SQLManager.closeConnections();
	}
}
