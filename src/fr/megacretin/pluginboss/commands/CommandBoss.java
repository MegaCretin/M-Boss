package fr.megacretin.pluginboss.commands;


import fr.megacretin.pluginboss.main;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import net.minecraft.server.v1_12_R1.WorldServer;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_12_R1.CraftWorld;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Zombie;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class CommandBoss implements CommandExecutor {



    @Deprecated
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        main.eventBoss = true;
        Player player = (Player)sender;
        WorldServer world = ((CraftWorld)player.getWorld()).getHandle();
        World worldloc = player.getWorld();
        Location loc = new Location(Bukkit.getWorld("SpawnSK"), -106.5D, 67D, 108.5D, 90F, 0F);

        if(args.length == 0){
            player.sendMessage("§7La Commande est: /boss <NomBoss>");
            return true;
        }

        if(args.length <= 1){

            TextComponent message = new TextComponent("§6§lHigh§b§lSky §8>> §fUn bruit soudain retentit sur l'île perdue \n");
            TextComponent message2 = new TextComponent("§aAller voir ");
            message.setHoverEvent((HoverEvent)null);
            message.setClickEvent((ClickEvent)null);
            message2.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, (new ComponentBuilder( "Êtes-vous curieux ?")).create()));
            message2.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/event boss"));

            message.addExtra(message2);

            for(Player p: Bukkit.getOnlinePlayers()){
                p.spigot().sendMessage(message);
            }

            int i = 0;
            for(Player p : Bukkit.getOnlinePlayers()){
                i++;
            }

            if(args[0].equalsIgnoreCase("Zombie")){

                if(i <201){
                    ItemStack epee = new ItemStack(Material.DIAMOND_SWORD);
                    ItemMeta epeeM = epee.getItemMeta();
                    epeeM.addEnchant(Enchantment.DAMAGE_ALL, 15 , true);
                    epeeM.addEnchant(Enchantment.KNOCKBACK, 1 , true);
                    epeeM.addEnchant(Enchantment.DURABILITY, 31 , true);
                    epee.setItemMeta(epeeM);

                    Zombie z = (Zombie) player.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
                    z.setCustomName("Zombie Boss Lv0");
                    z.setCustomNameVisible(true);
                    z.getEquipment().setItemInMainHand(epee);
                    z.getEquipment().setHelmet(main.Armure(Material.DIAMOND_HELMET,8));
                    z.getEquipment().setChestplate(main.Armure(Material.DIAMOND_CHESTPLATE,8));
                    z.getEquipment().setLeggings(main.Armure(Material.DIAMOND_LEGGINGS,8));
                    z.getEquipment().setBoots(main.Armure(Material.DIAMOND_BOOTS,8));
                    AttributeInstance healthAttribute = z.getAttribute(Attribute.GENERIC_MAX_HEALTH);
                    healthAttribute.setBaseValue(11000);
                    z.setHealth(healthAttribute.getValue());
                }
                else if(i <201){
                    ItemStack epee = new ItemStack(Material.DIAMOND_SWORD);
                    ItemMeta epeeM = epee.getItemMeta();
                    epeeM.addEnchant(Enchantment.DAMAGE_ALL, 25 , true);
                    epeeM.addEnchant(Enchantment.KNOCKBACK, 1 , true);
                    epeeM.addEnchant(Enchantment.DURABILITY, 31 , true);
                    epee.setItemMeta(epeeM);

                    Zombie z = (Zombie) player.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
                    z.setCustomName("Zombie Boss Lv1");
                    z.setCustomNameVisible(true);
                    z.getEquipment().setItemInMainHand(epee);
                    z.getEquipment().setHelmet(main.Armure(Material.DIAMOND_HELMET,15));
                    z.getEquipment().setChestplate(main.Armure(Material.DIAMOND_CHESTPLATE,15));
                    z.getEquipment().setLeggings(main.Armure(Material.DIAMOND_LEGGINGS,15));
                    z.getEquipment().setBoots(main.Armure(Material.DIAMOND_BOOTS,15));
                    AttributeInstance healthAttribute = z.getAttribute(Attribute.GENERIC_MAX_HEALTH);
                    healthAttribute.setBaseValue(11000);
                    z.setHealth(healthAttribute.getValue());
                }
                else if(i <300){
                    ItemStack epee = new ItemStack(Material.DIAMOND_SWORD);
                    ItemMeta epeeM = epee.getItemMeta();
                    epeeM.addEnchant(Enchantment.DAMAGE_ALL, 70 , true);
                    epeeM.addEnchant(Enchantment.KNOCKBACK, 4 , true);
                    epeeM.addEnchant(Enchantment.FIRE_ASPECT, 2, true);
                    epeeM.addEnchant(Enchantment.DURABILITY, 31 , true);
                    epee.setItemMeta(epeeM);

                    Zombie z = (Zombie) player.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
                    z.setCustomName("Zombie Boss Lv2");
                    z.setCustomNameVisible(true);
                    z.getEquipment().setItemInMainHand(epee);
                    z.getEquipment().setHelmet(main.Armure(Material.DIAMOND_HELMET,18));
                    z.getEquipment().setChestplate(main.Armure(Material.DIAMOND_CHESTPLATE,18));
                    z.getEquipment().setLeggings(main.Armure(Material.DIAMOND_LEGGINGS,18));
                    z.getEquipment().setBoots(main.Armure(Material.DIAMOND_BOOTS,18));
                    AttributeInstance healthAttribute = z.getAttribute(Attribute.GENERIC_MAX_HEALTH);
                    healthAttribute.setBaseValue(16000);
                    z.setHealth(healthAttribute.getValue());

                }
                else{
                    ItemStack epee = new ItemStack(Material.DIAMOND_SWORD);
                    ItemMeta epeeM = epee.getItemMeta();
                    epeeM.addEnchant(Enchantment.DAMAGE_ALL, 90 , true);
                    epeeM.addEnchant(Enchantment.KNOCKBACK, 8 , true);
                    epeeM.addEnchant(Enchantment.FIRE_ASPECT, 4, true);
                    epeeM.addEnchant(Enchantment.DURABILITY, 31 , true);
                    epee.setItemMeta(epeeM);

                    Zombie z = (Zombie) player.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
                    z.setCustomName("Zombie Boss Lv2");
                    z.setCustomNameVisible(true);
                    z.getEquipment().setItemInMainHand(epee);
                    z.getEquipment().setHelmet(main.Armure(Material.DIAMOND_HELMET, 20));
                    z.getEquipment().setChestplate(main.Armure(Material.DIAMOND_CHESTPLATE,20));
                    z.getEquipment().setLeggings(main.Armure(Material.DIAMOND_LEGGINGS,20));
                    z.getEquipment().setBoots(main.Armure(Material.DIAMOND_BOOTS,20));
                    AttributeInstance healthAttribute = z.getAttribute(Attribute.GENERIC_MAX_HEALTH);
                    healthAttribute.setBaseValue(22000);
                    z.setHealth(healthAttribute.getValue());
                }
            }
            if(args[0].equalsIgnoreCase("Squelette")){

                if(i <31){
                    ItemStack arc = new ItemStack(Material.BOW);
                    ItemMeta arcM = arc.getItemMeta();
                    arcM.addEnchant(Enchantment.ARROW_DAMAGE, 40 , true);
                    arcM.addEnchant(Enchantment.DURABILITY, 31 , true);
                    arc.setItemMeta(arcM);

                    Skeleton s = (Skeleton) player.getWorld().spawnEntity(loc, EntityType.SKELETON);
                    s.setCustomName("Squelette Boss Lv1");
                    s.setCustomNameVisible(true);
                    s.getEquipment().setItemInMainHand(arc);
                    s.getEquipment().setHelmet(main.Armure(Material.DIAMOND_HELMET,15));
                    s.getEquipment().setChestplate(main.Armure(Material.DIAMOND_CHESTPLATE,15));
                    s.getEquipment().setLeggings(main.Armure(Material.DIAMOND_LEGGINGS,15));
                    s.getEquipment().setBoots(main.Armure(Material.DIAMOND_BOOTS,15));
                    AttributeInstance healthAttribute = s.getAttribute(Attribute.GENERIC_MAX_HEALTH);
                    healthAttribute.setBaseValue(9000);
                    s.setHealth(healthAttribute.getValue());
                }
                else if(i <51){
                    ItemStack arc = new ItemStack(Material.BOW);
                    ItemMeta arcM = arc.getItemMeta();
                    arcM.addEnchant(Enchantment.ARROW_DAMAGE, 60 , true);
                    arcM.addEnchant(Enchantment.ARROW_FIRE, 5 , true);
                    arcM.addEnchant(Enchantment.DURABILITY, 31 , true);
                    arc.setItemMeta(arcM);

                    Skeleton s = (Skeleton) player.getWorld().spawnEntity(loc, EntityType.SKELETON);
                    s.setCustomName("Squelette Boss Lv2");
                    s.setCustomNameVisible(true);
                    s.getEquipment().setItemInMainHand(arc);
                    s.getEquipment().setHelmet(main.Armure(Material.DIAMOND_HELMET,18));
                    s.getEquipment().setChestplate(main.Armure(Material.DIAMOND_CHESTPLATE,18));
                    s.getEquipment().setLeggings(main.Armure(Material.DIAMOND_LEGGINGS,18));
                    s.getEquipment().setBoots(main.Armure(Material.DIAMOND_BOOTS,18));
                    AttributeInstance healthAttribute = s.getAttribute(Attribute.GENERIC_MAX_HEALTH);
                    healthAttribute.setBaseValue(12000);
                    s.setHealth(healthAttribute.getValue());
                }
                else{
                    ItemStack arc = new ItemStack(Material.BOW);
                    ItemMeta arcM = arc.getItemMeta();
                    arcM.addEnchant(Enchantment.ARROW_DAMAGE, 80 , true);
                    arcM.addEnchant(Enchantment.ARROW_FIRE, 10 , true);
                    arcM.addEnchant(Enchantment.DURABILITY, 31 , true);
                    arc.setItemMeta(arcM);

                    Skeleton s = (Skeleton) player.getWorld().spawnEntity(loc, EntityType.SKELETON);
                    s.setCustomName("Squelette Boss Lv3");
                    s.setCustomNameVisible(true);
                    s.getEquipment().setItemInMainHand(arc);
                    s.getEquipment().setHelmet(main.Armure(Material.DIAMOND_HELMET, 20));
                    s.getEquipment().setChestplate(main.Armure(Material.DIAMOND_CHESTPLATE,20));
                    s.getEquipment().setLeggings(main.Armure(Material.DIAMOND_LEGGINGS,20));
                    s.getEquipment().setBoots(main.Armure(Material.DIAMOND_BOOTS,20));
                    AttributeInstance healthAttribute = s.getAttribute(Attribute.GENERIC_MAX_HEALTH);
                    healthAttribute.setBaseValue(16000);
                    s.setHealth(healthAttribute.getValue());
                }


                return true;
            }
        }
        return false;
    }

   
}

