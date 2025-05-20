fun main() {
    println("👤 Jogador 1, digite seu nickname:")
    val nick1 = readln().trim()
    criarJogador(nick1)
    //Mostra uma mensagem no console pedindo o nickname do Jogador 1.
    //Lê a entrada do usuário (readln()), remove espaços antes/depois com --> trim() <-- e salva em nick1.
    //Chama a função criarJogador(nick1) para registrar o jogador num map

    println("👤 Jogador 2, digite seu nickname:")
    var nick2: String
    while (true) {
        nick2 = readln().trim()
        if (nick2 == nick1) {
            println("❗Esse nickname já está em uso. Escolha outro:")
        } else {
            break
        }
    }
    criarJogador(nick2)
    //Garante que o Jogador 2 tenha um nickname diferente do Jogador 1.
    //Se o nickname for repetido, mostra aviso e repete até que seja único.
    //Depois cria o segundo jogador com criarJogador(nick2).

    montarTime(nick1)
    montarTime(nick2)
    //abre menus ou coleta dados para cada jogador montar seu time de Pokémon, chamando a
    //função adicionarPokemon por dentro.

    exibirTime(nick1)
    exibirTime(nick2)
    //Mostra os times dos dois jogadores no console — talvez usando println()
    //com base no map jogadores[nickname].

    batalhar(nick1, nick2)
    //Chama a função principal da batalha entre os dois jogadores.
}

//OBSERVAÇÕES:
//MutableList<Pokemon> = a lista de Pokémons que ele possui.
//Esse map está funcionando como um banco de dados temporário na memória, onde é associado o nickname ao time.