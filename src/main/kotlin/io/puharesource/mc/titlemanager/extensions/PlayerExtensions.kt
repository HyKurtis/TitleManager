package io.puharesource.mc.titlemanager.extensions

import io.puharesource.mc.titlemanager.api.v2.animation.Animation
import io.puharesource.mc.titlemanager.api.v2.animation.AnimationPart
import io.puharesource.mc.titlemanager.pluginInstance
import org.bukkit.entity.Player

fun Player.sendTitle(title: String, fadeIn: Int = -1, stay: Int = -1, fadeOut: Int = -1, withPlaceholders: Boolean = false) {
    if (withPlaceholders) {
        pluginInstance.sendTitleWithPlaceholders(this, title, fadeIn, stay, fadeOut)
    } else {
        pluginInstance.sendTitle(this, title, fadeIn, stay, fadeOut)
    }
}

fun Player.sendTitle(parts: List<AnimationPart<*>>, withPlaceholders: Boolean = false) {
    pluginInstance.toTitleAnimation(parts, this, withPlaceholders = withPlaceholders).start()
}

fun Player.sendTitle(animation: Animation, withPlaceholders: Boolean = false) {
    pluginInstance.toTitleAnimation(animation, this, withPlaceholders = withPlaceholders).start()
}

fun Player.sendSubtitle(subtitle: String, fadeIn: Int = -1, stay: Int = -1, fadeOut: Int = -1, withPlaceholders: Boolean = false) {
    if (withPlaceholders) {
        pluginInstance.sendSubtitleWithPlaceholders(this, subtitle, fadeIn, stay, fadeOut)
    } else {
        pluginInstance.sendSubtitle(this, subtitle, fadeIn, stay, fadeOut)
    }
}

fun Player.sendSubtitle(parts: List<AnimationPart<*>>, withPlaceholders: Boolean = false) {
    pluginInstance.toSubtitleAnimation(parts, this, withPlaceholders = withPlaceholders).start()
}

fun Player.sendSubtitle(animation: Animation, withPlaceholders: Boolean = false) {
    pluginInstance.toSubtitleAnimation(animation, this, withPlaceholders = withPlaceholders).start()
}

fun Player.sendTitles(title: String, subtitle: String, fadeIn: Int = -1, stay: Int = -1, fadeOut: Int = -1, withPlaceholders: Boolean = false) {
    if (withPlaceholders) {
        pluginInstance.sendTitlesWithPlaceholders(this, title, subtitle, fadeIn, stay, fadeOut)
    } else {
        pluginInstance.sendTitles(this, title, subtitle, fadeIn, stay, fadeOut)
    }
}

fun Player.sendTitleTimings(fadeIn: Int = -1, stay: Int = -1, fadeOut: Int = -1) {
    pluginInstance.sendTimings(this, fadeIn, stay, fadeOut)
}

fun Player.sendActionbar(text: String, withPlaceholders: Boolean = false) {
    if (withPlaceholders) {
        pluginInstance.sendActionbarWithPlaceholders(this, text)
    } else {
        pluginInstance.sendActionbar(this, text)
    }
}

fun Player.sendActionbar(parts: List<AnimationPart<*>>, withPlaceholders: Boolean = false) {
    pluginInstance.toActionbarAnimation(parts, this, withPlaceholders = withPlaceholders).start()
}

fun Player.sendActionbar(animation: Animation, withPlaceholders: Boolean = false) {
    pluginInstance.toActionbarAnimation(animation, this, withPlaceholders = withPlaceholders).start()
}

fun Player.setPlayerListHeaderAndFooter(header: String, footer: String, withPlaceholders: Boolean = false) {
    if (withPlaceholders) {
        pluginInstance.setHeaderAndFooterWithPlaceholders(this, header, footer)
    } else {
        pluginInstance.setHeaderAndFooter(this, header, footer)
    }
}

fun Player.setPlayerListHeaderAndFooter(headerParts: List<AnimationPart<*>>, footerParts: List<AnimationPart<*>>, withPlaceholders: Boolean = false) {
    setPlayerListHeader(headerParts, withPlaceholders = withPlaceholders)
    setPlayerListFooter(footerParts, withPlaceholders = withPlaceholders)
}

fun Player.setPlayerListHeaderAndFooter(headerAnimation: Animation, footerAnimation: Animation, withPlaceholders: Boolean = false) {
    setPlayerListHeader(headerAnimation, withPlaceholders = withPlaceholders)
    setPlayerListFooter(footerAnimation, withPlaceholders = withPlaceholders)
}

fun Player.setPlayerListHeaderAndFooter(headerAnimation: Animation, footerParts: List<AnimationPart<*>>, withPlaceholders: Boolean = false) {
    setPlayerListHeader(headerAnimation, withPlaceholders = withPlaceholders)
    setPlayerListFooter(footerParts, withPlaceholders = withPlaceholders)
}

fun Player.setPlayerListHeaderAndFooter(headerAnimation: Animation, footer: String, withPlaceholders: Boolean = false) {
    setPlayerListHeader(headerAnimation, withPlaceholders = withPlaceholders)
    setPlayerListFooter(footer, withPlaceholders = withPlaceholders)
}

fun Player.setPlayerListHeaderAndFooter(headerParts: List<AnimationPart<*>>, footerAnimation: Animation, withPlaceholders: Boolean = false) {
    setPlayerListHeader(headerParts, withPlaceholders = withPlaceholders)
    setPlayerListFooter(footerAnimation, withPlaceholders = withPlaceholders)
}

fun Player.setPlayerListHeaderAndFooter(header: String, footerAnimation: Animation, withPlaceholders: Boolean = false) {
    setPlayerListHeader(header, withPlaceholders = withPlaceholders)
    setPlayerListFooter(footerAnimation, withPlaceholders = withPlaceholders)
}

fun Player.setPlayerListHeader(header: String, withPlaceholders: Boolean = false) {
    if (withPlaceholders) {
        pluginInstance.setHeaderWithPlaceholders(this, header)
    } else {
        pluginInstance.setHeader(this, header)
    }
}

fun Player.setPlayerListHeader(parts: List<AnimationPart<*>>, withPlaceholders: Boolean = false) {
    pluginInstance.toHeaderAnimation(parts, this, withPlaceholders = withPlaceholders).start()
}

fun Player.setPlayerListHeader(animation: Animation, withPlaceholders: Boolean = false) {
    pluginInstance.toHeaderAnimation(animation, this, withPlaceholders = withPlaceholders).start()
}

fun Player.getPlayerListHeader() = pluginInstance.getHeader(this)

fun Player.setPlayerListFooter(footer: String, withPlaceholders: Boolean = false) {
    if (withPlaceholders) {
        pluginInstance.setFooterWithPlaceholders(this, footer)
    } else {
        pluginInstance.setFooter(this, footer)
    }
}

fun Player.setPlayerListFooter(parts: List<AnimationPart<*>>, withPlaceholders: Boolean = false) {
    pluginInstance.toFooterAnimation(parts, this, withPlaceholders = withPlaceholders).start()
}

fun Player.setPlayerListFooter(animation: Animation, withPlaceholders: Boolean = false) {
    pluginInstance.toFooterAnimation(animation, this, withPlaceholders = withPlaceholders).start()
}

fun Player.getPlayerListFooter() = pluginInstance.getFooter(this)

fun Player.clearTitles(fadeIn: Int = -1, stay: Int = -1, fadeOut: Int = -1) = pluginInstance.clearTitles(this, fadeIn, stay, fadeOut)

fun Player.clearTitle(fadeIn: Int = -1, stay: Int = -1, fadeOut: Int = -1) = pluginInstance.clearTitle(this, fadeIn, stay, fadeOut)

fun Player.clearSubtitle(fadeIn: Int = -1, stay: Int = -1, fadeOut: Int = -1) = pluginInstance.clearSubtitle(this, fadeIn, stay, fadeOut)

fun Player.clearActionbar() = pluginInstance.clearActionbar(this)