package com.traxonmc.crates.util;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import com.traxonmc.crates.gui.CrateGUI;
import com.traxonmc.crates.gui.KeyGUI;
import com.traxonmc.crates.gui.OpenGUI;
import com.traxonmc.crates.main.Main;

import net.md_5.bungee.api.ChatColor;

public class PlayerInventoryClick implements Listener{
	
	private Main plugin;
	
	public PlayerInventoryClick(Main plugin) {
		this.plugin = plugin;
	}
	
	AllItems allItems = new AllItems();
	KeyGUI keyGUI = new KeyGUI();
	CrateGUI crateGUI = new CrateGUI();
	OpenGUI openGUI = new OpenGUI(plugin);
	
	@EventHandler
	public void onPlayerInventoryClick(InventoryClickEvent event) {
		Player player = (Player) event.getWhoClicked();
		if(event.getInventory().getName().equalsIgnoreCase(ChatColor.GREEN + "Crates GUI")) {
			ItemStack item = event.getCurrentItem();
			getClicked(player, item);
		}
	}
	
	void getClicked(Player player, ItemStack item) {
		if(allItems.getItem(item.getItemMeta().getDisplayName()) == item) {
			
		} else if(allItems.getItem(item.getItemMeta().getDisplayName()) == null) {
			
		} else {
			
		}
	}
	
	void openClicked(Player player, String clicked) {
		
	}
	
	String getPathTo(Player player, ItemStack item) {
		String KeyGUI = "Keys";
		String CrateGUI = "Crates";
		String ToggleOn = "Enabled";
		String ToggleOff = "Disabled";
		String NCItem = ChatColor.stripColor(item.getItemMeta().getDisplayName());
		if(NCItem.equalsIgnoreCase(KeyGUI)) {
			keyGUI.keyGui(player);
		} else if(NCItem.equalsIgnoreCase(CrateGUI)) {
			crateGUI.crateGui(player);
		} else if(NCItem.equalsIgnoreCase(ToggleOn)) {
			
		} else if(NCItem.equalsIgnoreCase(ToggleOff)) {
			
		}
		return "";
	}

}
