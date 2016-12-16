package com.traxonmc.crates.main;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public boolean toggle;
	
	@Override
	public void onEnable() {
		toggle = true;
		registerEvents();
		registerCommands();
	}
	
	@Override
	public void onDisable() {
		
	}
	
	void registerEvents() {
		
	}
	
	void registerCommands() {
		
	}

}
