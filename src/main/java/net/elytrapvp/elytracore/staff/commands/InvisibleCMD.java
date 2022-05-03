package net.elytrapvp.elytracore.staff.commands;

import net.elytrapvp.elytracore.utilities.commands.AbstractCommand;
import org.bukkit.command.CommandSender;

public class InvisibleCMD extends AbstractCommand {

    public InvisibleCMD() {
        super("invisible", "elytracore.invisible", false);
    }

    /**
     * This is the code that runs when the command is sent.
     * @param sender The player (or console) that sent the command.
     * @param args The arguments of the command.
     */
    @Override
    public void execute(CommandSender sender, String[] args) {

    }
}
