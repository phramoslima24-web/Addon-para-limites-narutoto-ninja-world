package com.narutolimit.mixin;

import com.narutolimit.Limits;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

/** Troca os limites fixos de ReturnSumProcedure. */
@Mixin(targets = "net.mcreator.narutoto.procedures.ReturnSumProcedure", remap = false)
public abstract class ReturnSumMixin {

    @ModifyConstant(
            method = "execute",
            constant = @Constant(doubleValue = 500.0),
            remap = false)
    private static double narutolimit$c0(double original) {
        return Limits.TOTAL;
    }
}
