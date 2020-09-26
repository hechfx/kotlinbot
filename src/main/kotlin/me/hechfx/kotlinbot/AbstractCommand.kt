package me.hechfx.kotlinbot

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent

abstract class AbstractCommand (val name: String) {

    abstract fun run(event: GuildMessageReceivedEvent)

}