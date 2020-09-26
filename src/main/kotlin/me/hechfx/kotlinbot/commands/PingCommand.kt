package me.hechfx.kotlinbot.commands

import me.hechfx.kotlinbot.AbstractCommand
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent

class PingCommand: AbstractCommand("!ping") {
     override fun run(event: GuildMessageReceivedEvent) {
        event.channel.sendMessage("📡 **|** ${event.jda.gatewayPing}ms").queue()
    }
}