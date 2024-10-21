package com.rolandfisch.sumberMinigame;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class SumberMinigame extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Sumber Enabled (from plugin)");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Sumber Enabled (from plugin)");
    }
}