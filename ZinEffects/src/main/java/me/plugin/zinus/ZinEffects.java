package me.plugin.zinus;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class ZinEffects extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("effect").setExecutor(new CommandEffect());
        getCommand("effect").setTabCompleter(new CommandEffect());
        Bukkit.getLogger().info(ChatColor.GREEN + "Плагин запущен!");
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info(ChatColor.RED +  "Плагин выключен!");
    }
}
