package me.anxuiz.bukkitsettings;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public final class BukkitSettings extends JavaPlugin {
    protected final Multimap<SettingScope, Setting> settings = ArrayListMultimap.create();

    @Override
    public void onEnable() {
        // Copy the default configuration
        this.getConfig().options().copyDefaults(true);
        this.saveConfig();
    }

    @Override
    public void onDisable() {
    }

    private void registerEvents(Listener listener) {
        this.getServer().getPluginManager().registerEvents(listener, this);
    }
}
