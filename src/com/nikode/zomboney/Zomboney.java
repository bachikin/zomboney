package com.nikode.zomboney;

import org.bukkit.plugin.java.JavaPlugin;

public class Zomboney extends JavaPlugin {
	
	@Override
	public void onEnable() {
		this.getCommand("zombify").setExecutor(new Swap());
	}
	
	public void onDisable() {
		
	}

}
