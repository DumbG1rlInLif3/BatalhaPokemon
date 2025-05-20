fun criarJogador(nickname: String) {
    jogadores[nickname] = mutableListOf()
    //Cria um novo jogador com o nickname recebido.
    //Adiciona no map jogadores uma entrada onde:
    //A chave é o nickname (String);
    //O valor é uma lista mutável vazia que vai guardar os Pokémons do jogador.
}

fun adicionarPokemon(nickname: String, nome: String, tipo: String, poder: Int) {
    val pokemon = Pokemon(nome, tipo, poder)
    jogadores[nickname]?.add(pokemon)
    //Função para adicionar um Pokémon ao time do jogador
    //Cria um novo objeto Pokémon com as características recebidas.
    //Acessa o time do jogador através de jogadores[nickname] e adiciona o Pokémon na lista.
    //O --> ?.add(pokemon) <-- usa o operador "safe call", ou seja:
    //Só tenta adicionar se jogadores[nickname] não for null.
}

    //OBSERVAÇÕES:
    //Esse mutableMapOf<String, MutableList<Pokemon>>() funciona como a estrutura central do jogo.
    //Ele guarda todos os jogadores e seus respectivos times
