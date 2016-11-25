package io.puharesource.mc.titlemanager

import org.bukkit.Bukkit
import org.bukkit.event.EventPriority
import org.bukkit.event.Listener
import org.bukkit.event.server.PluginDisableEvent
import rx.Scheduler
import rx.schedulers.Schedulers
import java.util.concurrent.Executor

private var instance : TitleManagerPlugin? = null
val pluginInstance : TitleManagerPlugin
    get() {
        if (instance == null) {
            instance = Bukkit.getPluginManager().getPlugin("TitleManager") as TitleManagerPlugin
        }

        return instance!!
    }

internal val asyncExecutor = Executor { Bukkit.getScheduler().runTaskAsynchronously(pluginInstance, it) }
internal val syncExecutor = Executor { Bukkit.getScheduler().runTask(pluginInstance, it) }
internal val asyncScheduler : Scheduler = Schedulers.from({ Bukkit.getScheduler().runTaskAsynchronously(pluginInstance, it) })
internal val syncScheduler : Scheduler = Schedulers.from({ Bukkit.getScheduler().runTask(pluginInstance, it) })

internal fun info(message: String) = pluginInstance.logger.info(message)

internal fun warning(message: String) = pluginInstance.logger.warning(message)

internal fun debug(message: String) {
    if (pluginInstance.config.getBoolean("debug")) {
        info("[DEBUG] $message")
    }
}

internal fun onPluginDisable(body: () -> Unit) {
    val pluginManager = Bukkit.getPluginManager()
    val listener = object : Listener {}

    pluginManager.registerEvent(PluginDisableEvent::class.java, listener, EventPriority.MONITOR, { listener, event ->
        val disableEvent = event as PluginDisableEvent

        if (disableEvent.plugin.equals(pluginInstance)) {
            body()
        }
    }, pluginInstance, false)
}