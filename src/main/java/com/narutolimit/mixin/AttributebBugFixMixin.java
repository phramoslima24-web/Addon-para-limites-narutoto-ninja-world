package com.narutolimit.mixin;

import com.narutolimit.Limits;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

/** Troca os limites fixos de AttributebBugFixProcedure. */
@Mixin(targets = "net.mcreator.narutoto.procedures.AttributebBugFixProcedure", remap = false)
public abstract class AttributebBugFixMixin {

    @ModifyConstant(
            method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/Entity;)V",
            constant = @Constant(doubleValue = 500.0),
            remap = false)
    private static double narutolimit$c0(double original) {
        return Limits.TOTAL;
    }

    @ModifyConstant(
            method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/Entity;)V",
            constant = @Constant(doubleValue = 510.0),
            remap = false)
    private static double narutolimit$c1(double original) {
        return Limits.TOTAL + 10.0;
    }

    @ModifyConstant(
            method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/Entity;)V",
            constant = @Constant(doubleValue = 200.0),
            remap = false)
    private static double narutolimit$c2(double original) {
        return Limits.POR_ATRIBUTO;
    }

    @ModifyConstant(
            method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/Entity;)V",
            constant = @Constant(doubleValue = 210.0),
            remap = false)
    private static double narutolimit$c3(double original) {
        return Limits.POR_ATRIBUTO + 10.0;
    }

    @ModifyConstant(
            method = "execute(Lnet/minecraftforge/eventbus/api/Event;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/entity/Entity;)V",
            constant = @Constant(doubleValue = 50.0),
            remap = false)
    private static double narutolimit$c4(double original) {
        return Limits.INTELIGENCIA;
    }
}
