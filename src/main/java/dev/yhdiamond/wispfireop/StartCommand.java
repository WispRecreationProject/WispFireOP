package dev.yhdiamond.wispfireop;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class StartCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player p = (Player) sender;
            if (sender.hasPermission("wispfireop.toggle")){
                if (args.length == 1){
                    if (args[0].equals("start")){
                        if (!WispFireOP.isStarted) {
                            WispFireOP.isStarted = true;
                            Bukkit.broadcastMessage(ChatColor.GREEN + "Wisp Fire Drops OP Items challenge has started!");
                        } else {
                            sender.sendMessage(ChatColor.RED + "The challenge is already started!");
                        }
                    } else if (args[0].equals("stop")){
                        if (WispFireOP.isStarted) {
                            WispFireOP.isStarted = false;
                            Bukkit.broadcastMessage(ChatColor.RED + "Wisp Fire Drops OP Items challenge has ended!");

                        } else {
                            sender.sendMessage(ChatColor.RED + "The Wisp Fire Drops OP Items challenge hasn't started!");
                        }
                    } else {
                        p.sendMessage(ChatColor.RED+"/wispfireop <start/stop>");
                    }
                } else {
                    p.sendMessage(ChatColor.RED+"/wispfireop <start/stop>");
                }
            } else {
                p.sendMessage(ChatColor.RED+"You do not have the required permission to run this command!");
            }
        } else {
            sender.sendMessage(ChatColor.RED+"This command is for players only!");
        }

        return true;
    }
}