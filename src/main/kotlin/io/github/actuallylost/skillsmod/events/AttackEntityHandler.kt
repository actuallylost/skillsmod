package io.github.actuallylost.skillsmod.events

import net.fabricmc.fabric.api.event.player.AttackEntityCallback
import net.minecraft.entity.Entity
import net.minecraft.entity.passive.AnimalEntity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.text.Text
import net.minecraft.util.ActionResult
import net.minecraft.util.Hand
import net.minecraft.util.hit.EntityHitResult
import net.minecraft.world.World

class AttackEntityHandler : AttackEntityCallback {
    override fun interact(
        player: PlayerEntity?,
        world: World?,
        hand: Hand?,
        entity: Entity?,
        hitResult: EntityHitResult?
    ): ActionResult {
        if (player!!.isSpectator) {
            return ActionResult.FAIL
        }

        // TODO: Play around with ServerLivingEntityEvents and see if you can send a message when entity dies, with info about the entity.
        if (entity is AnimalEntity && !world!!.isClient()) {
            player.sendMessage(Text.literal(player.name.string + " attacked a " + entity.name.string + "!"), false)
        }

        return ActionResult.PASS
    }
}
