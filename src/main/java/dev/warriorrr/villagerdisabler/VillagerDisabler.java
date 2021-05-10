package dev.warriorrr.villagerdisabler;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class VillagerDisabler extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new VillagerListener(), this);
    }
}
