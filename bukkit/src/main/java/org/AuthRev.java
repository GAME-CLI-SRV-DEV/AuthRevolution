package org.duckdns.anarchyconnect.viaproxy;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import java.net.http.HttpClient;
import com.example.minecraftauth.MinecraftAuth;
import com.example.minecraftauth.StepFullJavaSession;
import com.example.minecraftauth.StepMsaDeviceCode;

public class AuthRev extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        Component message1 = Component.text("Authentication", NamedTextColor.WHITE)
                                     .append(Component.text("Revolution", NamedTextColor.RED));
      getLogger().info(message1 + "Plugin Enabled!");

    }

    @Override
    public void onDisable() {
        getLogger().info("OfflineLoginPlugin has been disabled");
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
                Component message1 = Component.text("Authentication", NamedTextColor.WHITE)
                                     .append(Component.text("Revolution", NamedTextColor.RED));
                HttpClient httpClient = MinecraftAuth.createHttpClient();
        StepFullJavaSession.FullJavaSession javaSession = MinecraftAuth.JAVA_DEVICE_CODE_LOGIN.getFromInput(
            httpClient,
        event.getPlayer().sendMessage(message1 + "go to " + msaDeviceCode.getVerificationUri());
        event.getPlayer().sendMessage(message1 + "and enter the following code" + msaDeviceCode.getUserCode() + and disconnect.);
        
    }
}
