package fr.megacretin.pluginboss.commands;

import fr.megacretin.pluginboss.main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandEvent implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(main.eventBoss){
            if(sender instanceof Player){
                if(args.length == 0){
                    sender.sendMessage("la commande est /event <TypeEvent>");
                }

                if(args.length >= 1){
                    if (args[0].equalsIgnoreCase("boss")) {
                        ((Player) sender).teleport(new Location(Bukkit.getWorld("spawnsk"), -125.5, 69, 115.5, 180,0));
                        sender.sendMessage("§bUn Boss vient d'apparaître. Alliez-vous pour le terrasser");
                    }

                }
            }
        }
        else{
            sender.sendMessage("§6§lHigh§b§lSky §8>> §cPas d'évent en cours");
        }


        return false;
    }
}
