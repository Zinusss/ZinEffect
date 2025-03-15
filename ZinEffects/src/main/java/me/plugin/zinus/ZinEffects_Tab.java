package me.plugin.zinus;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.List;

public class ZinEffects_Tab implements TabCompleter {
    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (strings.length == 2 ){
            return List.of(
                    "good",
                    "bad",
                    "normal"
            );
        }
        if (strings.length == 1){
            return List.of(
                    "Нік гравця"
            );
        }

        return Collections.emptyList();
    }
}
