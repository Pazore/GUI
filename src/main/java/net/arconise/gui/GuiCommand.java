package net.arconise.gui;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import sun.management.Sensor;

public class GuiCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use this!");
            return true;
        }

        Player p = (Player) sender;

        if (!p.hasPermission("gui.open")) {
            p.sendMessage("No permission");
            return true;
        }

        GuiClass.openGUiMenu(p);


        return true;
    }
}
