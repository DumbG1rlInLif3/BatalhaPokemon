fun batalhar(nick1: String, nick2: String){
//Essa função recebe dois nicknames de jogadores e executa a lógica da batalha
//entre os seus times de Pokémon.

    val time1 = jogadores[nick1] ?: return
    val time2 = jogadores[nick2] ?: return
    //Usa o map --> jogadores <-- para pegar a lista de Pokémons de cada jogador.
    //Se algum dos dois não existir no map, a função retorna imediatamente
    //(nada acontece). Isso previne erros.

    val poder1 = time1.sumOf { it.poder }
    val poder2 = time2.sumOf { it.poder }
    //Usa --> sumOf <-- para somar os valores da propriedade poder de todos os Pokémons de cada jogador.
    //Resultado: dois números representando o poder total de cada time.

    println("\n⚔ BATALHA ENTRE $nick1 e $nick2!")
    println("$nick1: $poder1 de poder total")
    println("$nick2: $poder2 de poder total")
    //Mostra no console os jogadores e seus respectivos poderes totais.

    when {
        poder1 > poder2 -> println("🏆 $nick1 venceu a batalha!")
        poder2 > poder1 -> println("🏆 $nick2 venceu a batalha!")
        else -> println("🤝 Empate!")
    }
    //Usa when (um tipo de if-else inteligente) para comparar os poderes:
    //Quem tiver mais poder ganha.
    //Se for igual, dá empate.
}
