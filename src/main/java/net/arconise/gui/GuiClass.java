package net.arconise.gui;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GuiClass {

    public static void openGUiMenu(Player p){

        Inventory gui = Bukkit.createInventory(p, 9, "Test");

        ItemStack sword = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta swordMeta = sword.getItemMeta();
        swordMeta.setDisplayName(ChatColor.GREEN + "Diamond_Sword");
        ArrayList<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.GRAY + "Obtain a diamond sword!");
        lore.add("");
        swordMeta.setLore(lore);
        sword.setItemMeta(swordMeta);
        gui.setItem(4, sword);

        p.openInventory(gui);


    }


}
