package com.unitverse.com.commands;

import com.unitverse.com.CommandHandler;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Feed {
    public Feed() {
        new CommandHandler("Feed",true) {

            @Override
            public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
                return false;
            }

            @Override
            public boolean onCommand(CommandSender sender, String [] arguments) {
                Player player = (Player) sender;
                player.setFoodLevel(20);
                return true;
            }

            @Override
            public @NotNull String getUsage() {
                return "/feed";
            }
        }.enabledDelay(4);
    }
}
