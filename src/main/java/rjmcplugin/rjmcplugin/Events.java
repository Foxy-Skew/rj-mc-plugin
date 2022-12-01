package rjmcplugin.rjmcplugin;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class Events implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        if (player.getName().equals("masterofbirb"))
        {
            Bukkit.broadcastMessage(Color.PURPLE + "$The owner has joined the server :)");
        } else {
            Bukkit.broadcastMessage(player.displayName() + ": " + "has joined the server");
        }
    }

    @EventHandler
    public void onLeave(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        Bukkit.broadcastMessage(player.displayName() + " " + "has left the server :( goodbye");
    }
}
