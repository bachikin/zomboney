package com.nikode.zomboney;

import org.bukkit.command.CommandExecutor;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class Swap implements CommandExecutor {
	
	public static HashMap<UUID, Boolean> isZombie = new HashMap<>();
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if (!(sender instanceof Player)) return false;
		
		Player player = (Player) sender;
		Player target = player;
		
		if (!(command.getName().equalsIgnoreCase("zomboney"))) {
			return false;
		}
		
		if (command.getName().equalsIgnoreCase("zomboney")) {
			
			if (args == null || args.length == 0) {
				player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cPlease specify a command."));
				return true;
			}
			
			else if (args.length >= 1) {
				
				if (args.length == 2) {
					target = Bukkit.getPlayer(args[1].toString());
				}
				
				String pluginCommand = args[0].toLowerCase();
				args[0].equalsIgnoreCase(pluginCommand);
				
				switch (pluginCommand) {
				
				case "zombify":
					
					if (isZombie.get(target.getUniqueId()) == false) {
						isZombie.put(target.getUniqueId(), true);
						player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b" + player.getName() + " has been zombified!"));
					}
					
					else if (isZombie.get(target.getUniqueId()) == true) {
						isZombie.put(target.getUniqueId(), false);
						player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b" + player.getName() + " has been cured!"));
					}
					
					else {
						Messages.ThrowError(player);
					}
				
				default:
					player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cInvalid Command."));
			        return true;
				
				}
				
			}
			
			return true;
		}
		
		else {
			return false;
		}
	}
}