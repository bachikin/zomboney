package com.nikode.zomboney;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;

public class Messages {

	public static void ThrowError (Player player) {
		player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cThere was an error performing this command."));
	}
	
}
