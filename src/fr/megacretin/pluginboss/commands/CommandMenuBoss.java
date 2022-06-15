package fr.megacretin.pluginboss.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

public class CommandMenuBoss implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(sender.hasPermission("boss.admin")){

            Inventory invBoss =  Bukkit.createInventory((InventoryHolder)null, 27, "§6§l» §0§lBoss §6§l«");




        }



        return false;
    }
}
