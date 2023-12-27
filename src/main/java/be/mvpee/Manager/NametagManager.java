package be.mvpee.Manager;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Statistic;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Team;

public class NametagManager {

    public void setNameTag(Player player) {
        player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
        Team team = player.getScoreboard().registerNewTeam("Death");
        team.setSuffix(" " + ChatColor.YELLOW + player.getStatistic(Statistic.DEATHS));

        for( Player target : Bukkit.getOnlinePlayers()) {
            player.getScoreboard().getTeam("Death").addEntry(target.getName());
        }
    }


}
