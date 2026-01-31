//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.konpekiestudios.konpekistudios.hytale.plugins.commands;

import org.konpekiestudios.konpekistudios.hytale.plugins.KonpekiEconomy;
import org.konpekiestudios.konpekistudios.hytale.plugins.config.ConfigManager;
import com.hypixel.hytale.protocol.GameMode;
import com.hypixel.hytale.server.core.Message;
import com.hypixel.hytale.server.core.command.system.CommandContext;
import com.hypixel.hytale.server.core.command.system.basecommands.CommandBase;
import com.hypixel.hytale.server.core.entity.entities.Player;

import javax.annotation.Nonnull;

public class WalletCommand extends CommandBase {
    private final ConfigManager configManager;

    public WalletCommand(@Nonnull String name, @Nonnull String description) {
        super(name, description);
        this.addAliases(new String[]{"carteira"});
        this.setPermissionGroup(GameMode.Adventure);
        this.configManager = KonpekiEconomy.getInstance().getConfigManager();
    }

    protected void executeSync(@Nonnull CommandContext commandContext) {
        if (commandContext.sender() instanceof Player) {
            Player player = (Player) commandContext.sender();
            try {
                // Open wallet GUI
                openWalletGUI(player, commandContext);
            } catch (Exception e) {
                commandContext.sender().sendMessage(Message.raw(this.configManager.getData().messages.error_occurred));
                throw new RuntimeException(e);
            }
        } else {
            commandContext.sender().sendMessage(Message.raw("This command can only be executed by a player."));
        }
    }

    private void openWalletGUI(Player player, CommandContext commandContext) {
        // TODO: Implement GUI - Hytale API may not have inventory GUIs like Minecraft
        // For now, send balance message
        double balance = KonpekiEconomy.getInstance().getEconomy().getBalance(commandContext.sender().getUuid());
        player.sendMessage(Message.raw("Carteira: Saldo " + balance + " " + this.configManager.getData().chat.currency));
    }
}
