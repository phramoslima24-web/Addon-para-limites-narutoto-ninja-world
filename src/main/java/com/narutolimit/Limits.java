package com.narutolimit;

/**
 * Limites do menu de atributos do narutoto.
 * Original do mod: TOTAL = 500, POR_ATRIBUTO = 200, INTELIGENCIA = 50.
 *
 * Para mudar, edite os numeros abaixo e faca push no git.
 * (Se mudar, ajuste tambem o texto em src/main/resources/assets/narutoto/lang/*.json)
 */
public final class Limits {
    /** Total de pontos de atributo (SP) que o jogador pode distribuir. */
    public static final double TOTAL = 10000.0;

    /** Maximo por atributo (ninjutsu, taijutsu, dojutsu, genjutsu, chakra, vida). */
    public static final double POR_ATRIBUTO = 10000.0;

    /** Maximo de inteligencia (no mod original e 50). */
    public static final double INTELIGENCIA = 50.0;

    private Limits() {
    }
}
