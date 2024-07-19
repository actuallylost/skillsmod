package io.github.actuallylost.skillsmod

import io.github.actuallylost.skillsmod.events.AttackEntityHandler
import net.fabricmc.fabric.api.event.player.AttackEntityCallback
import org.quiltmc.loader.api.ModContainer
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class SkillsMod : ModInitializer {
    val LOGGER: Logger = LoggerFactory.getLogger("SkillsMod")

    override fun onInitialize(mod: ModContainer) {
        LOGGER.info("{} Initialized", mod.metadata().name())

        AttackEntityCallback.EVENT.register(AttackEntityHandler())
    }
}
