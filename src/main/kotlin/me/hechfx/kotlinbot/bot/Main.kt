package me.hechfx.kotlinbot.bot

import me.hechfx.kotlinbot.listeners.MessageListener
import net.dv8tion.jda.api.JDA
import net.dv8tion.jda.api.JDABuilder

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val jda: JDA =
            JDABuilder.createDefault("put-your-token-here")
                .build()

        jda.addEventListener(MessageListener())
    }
}