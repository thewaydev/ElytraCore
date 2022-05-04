package net.elytrapvp.elytracore.misc.commands;

import net.elytrapvp.elytracore.utilities.chat.ChatUtils;
import net.elytrapvp.elytracore.utilities.commands.AbstractCommand;
import org.apache.commons.lang.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * This class runs the broadcast command, which allows the server to broadcast a message.
 */
public class BroadcastCMD extends AbstractCommand {

    /**
     * Creates the /broadcast command with the permission "elytracore.broadcast".
     */
    public BroadcastCMD() {
        super("broadcast", "elytracore.broadcast", true);
    }

    /**
     * This is the code that runs when the command is sent.
     * @param sender The player (or console) that sent the command.
     * @param args The arguments of the command.
     */
    public void execute(CommandSender sender, String[] args) {
        if(args.length == 0) {
            ChatUtils.chat(sender, "&c&lUsage &8» &c/bc [message]");
            return;
        }

        for(Player player : Bukkit.getOnlinePlayers()) {
            ChatUtils.chat(player, StringUtils.join(args, " "));
        }
    }
}