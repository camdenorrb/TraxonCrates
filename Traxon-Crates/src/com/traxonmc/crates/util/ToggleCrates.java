package com.traxonmc.crates.util;

import com.traxonmc.crates.main.Main;

public class ToggleCrates {
	
	private Main plugin;
	
	public ToggleCrates(Main plugin) {
		this.plugin = plugin;
	}
	
	public void toggle() {
		if(plugin.toggle == true) {
			plugin.toggle = false;
		} else {
			plugin.toggle = true;
		}
	}

}
