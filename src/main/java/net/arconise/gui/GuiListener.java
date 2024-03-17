package net.arconise.gui;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class GuiListener implements Listener {

    @EventHandler
    public void onMenuClick(InventoryClickEvent e){
        Player p = (Player) e.getWhoClicked();

        if (e.getView().getTitle().equalsIgnoreCase("Test")) {

        }

        if (e.getCurrentItem().getType() == Material.DIAMOND_SWORD){
            p.getInventory().addItem(new ItemStack(Material.DIAMOND_SWORD, 74));
            p.closeInventory();
            e.setCancelled(true);
        }
    }

}
