package io.github.actuallylost.skillsmod

import org.quiltmc.loader.api.ModContainer
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

object SkillsMod : ModInitializer {
    val LOGGER: Logger = LoggerFactory.getLogger("SkillsMod")

    override fun onInitialize(mod: ModContainer) {
        LOGGER.info("{} Initialized", mod.metadata().name())
    }
}
