package me.hechfx.kotlinbot.commands

import me.hechfx.kotlinbot.AbstractCommand
import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent

class AvatarCommand: AbstractCommand("!avatar") {
    override fun run(event: GuildMessageReceivedEvent) {
        val embed = EmbedBuilder()
            .setTitle("Seu avatar")
            .setImage(event.author.effectiveAvatarUrl)
            .setColor(-15141413)
        event.channel.sendMessage(embed.build()).queue()
    }
}