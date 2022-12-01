package rjmcplugin.rjmcplugin;

import org.bukkit.Color;
import org.bukkit.plugin.java.JavaPlugin;

public final class RjMcPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Events(), this);
        getServer().getConsoleSender().sendMessage(Color.BLUE + "Shimzyz's RJ plugin is enabled! :)");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(Color.BLUE + "Shimzyz's RJ plugin is disabled! :(");
    }
}
