package me.hechfx.kotlinbot.listeners

import me.hechfx.kotlinbot.commands.AvatarCommand
import me.hechfx.kotlinbot.commands.PingCommand
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter

open class MessageListener: ListenerAdapter() {

    private val commands = listOf(
        PingCommand(),
        AvatarCommand()
    )

    override fun onGuildMessageReceived(event: GuildMessageReceivedEvent) {
       val splitArgs = arrayOf(event.message.contentRaw)

        val commandName = splitArgs[0]

        for (command in commands) {
            if (command.name == commandName) {
                command.run(event)
            }
        }
    }
}
