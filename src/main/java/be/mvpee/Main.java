package be.mvpee;

import be.mvpee.Listener.NametagListener;
import be.mvpee.Manager.NametagManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private static NametagManager nametagManager;

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new NametagListener(), this);
        nametagManager = new NametagManager();
    }

    static public NametagManager getNametagManager() {
        return nametagManager;
    }

}
