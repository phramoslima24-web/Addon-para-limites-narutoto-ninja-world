package com.narutolimit.mixin;

import com.narutolimit.Limits;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

/** Troca os limites fixos de AddDojutsu10Procedure. */
@Mixin(targets = "net.mcreator.narutoto.procedures.AddDojutsu10Procedure", remap = false)
public abstract class AddDojutsu10Mixin {

    @ModifyConstant(
            method = "execute",
            constant = @Constant(doubleValue = 490.0),
            remap = false)
    private static double narutolimit$c0(double original) {
        return Limits.TOTAL - 10.0;
    }

    @ModifyConstant(
            method = "execute",
            constant = @Constant(doubleValue = 500.0),
            remap = false)
    private static double narutolimit$c1(double original) {
        return Limits.TOTAL;
    }

    @ModifyConstant(
            method = "execute",
            constant = @Constant(doubleValue = 200.0),
            remap = false)
    private static double narutolimit$c2(double original) {
        return Limits.POR_ATRIBUTO;
    }
}
