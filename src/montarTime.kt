fun montarTime(nickname: String) {
    //📌 Essa função é chamada para cada jogador montar o time de 3 Pokémons a partir de
    //uma lista chamada pokedex.

    println("\n$nickname, monte seu time escolhendo 3 Pokémon pelo número:")
    exibirPokedex()
    //✅ Mostra uma mensagem chamando o jogador e em seguida exibe a Pokédex para ele ver os Pokémons disponíveis.
    //✅ A função exibirPokedex() deve imprimir os Pokémons com número/índice — é essencial que isso esteja correto.

    val escolhidos = mutableSetOf<Int>()
    //✅ Cria um conjunto (set) para guardar os índices já escolhidos.
    //✅ mutableSetOf garante que não haja repetição de escolha.

    while (escolhidos.size < 3) {
        print("Escolha o Pokémon ${escolhidos.size + 1} (1 a ${pokedex.size}): ")
        val escolha = readln().toIntOrNull()
        //O loop continua até o jogador escolher 3 Pokémons.
        //A entrada do usuário é convertida com toIntOrNull(), evitando erro se
        //ele digitar algo que não seja número.

        if (escolha == null || escolha !in 1..pokedex.size || escolha in escolhidos) {
            println("❌ Escolha inválida ou repetida.")
            //Essa linha faz 3 verificações:
            // --> É um número válido (escolha != null)?
            // --> Está dentro do intervalo da Pokédex?
            // --> Já foi escolhido antes?
            //Se qualquer condição falhar, mostra mensagem de erro.

        } else {
            val pokemon = pokedex[escolha - 1]
            adicionarPokemon(nickname, pokemon.nome, pokemon.tipo, pokemon.poder)
            escolhidos.add(escolha)
            //O índice da Pokédex começa em 0, por isso o escolha - 1.
            //O Pokémon é buscado da lista pokedex e enviado para a função adicionarPokemon,
            //que insere ele no time do jogador no map jogadores.
            //Por fim, adiciona o número escolhido no set para evitar repetições.
        }
    }
}
