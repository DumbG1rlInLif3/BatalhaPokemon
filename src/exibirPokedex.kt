fun exibirPokedex() {
    //Mostra todos os Pokémons disponíveis para os jogadores escolherem ao montar seus times.

    println("\n📘 POKEDEX DISPONÍVEL:")
    //Exibe o título

    pokedex.forEachIndexed { index, p ->
        println("${index + 1}. ${p.nome} | Tipo: ${p.tipo} | Poder: ${p.poder}")
    }
    //Usa forEachIndexed para exibir os Pokémons numerados a partir de 1 (usuário-friendly).
}
