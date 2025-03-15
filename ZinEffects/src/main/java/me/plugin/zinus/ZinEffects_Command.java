package me.plugin.zinus;

import com.destroystokyo.paper.Title;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.jetbrains.annotations.NotNull;

import static org.bukkit.Bukkit.getPlayer;

public class ZinEffects_Command implements CommandExecutor {
    @Override

    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (strings.length < 2) return false;
        Player player =  getPlayer(strings[0]);
        Player sender = (Player) commandSender;


        String effect = strings[1];
        if (effect.equalsIgnoreCase("bad")){
            player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 120, 999));
            player.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 120, 999));
            player.addPotionEffect(new PotionEffect(PotionEffectType.BAD_OMEN, 120, 999));
            player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 120, 999));
            sender.sendTitle(ChatColor.GREEN + " ☑ Успішно","",10,40,10);
            commandSender.sendMessage(ChatColor.GREEN + "☑ Успішне використання команди");

            return true;

        } else if (effect.equalsIgnoreCase("good")) {
            player.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 120, 999));
            player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 120, 999));
            player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 120, 999));
            player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 120, 999));
            sender.sendTitle(ChatColor.GREEN + " ☑ Успішно","",10,40,10);
            commandSender.sendMessage(ChatColor.GREEN + "☑ Успішне використання команди");
            return true;

        } else if (effect.equalsIgnoreCase("normal")) {
            player.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 120, 999));
            player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 120, 999));
            player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 120, 999));
            sender.sendTitle(ChatColor.GREEN + " ☑ Успішно","",10,40,10);
            commandSender.sendMessage(ChatColor.GREEN + "☑ Успішне використання команди");
            return true;

        }
        return false;
    }
}
