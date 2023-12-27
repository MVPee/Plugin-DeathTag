package be.mvpee.Listener;

import be.mvpee.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class NametagListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Main.getNametagManager().setNameTag(e.getPlayer());
    }

    @EventHandler
    public void onDeath(PlayerDeathEvent e) {
        Main.getNametagManager().setNameTag(e.getEntity());
    }

}
