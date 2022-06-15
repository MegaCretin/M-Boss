package fr.megacretin.pluginboss;






import org.apache.logging.log4j.core.net.Priority;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.text.DecimalFormat;


public class ListenerEvent implements Listener {

    private boolean pouvoir1 = true;
    private boolean pouvoir2 = true;
    private boolean pouvoir3 = true;
    private Player P1;
    private String  Num1 = "";
    private Double  Deg1 = 0.0;
    private Player P2;
    private String  Num2 = "";
    private Double  Deg2 = 0.0;
    private Player P3;
    private String  Num3 = "";
    private Double  Deg3 = 0.0;
    private Double damage = 0.0;


    @Deprecated
    @EventHandler
    public void pouvoirBoss(EntityDamageByEntityEvent event){



        if(event.getEntity() instanceof Zombie){
            if((event.getEntity().getName().contains("Zombie Boss"))){

                if(event.getDamager() instanceof Player){
                    Player p = (Player) event.getDamager();
                    damage = event.getDamage(EntityDamageEvent.DamageModifier.ARMOR);


                    if(!main.degat.containsKey(p.getUniqueId())){

                        main.degat.put(p.getUniqueId(), damage);
                    }
                    else{
                        Double damage1 = main.degat.get(p.getUniqueId());
                        damage = damage + damage1;
                        main.degat.replace(p.getUniqueId(), damage);
                    }

                }


                Zombie Zboss = (Zombie) event.getEntity();
                Location loc = Zboss.getLocation();

                if(Zboss.getCustomName().contains("Lv0")){
                    if(pouvoir1){
                        if(Zboss.getHealth() <= 1536){
                            for( int i=0; i<15; i++){
                                Zombie z = (Zombie) Zboss.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
                                z.setCustomName("Serviteur Novice");
                                z.setCustomNameVisible(true);
                                z.getEquipment().setHelmet(main.Armure(Material.LEATHER_HELMET, 0));
                            }
                            pouvoir1 = false;
                        }
                    }
                    if(pouvoir2){
                        if (Zboss.getHealth() <= 1028){
                            for( int i=0; i<15; i++){
                                ItemStack epee = new ItemStack(Material.WOOD_SWORD);
                                ItemMeta epeeM = epee.getItemMeta();
                                epeeM.addEnchant(Enchantment.DAMAGE_ALL, 3 , true);
                                epeeM.addEnchant(Enchantment.DURABILITY, 31 , true);
                                epee.setItemMeta(epeeM);

                                Zombie z = (Zombie) Zboss.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
                                z.setCustomName("Serviteur");
                                z.setCustomNameVisible(true);
                                z.getEquipment().setItemInMainHand(epee);
                                z.getEquipment().setHelmet(main.Armure(Material.CHAINMAIL_HELMET, 0));
                                z.getEquipment().setChestplate(main.Armure(Material.CHAINMAIL_CHESTPLATE, 0));
                                z.getEquipment().setLeggings(main.Armure(Material.CHAINMAIL_LEGGINGS, 0));
                                z.getEquipment().setBoots(main.Armure(Material.CHAINMAIL_BOOTS,0));
                                AttributeInstance healthAttribute = z.getAttribute(Attribute.GENERIC_MAX_HEALTH);
                                healthAttribute.setBaseValue(40);
                                z.setHealth(healthAttribute.getValue());
                            }
                            pouvoir2 = false;
                        }
                    }
                    if (pouvoir3){
                        if(Zboss.getHealth() <=512){
                            for( int i=0; i<10; i++){
                                ItemStack epee = new ItemStack(Material.STONE_SWORD);
                                ItemMeta epeeM = epee.getItemMeta();
                                epeeM.addEnchant(Enchantment.DAMAGE_ALL, 8 , true);
                                epeeM.addEnchant(Enchantment.KNOCKBACK, 1 , true);
                                epeeM.addEnchant(Enchantment.DURABILITY, 31 , true);
                                epee.setItemMeta(epeeM);

                                Zombie z = (Zombie) Zboss.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
                                z.setCustomName("Serviteur d'Elite");
                                z.setCustomNameVisible(true);
                                z.getEquipment().setItemInMainHand(epee);
                                z.getEquipment().setHelmet(main.Armure(Material.GOLD_HELMET, 3));
                                z.getEquipment().setChestplate(main.Armure(Material.GOLD_CHESTPLATE, 3));
                                z.getEquipment().setLeggings(main.Armure(Material.GOLD_LEGGINGS, 3));
                                z.getEquipment().setBoots(main.Armure(Material.GOLD_BOOTS,3));
                                AttributeInstance healthAttribute = z.getAttribute(Attribute.GENERIC_MAX_HEALTH);
                                healthAttribute.setBaseValue(80);
                                z.setHealth(healthAttribute.getValue());
                            }
                            pouvoir3 = false;
                        }
                    }
                }
                if(Zboss.getCustomName().contains("Lv1")){
                    if(pouvoir1){
                        if(Zboss.getHealth() <= 1536){
                            for( int i=0; i<30; i++){
                                Zombie z = (Zombie) Zboss.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
                                z.setCustomName("Serviteur Novice");
                                z.setCustomNameVisible(true);
                                z.getEquipment().setHelmet(main.Armure(Material.LEATHER_HELMET, 0));
                            }
                            pouvoir1 = false;
                        }
                    }
                    if(pouvoir2){
                        if (Zboss.getHealth() <= 1028){
                            for( int i=0; i<20; i++){
                                ItemStack epee = new ItemStack(Material.WOOD_SWORD);
                                ItemMeta epeeM = epee.getItemMeta();
                                epeeM.addEnchant(Enchantment.DAMAGE_ALL, 3 , true);
                                epeeM.addEnchant(Enchantment.DURABILITY, 31 , true);
                                epee.setItemMeta(epeeM);

                                Zombie z = (Zombie) Zboss.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
                                z.setCustomName("Serviteur");
                                z.setCustomNameVisible(true);
                                z.getEquipment().setItemInMainHand(epee);
                                z.getEquipment().setHelmet(main.Armure(Material.CHAINMAIL_HELMET, 0));
                                z.getEquipment().setChestplate(main.Armure(Material.CHAINMAIL_CHESTPLATE, 0));
                                z.getEquipment().setLeggings(main.Armure(Material.CHAINMAIL_LEGGINGS, 0));
                                z.getEquipment().setBoots(main.Armure(Material.CHAINMAIL_BOOTS,0));
                                AttributeInstance healthAttribute = z.getAttribute(Attribute.GENERIC_MAX_HEALTH);
                                healthAttribute.setBaseValue(40);
                                z.setHealth(healthAttribute.getValue());
                            }
                            pouvoir2 = false;
                        }
                    }
                    if (pouvoir3){
                        if(Zboss.getHealth() <=512){
                            for( int i=0; i<10; i++){
                                ItemStack epee = new ItemStack(Material.STONE_SWORD);
                                ItemMeta epeeM = epee.getItemMeta();
                                epeeM.addEnchant(Enchantment.DAMAGE_ALL, 8 , true);
                                epeeM.addEnchant(Enchantment.KNOCKBACK, 1 , true);
                                epeeM.addEnchant(Enchantment.DURABILITY, 31 , true);
                                epee.setItemMeta(epeeM);

                                Zombie z = (Zombie) Zboss.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
                                z.setCustomName("Serviteur d'Elite");
                                z.setCustomNameVisible(true);
                                z.getEquipment().setItemInMainHand(epee);
                                z.getEquipment().setHelmet(main.Armure(Material.GOLD_HELMET, 3));
                                z.getEquipment().setChestplate(main.Armure(Material.GOLD_CHESTPLATE, 3));
                                z.getEquipment().setLeggings(main.Armure(Material.GOLD_LEGGINGS, 3));
                                z.getEquipment().setBoots(main.Armure(Material.GOLD_BOOTS,3));
                                AttributeInstance healthAttribute = z.getAttribute(Attribute.GENERIC_MAX_HEALTH);
                                healthAttribute.setBaseValue(80);
                                z.setHealth(healthAttribute.getValue());
                            }
                            pouvoir3 = false;
                        }
                    }
                }
                if(Zboss.getCustomName().contains("Lv2")){
                    if(pouvoir1){
                        if(Zboss.getHealth() <= 1536){
                            for( int i=0; i<30; i++){
                                Zombie z = (Zombie) Zboss.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
                                z.setCustomName("Serviteur Novice");
                                z.setCustomNameVisible(true);
                                z.getEquipment().setHelmet(main.Armure(Material.LEATHER_HELMET, 0));
                            }
                            pouvoir1 = false;
                        }
                    }
                    if(pouvoir2){
                        if (Zboss.getHealth() <= 1028){
                            for( int i=0; i<20; i++){
                                ItemStack epee = new ItemStack(Material.WOOD_SWORD);
                                ItemMeta epeeM = epee.getItemMeta();
                                epeeM.addEnchant(Enchantment.DAMAGE_ALL, 5 , true);
                                epeeM.addEnchant(Enchantment.KNOCKBACK, 1 , true);
                                epeeM.addEnchant(Enchantment.DURABILITY, 31 , true);
                                epee.setItemMeta(epeeM);

                                Zombie z = (Zombie) Zboss.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
                                z.setCustomName("Serviteur");
                                z.setCustomNameVisible(true);
                                z.getEquipment().setItemInMainHand(epee);
                                z.getEquipment().setHelmet(main.Armure(Material.IRON_HELMET, 0));
                                z.getEquipment().setChestplate(main.Armure(Material.IRON_CHESTPLATE, 0));
                                z.getEquipment().setLeggings(main.Armure(Material.IRON_LEGGINGS, 0));
                                z.getEquipment().setBoots(main.Armure(Material.IRON_BOOTS,0));
                                AttributeInstance healthAttribute = z.getAttribute(Attribute.GENERIC_MAX_HEALTH);
                                healthAttribute.setBaseValue(50);
                                z.setHealth(healthAttribute.getValue());
                            }
                            pouvoir2 = false;
                        }
                    }
                    if (pouvoir3){
                        if(Zboss.getHealth() <=512){
                            for( int i=0; i<10; i++){
                                ItemStack epee = new ItemStack(Material.STONE_SWORD);
                                ItemMeta epeeM = epee.getItemMeta();
                                epeeM.addEnchant(Enchantment.DAMAGE_ALL, 10 , true);
                                epeeM.addEnchant(Enchantment.KNOCKBACK, 3 , true);
                                epeeM.addEnchant(Enchantment.DURABILITY, 31 , true);
                                epee.setItemMeta(epeeM);

                                Zombie z = (Zombie) Zboss.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
                                z.setCustomName("Serviteur d'Elite");
                                z.setCustomNameVisible(true);
                                z.getEquipment().setItemInMainHand(epee);
                                z.getEquipment().setHelmet(main.Armure(Material.DIAMOND_HELMET, 4));
                                z.getEquipment().setChestplate(main.Armure(Material.DIAMOND_CHESTPLATE, 4));
                                z.getEquipment().setLeggings(main.Armure(Material.DIAMOND_LEGGINGS, 4));
                                z.getEquipment().setBoots(main.Armure(Material.DIAMOND_BOOTS,4));
                                AttributeInstance healthAttribute = z.getAttribute(Attribute.GENERIC_MAX_HEALTH);
                                healthAttribute.setBaseValue(100);
                                z.setHealth(healthAttribute.getValue());
                            }
                            pouvoir3 = false;
                        }
                    }

                }
                if(Zboss.getCustomName().contains("Lv3")){
                    if(pouvoir1){
                        if(Zboss.getHealth() <= 1536){
                            for( int i=0; i<30; i++){
                                Zombie z = (Zombie) Zboss.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
                                z.setCustomName("Serviteur Novice");
                                z.setCustomNameVisible(true);
                                z.getEquipment().setHelmet(main.Armure(Material.LEATHER_HELMET, 0));
                            }
                            pouvoir1 = false;
                        }
                    }
                    if(pouvoir2){
                        if (Zboss.getHealth() <= 1028){
                            for( int i=0; i<20; i++){
                                ItemStack epee = new ItemStack(Material.WOOD_SWORD);
                                ItemMeta epeeM = epee.getItemMeta();
                                epeeM.addEnchant(Enchantment.DAMAGE_ALL, 5 , true);
                                epeeM.addEnchant(Enchantment.KNOCKBACK, 1 , true);
                                epeeM.addEnchant(Enchantment.DURABILITY, 31 , true);
                                epee.setItemMeta(epeeM);

                                Zombie z = (Zombie) Zboss.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
                                z.setCustomName("Serviteur");
                                z.setCustomNameVisible(true);
                                z.getEquipment().setItemInMainHand(epee);
                                z.getEquipment().setHelmet(main.Armure(Material.GOLD_HELMET, 0));
                                z.getEquipment().setChestplate(main.Armure(Material.GOLD_CHESTPLATE, 0));
                                z.getEquipment().setLeggings(main.Armure(Material.GOLD_LEGGINGS, 0));
                                z.getEquipment().setBoots(main.Armure(Material.GOLD_BOOTS,0));
                                AttributeInstance healthAttribute = z.getAttribute(Attribute.GENERIC_MAX_HEALTH);
                                healthAttribute.setBaseValue(70);
                                z.setHealth(healthAttribute.getValue());
                            }
                            pouvoir2 = false;
                        }
                    }
                    if (pouvoir3){
                        if(Zboss.getHealth() <=512){
                            for( int i=0; i<10; i++){
                                ItemStack epee = new ItemStack(Material.STONE_SWORD);
                                ItemMeta epeeM = epee.getItemMeta();
                                epeeM.addEnchant(Enchantment.DAMAGE_ALL, 10 , true);
                                epeeM.addEnchant(Enchantment.KNOCKBACK, 3 , true);
                                epeeM.addEnchant(Enchantment.FIRE_ASPECT, 1 , true);
                                epeeM.addEnchant(Enchantment.DURABILITY, 31 , true);
                                epee.setItemMeta(epeeM);

                                Zombie z = (Zombie) Zboss.getWorld().spawnEntity(loc, EntityType.ZOMBIE);
                                z.setCustomName("Serviteur d'Elite");
                                z.setCustomNameVisible(true);
                                z.getEquipment().setItemInMainHand(epee);
                                z.getEquipment().setHelmet(main.Armure(Material.DIAMOND_HELMET, 4));
                                z.getEquipment().setChestplate(main.Armure(Material.DIAMOND_CHESTPLATE, 4));
                                z.getEquipment().setLeggings(main.Armure(Material.DIAMOND_LEGGINGS, 4));
                                z.getEquipment().setBoots(main.Armure(Material.DIAMOND_BOOTS,4));
                                AttributeInstance healthAttribute = z.getAttribute(Attribute.GENERIC_MAX_HEALTH);
                                healthAttribute.setBaseValue(150);
                                z.setHealth(healthAttribute.getValue());
                            }
                            pouvoir3 = false;
                        }
                    }
                }
            }
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void deathBoss(EntityDeathEvent event){

        if((event.getEntity().getName().contains("Serviteur")) || (event.getEntity().getName().contains("Boss"))){
            event.getDrops().clear();
            event.setDroppedExp(0);
            if(event.getEntity().getName().contains("Boss")){
                pouvoir1 = true;
                pouvoir2 = true;
                pouvoir3 = true;

                VerifDegat();

                Bukkit.broadcastMessage("§6§lHigh§b§lSky §8>> §cTop 3 des dégats infligés au §6§lBoss ");
                if(main.degat.containsKey(P1.getUniqueId())){
                    DecimalFormat df = new DecimalFormat("##0.0");
                    Deg1 = Math.abs(Deg1);
                    String r = df.format(Deg1);
                    Bukkit.broadcastMessage("§6N°§b1: §e" + Num1 + " §favec §e" + r + " §fdégats infligés  (Récompense 2 Fragments)");
                }
                else {
                    Bukkit.broadcastMessage("§6N°§b1: §e" + Num1 + " §favec §e0 §fdégats infligés  (Récompense 2 Fragment)");
                }

                if (main.degat.containsKey(P2.getUniqueId())){
                    DecimalFormat df = new DecimalFormat("##0.0");
                    Deg2 = Math.abs(Deg2);
                    String r = df.format(Deg2);
                    Bukkit.broadcastMessage("§6N°§b2: §e" + Num2 + " §favec §e" + r + " §fdégats infligés  (Récompense 1 clé rare)");
                }
                else{
                    Bukkit.broadcastMessage("§6N°§b2: §e" + Num2 + " §favec §e0 §fdégats infligés  (Récompense 1 clé rare)");
                }

                if(main.degat.containsKey(P3.getUniqueId())){
                    DecimalFormat df = new DecimalFormat("##0.0");
                    Deg3 = Math.abs(Deg3);
                    String r = df.format(Deg3);
                    Bukkit.broadcastMessage("§6N°§b3: §e" + Num3 + " §favec §e" + r + " §fdégats infligés  (Récompense 1 clé atypique)");
                }
                else {
                    Bukkit.broadcastMessage("§6N°§b3: §e" + Num3 + " §favec §e0 §fdégats infligés  (Récompense 1 clé atypique)");
                }

                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "fragments give "+ Num1 +" 2");
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "box manage rare giveKey "+ Num2 +" 1");
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "box manage atypique giveKey "+ Num3 +" 1");


                for (Player p: Bukkit.getOnlinePlayers()){
                    if(main.degat.containsKey(p.getUniqueId())) {
                        Double i = main.degat.get(p.getUniqueId());
                        DecimalFormat df = new DecimalFormat("##0.0");
                        i = Math.abs(i);
                        String r = df.format(i);
                        p.sendMessage("§6§lHigh§b§lSky §8>> §fVous avez infligé §e" + r + " §fdégats au §6Boss");
                        main.degat.remove(p.getUniqueId());
                    }
                }
                Num1 = "";
                Deg1 =0.0;
                Num2 = "";
                Deg2 = 0.0;
                Num3 = "";
                Deg3 = 0.0;

                main.eventBoss = false;
            }
        }
    }

    public void VerifDegat(){

        for (Player p : Bukkit.getOnlinePlayers()){

            if(main.degat.containsKey(p.getUniqueId())) {

                if (Num1.equals("") || Deg1 > main.degat.get(p.getUniqueId())) {
                    P2 = P1;
                    Num2 = Num1;
                    Deg2 = Deg1;

                    P1 = p;
                    Num1 = p.getName();
                    Deg1 = main.degat.get(p.getUniqueId());

                } else if (Num2.equals("") || Deg2 > main.degat.get(p.getUniqueId())) {

                    P3 = P2;
                    Num3 = Num2;
                    Deg3 = Deg2;

                    P2 = p;
                    Num2 = p.getName();
                    Deg2 = main.degat.get(p.getUniqueId());
                } else if (Num3.equals("") || Deg3 > main.degat.get(p.getUniqueId())) {
                    P3 = p;
                    Num3 = p.getName();
                    Deg3 = main.degat.get(p.getUniqueId());
                }
            }
        }



    }


}
