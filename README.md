# Narutoto - Limite de Atributos

Addon para o mod **narutoto 0.4.1** (Forge 1.20.1) que aumenta o limite do menu de atributos:

| | Original | Addon |
|---|---|---|
| Total de pontos (SP) | 500 | **10000** |
| Máximo por atributo (ninjutsu, taijutsu, dojutsu, genjutsu, chakra, vida) | 200 | **10000** |
| Inteligência | 50 | 50 (sem mudança) |

Também corrige o "Total de SP restantes" mostrado no menu e o sistema de "bug fix"
do mod, que resetava seus pontos se passassem de 500/200.

## Como usar
1. Suba esta pasta para um repositório no GitHub (`git add . && git commit -m "addon" && git push`).
2. A aba **Actions** compila sozinha (workflow `Build`). Baixe o `.jar` em *Artifacts*.
3. Coloque o `.jar` na pasta `mods` junto com o `narutoto-0_4_1-forge.jar`
   (no servidor também, se jogar em servidor).

## Mudar os valores
Edite `src/main/java/com/narutolimit/Limits.java` e faça push de novo.
Se mudar, ajuste também o texto do tooltip em `src/main/resources/assets/narutoto/lang/*.json`.

## Observações
- Este addon NÃO muda quantos pontos você ganha (continua +5 SP por nível, ou pelo comando do mod).
- Funciona via Mixin: troca as constantes 500/490/510/200/210/50 dentro dos procedimentos `Add*Procedure`,
  `AttributebBugFixProcedure` e `ReturnSumProcedure` do narutoto, sem alterar o jar original.
