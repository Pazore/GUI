package net.arconise.gui;

import org.bukkit.plugin.java.JavaPlugin;

public final class GUI extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("A");

        getCommand("opengui").setExecutor(new GuiCommand());

        getServer().getPluginManager().registerEvents(new GuiListener(), this);

    }
}
