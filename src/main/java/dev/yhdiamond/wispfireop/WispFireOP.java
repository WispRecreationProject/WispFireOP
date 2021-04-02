package dev.yhdiamond.wispfireop;

import dev.yhdiamond.wispfireop.bstats.Metrics;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class WispFireOP extends JavaPlugin {
    public static boolean isStarted = false;
    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new FireListener(), this);
        Bukkit.getPluginManager().registerEvents(new AnvilListener(), this);
        new Metrics(this, 10895);
        getCommand("wispfireop").setExecutor(new StartCommand());
        getCommand("wispfireop").setTabCompleter(new CommandComplete());
    }

}
