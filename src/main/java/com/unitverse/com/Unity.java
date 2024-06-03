package com.unitverse.com;

import com.unitverse.com.commands.Feed;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class Unity extends JavaPlugin {
    private static Unity instance;

    @Override
    public void onEnable() {

        instance = this;
        getLogger().info("[UNITS] ON");
        new Feed();
    }

    @Override
    public void onDisable() {
        getLogger().warning("[UNITS] OFF");
    }

    public static Unity getInstance() {
        return instance;
    }
}
