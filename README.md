# Exercício 6 da AC2
 Eleições

## Algoritmo do Exercício
    INÍCIO
        PARA i <- 0 até 50, FAÇA
            ESCREVA (Em quem irá votar?)
            LER (voto)
            ENQUANTO voto for
                CASO 1, SEJA
                    pt = pt + 1
                CASO 2, SEJA
                    pdt = pdt + 1
                CASO 3, SEJA
                    pl = pl + 1
                CASO 4, SEJA
                    psdb = psdb + 1
                CASO 5, SEJA
                    nulo = nulo + 1
                CASO 6, SEJA
                    branco = branco + 1
                EXCEÇÃO, SEJA
                    ESCREVA (Opção de voto invalído!)
                FIM CASO
            FIM ENQUANTO
        FIM PARA
        ESCREVA(Votos no PT)
        ESCREVA(Votos no PDT)
        ESCREVA(Votos no PL)
        ESCREVA(Votos no PSDB)
        ESCREVA(Votos NULO)
        ESCREVA(Votos em BRANCO)
    FIM

## Fluxograma

<img src="ex_006.java" alt="">