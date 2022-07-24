package tech.rackdevelopment.glow.glow.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class GlowOffCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "I'm sorry, this command can only be executed by Players.");
            return true;
        }
        Player player = (Player) sender;
        if (player.hasPermission("glow.use")) {
            player.removePotionEffect(PotionEffectType.GLOWING);
            player.sendMessage(ChatColor.RED + "You are no longer glowing!");
            return true;
        }
        player.sendMessage(ChatColor.RED + "You do not have permission to execute this command.");
        return true;
    }
}
