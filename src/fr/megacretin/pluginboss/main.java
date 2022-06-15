package fr.megacretin.pluginboss;

import fr.megacretin.pluginboss.commands.CommandBoss;
import fr.megacretin.pluginboss.commands.CommandEvent;
import fr.megacretin.pluginboss.commands.CommandMenuBoss;
import io.netty.util.collection.ByteCollections;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.UUID;

public class main extends JavaPlugin {


    public static HashMap<UUID, Double> degat = new HashMap();

    public static boolean eventBoss = false;

    @Override
    public void onEnable() {

        getCommand("boss").setExecutor(new CommandMenuBoss());
        getCommand("event").setExecutor(new CommandEvent());
        getServer().getPluginManager().registerEvents(new ListenerEvent(), this);
    }

    public static ItemStack Armure(Material material, int level) {
        ItemStack i = new ItemStack(material);
        ItemMeta i2 = i.getItemMeta();
        i2.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, level, true);
        i.setItemMeta(i2);

        return i;
    }
}
