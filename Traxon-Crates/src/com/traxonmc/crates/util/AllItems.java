package com.traxonmc.crates.util;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class AllItems {
	
	public AllItems() {
		
	}
	
	public ItemStack getItem(String itemName) {
		ArrayList<ItemStack> items = new ArrayList<ItemStack>();
		/** Name: KeyGUI 
		 * Gui: OpenGUI 
		 * Used: To open KeysGUI
		 *   **/
		ItemStack keyGUI = new ItemStack(Material.TRIPWIRE_HOOK);
		ItemMeta keyGUIMeta = keyGUI.getItemMeta();
		keyGUIMeta.setDisplayName(ChatColor.GOLD + "Keys");
		ArrayList<String> keyGUILore = new ArrayList<String>();
		keyGUILore.add(ChatColor.GREEN + "Click to view the key GUI.");
		keyGUIMeta.setLore(keyGUILore);
		keyGUI.setItemMeta(keyGUIMeta);
		items.add(keyGUI);
		
		/** Name: CrateGUI
		 * Gui: OpenGUI 
		 * Used: To open CrateGUI
		 *   **/
		ItemStack crateGUI = new ItemStack(Material.CHEST);
		ItemMeta crateGUIMeta = crateGUI.getItemMeta();
		crateGUIMeta.setDisplayName(ChatColor.GOLD + "Crates");
		ArrayList<String> crateGUILore = new ArrayList<String>();
		crateGUILore.add(ChatColor.GREEN + "Click to view the crate GUI.");
		crateGUIMeta.setLore(crateGUILore);
		crateGUI.setItemMeta(crateGUIMeta);
		items.add(crateGUI);
		
		/** Name: ToggleOn(Enabled)
		 * Gui: OpenGUI 
		 * Used: To disable crate usage
		 *   **/
		ItemStack toggleon = new ItemStack(Material.EMERALD_BLOCK);
		ItemMeta toggleonMeta = toggleon.getItemMeta();
		toggleonMeta.setDisplayName(ChatColor.GOLD + "Enabled");
		ArrayList<String> toggleonLore = new ArrayList<String>();
		toggleonLore.add(ChatColor.GREEN + "Click to toggle crates off.");
		toggleonMeta.setLore(toggleonLore);
		toggleon.setItemMeta(toggleonMeta);
		items.add(toggleon);
		
		/** Name: ToggleOff(Disabled)
		 * Gui: OpenGUI 
		 * Used: To enable crate usage
		 *   **/
		ItemStack toggleoff = new ItemStack(Material.REDSTONE_BLOCK);
		ItemMeta toggleoffMeta = toggleoff.getItemMeta();
		toggleoffMeta.setDisplayName(ChatColor.GOLD + "Disabled");
		ArrayList<String> toggleoffLore = new ArrayList<String>();
		toggleoffLore.add(ChatColor.GREEN + "Click to toggle crates on.");
		toggleoffMeta.setLore(toggleoffLore);
		toggleoff.setItemMeta(toggleoffMeta);
		items.add(toggleoff);
		
		for(ItemStack item : items) {
			String itemStackName = ChatColor.stripColor((item.getItemMeta().getDisplayName()));
			String itemNameNC = ChatColor.stripColor(itemName);
			if(itemNameNC.equalsIgnoreCase(itemStackName)) {
				return item;
			} else {
				continue;
			}
		}
		return null;
	}

}
