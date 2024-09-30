package org.duckdns.anarchyconnect.viaproxy;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class AuthRev extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        Component message1 = Component.text("Authentication", NamedTextColor.WHITE)
                                     .append(Component.text("Revolution", NamedTextColor.RED));
      getLogger().info(message);

    }

    @Override
    public void onDisable() {
        getLogger().info("OfflineLoginPlugin has been disabled");
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.getPlayer().sendMessage("");
    }
}
