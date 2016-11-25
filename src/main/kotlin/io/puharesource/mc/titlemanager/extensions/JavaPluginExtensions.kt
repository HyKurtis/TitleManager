package io.puharesource.mc.titlemanager.extensions

import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin

internal fun JavaPlugin.registerListener(listener: Listener) = server.pluginManager.registerEvents(listener, this)