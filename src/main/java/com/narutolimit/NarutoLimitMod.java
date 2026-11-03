package com.narutolimit;

import net.minecraftforge.fml.common.Mod;

/**
 * Addon do narutoto. Toda a logica esta nos Mixins (pacote com.narutolimit.mixin)
 * e os valores de limite ficam em {@link Limits}.
 */
@Mod(NarutoLimitMod.MOD_ID)
public class NarutoLimitMod {
    public static final String MOD_ID = "narutolimit";

    public NarutoLimitMod() {
    }
}
