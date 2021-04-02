package dev.yhdiamond.wispfireop;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class FireListener implements Listener {
    public static List<ItemStack> opItems = new ArrayList<>();
    static {
        opItems.add(new ItemStack(Material.GOLD_BLOCK));
        ItemStack healingPotion = new ItemStack(Material.POTION);
        PotionMeta healingMeta = (PotionMeta) healingPotion.getItemMeta();
        healingMeta.addCustomEffect(new PotionEffect(PotionEffectType.HEAL, 1, 9), true);
        healingMeta.setDisplayName("Potion of Instant Health");
        healingPotion.setItemMeta(healingMeta);
        opItems.add(healingPotion);
        ItemStack strengthPotion = new ItemStack(Material.POTION);
        PotionMeta strengthMeta = (PotionMeta) strengthPotion.getItemMeta();
        strengthMeta.addCustomEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 3600, 0), true);
        strengthMeta.setDisplayName("Potion of Strength");
        strengthMeta.setColor(Color.PURPLE);
        strengthPotion.setItemMeta(strengthMeta);
        opItems.add(strengthPotion);
        opItems.add(new ItemStack(Material.EXPERIENCE_BOTTLE, 32));
        opItems.add(new ItemStack(Material.EMERALD_BLOCK));
        ItemStack speedPotion = new ItemStack(Material.POTION);
        PotionMeta speedMeta = (PotionMeta) speedPotion.getItemMeta();
        speedMeta.addCustomEffect(new PotionEffect(PotionEffectType.SPEED, 3600, 0), true);
        speedMeta.setDisplayName("Potion of Swiftness");
        speedMeta.setColor(Color.SILVER);
        speedPotion.setItemMeta(speedMeta);
        opItems.add(speedPotion);
        ItemStack flameXBook = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta flameXMeta = (EnchantmentStorageMeta) flameXBook.getItemMeta();
        flameXMeta.addStoredEnchant(Enchantment.ARROW_FIRE, 10, true);
        flameXBook.setItemMeta(flameXMeta);
        opItems.add(flameXBook);
        ItemStack punchXBook = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta punchXMeta = (EnchantmentStorageMeta) punchXBook.getItemMeta();
        punchXMeta.addStoredEnchant(Enchantment.ARROW_KNOCKBACK, 10, true);
        punchXBook.setItemMeta(punchXMeta);
        opItems.add(punchXBook);
        opItems.add(new ItemStack(Material.IRON_INGOT));
        opItems.add(new ItemStack(Material.IRON_BLOCK));
        ItemStack powerXBook = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta powerXMeta = (EnchantmentStorageMeta) powerXBook.getItemMeta();
        powerXMeta.addStoredEnchant(Enchantment.ARROW_DAMAGE, 10, true);
        powerXBook.setItemMeta(powerXMeta);
        opItems.add(powerXBook);
        opItems.add(new ItemStack(Material.DIAMOND_BLOCK));
        ItemStack hastePotion = new ItemStack(Material.POTION);
        PotionMeta hasteMeta = (PotionMeta) hastePotion.getItemMeta();
        hasteMeta.addCustomEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 3600, 2), true);
        hasteMeta.setDisplayName("Potion of Haste");
        hasteMeta.setColor(Color.YELLOW);
        hastePotion.setItemMeta(hasteMeta);
        opItems.add(hastePotion);
        opItems.add(new ItemStack(Material.OBSIDIAN, 16));
        ItemStack infinityXBook = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta infinityXMeta = (EnchantmentStorageMeta) infinityXBook.getItemMeta();
        infinityXMeta.addStoredEnchant(Enchantment.ARROW_INFINITE, 10, true);
        infinityXBook.setItemMeta(infinityXMeta);
        opItems.add(infinityXBook);
        opItems.add(new ItemStack(Material.GOLDEN_APPLE));
        ItemStack healing2Potion = new ItemStack(Material.POTION);
        PotionMeta healing2Meta = (PotionMeta) healing2Potion.getItemMeta();
        healing2Meta.addCustomEffect(new PotionEffect(PotionEffectType.HEAL, 1, 1), true);
        healing2Meta.setDisplayName("Potion of Instant Health");
        healing2Potion.setItemMeta(healing2Meta);
        opItems.add(healing2Potion);
        opItems.add(new ItemStack(Material.ENCHANTED_GOLDEN_APPLE));
        ItemStack speed9Potion = new ItemStack(Material.POTION);
        PotionMeta speed9Meta = (PotionMeta) speed9Potion.getItemMeta();
        speed9Meta.addCustomEffect(new PotionEffect(PotionEffectType.SPEED, 600, 9), true);
        speed9Meta.setDisplayName("Potion of Swiftness");
        speed9Meta.setColor(Color.SILVER);
        speed9Potion.setItemMeta(speed9Meta);
        opItems.add(speed9Potion);
        ItemStack sharpXBook = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta sharpXMeta = (EnchantmentStorageMeta) sharpXBook.getItemMeta();
        sharpXMeta.addStoredEnchant(Enchantment.DAMAGE_ALL, 10, true);
        sharpXBook.setItemMeta(sharpXMeta);
        opItems.add(sharpXBook);
        ItemStack efficiencyXBook = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta efficiencyXMeta = (EnchantmentStorageMeta) efficiencyXBook.getItemMeta();
        efficiencyXMeta.addStoredEnchant(Enchantment.DIG_SPEED, 10, true);
        efficiencyXBook.setItemMeta(efficiencyXMeta);
        opItems.add(efficiencyXBook);
        ItemStack knockbackXBook = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta knockbackXMeta = (EnchantmentStorageMeta) knockbackXBook.getItemMeta();
        knockbackXMeta.addStoredEnchant(Enchantment.KNOCKBACK, 10, true);
        knockbackXBook.setItemMeta(knockbackXMeta);
        opItems.add(knockbackXBook);
        ItemStack protXBook = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta protXMeta = (EnchantmentStorageMeta) protXBook.getItemMeta();
        protXMeta.addStoredEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
        protXBook.setItemMeta(protXMeta);
        opItems.add(protXBook);
        opItems.add(new ItemStack(Material.ENCHANTING_TABLE));
        opItems.add(new ItemStack(Material.EMERALD));
        ItemStack jump3Potion = new ItemStack(Material.POTION);
        PotionMeta jump3Meta = (PotionMeta) jump3Potion.getItemMeta();
        jump3Meta.addCustomEffect(new PotionEffect(PotionEffectType.JUMP, 3600, 2), true);
        jump3Meta.setDisplayName("Potion of Leaping");
        jump3Meta.setColor(Color.LIME);
        jump3Potion.setItemMeta(jump3Meta);
        opItems.add(jump3Potion);
        opItems.add(new ItemStack(Material.NETHERITE_INGOT));
        ItemStack fortuneXBook = new ItemStack(Material.ENCHANTED_BOOK);
        EnchantmentStorageMeta fortuneXMeta = (EnchantmentStorageMeta) fortuneXBook.getItemMeta();
        fortuneXMeta.addStoredEnchant(Enchantment.LOOT_BONUS_BLOCKS, 10, true);
        fortuneXBook.setItemMeta(fortuneXMeta);
        opItems.add(fortuneXBook);
        opItems.add(new ItemStack(Material.GOLD_INGOT));
        ItemStack invisPotion = new ItemStack(Material.POTION);
        PotionMeta invisMeta = (PotionMeta) invisPotion.getItemMeta();
        invisMeta.addCustomEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 3600, 0), true);
        invisMeta.setDisplayName("Potion of Invisibility");
        invisMeta.setColor(Color.GRAY);
        invisPotion.setItemMeta(invisMeta);
        opItems.add(invisPotion);
        opItems.add(new ItemStack(Material.OBSIDIAN, 64));
    }
    @EventHandler
    public void onFire(EntityDamageEvent e) {
        if (WispFireOP.isStarted && e.getEntity() instanceof Player && (e.getCause().equals(EntityDamageEvent.DamageCause.FIRE_TICK)) || e.getCause().equals(EntityDamageEvent.DamageCause.FIRE)) {
            Random random = new Random();
            if (random.nextInt(7) == 1) {
                for (Map.Entry<Integer, ItemStack> entry : ((Player) e.getEntity()).getInventory().addItem(opItems.get(random.nextInt(opItems.size()))).entrySet()) {
                    e.getEntity().getWorld().dropItemNaturally(e.getEntity().getLocation(), entry.getValue());
                }
            }
        }
    }
}
