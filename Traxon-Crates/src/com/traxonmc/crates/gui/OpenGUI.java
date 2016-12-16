package com.traxonmc.crates.gui;


import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.traxonmc.crates.main.Main;
import com.traxonmc.crates.util.AllItems;

import net.md_5.bungee.api.ChatColor;

public class OpenGUI {
	
	private Main plugin;	
	
	public OpenGUI(Main plugin) {
		this.plugin = plugin;	
	}	
	
	public void openGui(Player player) {
		Inventory inv = Bukkit.createInventory(player, 27, ChatColor.GREEN + "Crates GUI");	
		loadInventory(player, inv);
	}
	AllItems allItems = new AllItems();
	
	void loadInventory(Player player, Inventory inv) {
		ItemStack key = allItems.getItem("Keys");
		inv.setItem(11, key);
		
		ItemStack crate = allItems.getItem("Crates");
		inv.setItem(15, crate);
		
		if(plugin.toggle == true) {
			ItemStack toggle = allItems.getItem("Enabled");
			inv.setItem(13, toggle);
		} else {
			ItemStack toggle = allItems.getItem("Disabled");
			inv.setItem(13, toggle);
		}
		player.openInventory(inv);
	}
	
}
