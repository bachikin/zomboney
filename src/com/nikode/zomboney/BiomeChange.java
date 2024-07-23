package com.nikode.zomboney;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.block.Biome;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import net.md_5.bungee.api.ChatColor;

public class BiomeChange {
	
	List<Player> onlinePlayers = new ArrayList<>(Bukkit.getOnlinePlayers());
	
	public void ZombieBiome() {
		
		for (int i = 0; i < onlinePlayers.size(); i++) {
			
			Player onlineZombie = onlinePlayers.get(i);
			boolean checkZombie;
				
			
			if (Swap.isZombie.containsKey(onlineZombie.getUniqueId())) {
				checkZombie = true;
			}
			
			else {
				checkZombie = false;
			}
			
			
			if (checkZombie == true) {
				
				Biome currentBiome = onlineZombie.getLocation().getBlock().getBiome();
				Server server = Bukkit.getServer();
				int ticks = (int) server.getWorld(server.getName()).getTime();
				
				int infinite = PotionEffect.INFINITE_DURATION;
				PotionEffectType effect = null;
				
				Collection<PotionEffectType> defaultEffects = new ArrayList<PotionEffectType>(Arrays.asList(effect.ABSORPTION, effect.DAMAGE_RESISTANCE, effect.HEALTH_BOOST, effect.INCREASE_DAMAGE, effect.NIGHT_VISION, effect.REGENERATION, effect.SATURATION));
				Collection<PotionEffect> defaultBiome = ArrayList<PotionEffect>();
				defaultBiome = new ArrayList<PotionEffect>(Arrays.asList(defaultEffects, infinite));
				
				PotionEffect potion = new PotionEffect(effect.ABSORPTION, infinite, 0);
				
				switch (currentBiome) {
				
				case DESERT:
					//ggerfsadf
					
				default:
					if (ticks >= 12040) {
						onlineZombie.addPotionEffects(defaultBiome);
					}
				}
				
			}
			
		}
		
	}
	
}
