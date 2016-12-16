package com.traxonmc.crates.gui;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import com.traxonmc.crates.util.AllItems;

public class CrateGUI {
	
	public CrateGUI() {
		
	}
	
	AllItems allItems = new AllItems();
	
	public void crateGui(Player player) {
		//loadInventory(player, inv);
	}
	
	void loadInventory(Player player, Inventory inv) {
		
		player.openInventory(inv);
	}

}
