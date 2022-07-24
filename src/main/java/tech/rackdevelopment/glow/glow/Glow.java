package tech.rackdevelopment.glow.glow;

import org.bukkit.plugin.java.JavaPlugin;
import tech.rackdevelopment.glow.glow.commands.GlowOffCommand;
import tech.rackdevelopment.glow.glow.commands.GlowOnCommand;

public final class Glow extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Glow Plugin Initialized");
        getLogger().info("Need Help? Contact Rack#0001 on the SpigotMC Discord");
        getCommand("glowon").setExecutor(new GlowOnCommand());
        getCommand("glowoff").setExecutor(new GlowOffCommand());
    }

    @Override
    public void onDisable() {
        getLogger().info("Glow Plugin Disabled");
    }
}
