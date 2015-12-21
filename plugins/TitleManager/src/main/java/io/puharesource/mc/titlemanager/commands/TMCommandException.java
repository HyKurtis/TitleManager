package io.puharesource.mc.titlemanager.commands;

import io.puharesource.mc.titlemanager.backend.language.Messages;
import org.bukkit.ChatColor;

public final class TMCommandException extends Exception {
    public TMCommandException(final Messages message, final Object... args) {
        super(ChatColor.RED + String.format(message.getMessage().replace("%s", ChatColor.RESET + "%s" + ChatColor.RED), args));
    }
}
