fun exibirTime(nickname: String) {
    //Essa função recebe o nickname de um jogador e mostra todos os
    //Pokémons do time dele no console.

    println("\n🔎 Time de $nickname:")
    //Imprime um cabeçalho dizendo de quem é o time. O \n quebra a linha para
    //deixar visualmente mais organizado.

    jogadores[nickname]?.forEach {
        println("- ${it.nome} | Tipo: ${it.tipo} | Poder: ${it.poder}")
    //Acessa o time do jogador no map jogadores usando jogadores[nickname].
    //Se o time existir (não for null), faz um forEach para imprimir cada Pokémon.
    }
}