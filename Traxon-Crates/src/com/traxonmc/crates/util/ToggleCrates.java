package com.traxonmc.crates.util;

import com.traxonmc.crates.main.Main;

public class ToggleCrates {
	
	private Main plugin;
	
	public ToggleCrates(Main plugin) { this.plugin = plugin; }
	
	public void toggle() { plugin.toggle = !plugin.toggle; }

}
